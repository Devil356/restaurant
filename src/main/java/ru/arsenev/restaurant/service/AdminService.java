package ru.arsenev.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.arsenev.restaurant.exception.UnauthorizedException;
import ru.arsenev.restaurant.model.*;
import ru.arsenev.restaurant.repository.datajpa.AdminRepository;
import ru.arsenev.restaurant.repository.datajpa.DishRepository;
import ru.arsenev.restaurant.repository.datajpa.RestaurantRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Random;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private DishRepository dishRepository;

    @Autowired
    private RestaurantRepository restaurantRepository;

    public Restaurant createRestaurant(String restaurantName, Integer adminId) {
        User admin = adminRepository.getOne(adminId);
        if (!admin.getRoles().contains(Role.ADMIN)) {
            throw new UnauthorizedException("You're not admin");
        }
        Restaurant restaurant = new Restaurant(restaurantName, admin);
        restaurant.setMenu(generateMenu());
        return restaurantRepository.save(restaurant);
    }

    public Menu generateMenu() {
        Menu menu = new Menu();
        List<Dish> dishes = dishRepository.findAll();
        //While dishes size more than 5 remove items from list of dishes
        while (dishes.size() > 5) {
            int item = new Random().nextInt(dishes.size());
            dishes.remove(item);
        }
        menu.setDishes(new HashSet<>(dishes));
        return menu;
    }

    public void updateMenu(Restaurant restaurant) {
        Menu menu = generateMenu();
        restaurant.setMenu(menu);
        restaurantRepository.save(restaurant);
    }

    public List<Restaurant> getAll() {
        return restaurantRepository.findAll();
    }
}
