package ru.arsenev.restaurant.service;

import org.hibernate.Hibernate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.arsenev.restaurant.exception.UnauthorizedException;
import ru.arsenev.restaurant.model.*;
import ru.arsenev.restaurant.repository.datajpa.AdminRepository;
import ru.arsenev.restaurant.repository.datajpa.DishRepository;
import ru.arsenev.restaurant.repository.datajpa.MenuRepository;
import ru.arsenev.restaurant.repository.datajpa.RestaurantRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Random;

import static org.slf4j.LoggerFactory.getLogger;

@Service
public class AdminService {
    private static final Logger LOG = getLogger(AdminService.class);

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private DishRepository dishRepository;

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Autowired
    private MenuRepository menuRepository;

    public Restaurant createRestaurant(String restaurantName, Integer adminId) {
        LOG.debug("CREATE RESTAURANT...");
        User admin = adminRepository.getOne(adminId);
        LOG.debug("GET ADMIN WITH ID " + admin.getId());
        Restaurant restaurant = new Restaurant(restaurantName, admin);
        restaurant.setMenu(generateMenu());
        LOG.debug("SET MENU FOR RESTAURANT");
        Restaurant created = restaurantRepository.save(restaurant);
        LOG.debug("RESTAURANT WITH ID " + created.getId() + " WAS CREATED");
        return restaurantRepository.save(restaurant);
    }

    public Menu generateMenu() {
        LOG.debug("GENERATE NEW MENU...");
        Menu menu = new Menu();
        List<Dish> dishes = dishRepository.findAll();
        //While dishes size more than 5 remove items from list of dishes
        while (dishes.size() > 5) {
            int item = new Random().nextInt(dishes.size());
            dishes.remove(item);
        }
        menu.setDishes(new HashSet<>(dishes));
        Menu created = menuRepository.save(menu);
        LOG.debug("MENU WITH ID " + created.getId() + " WAS CREATED");
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
