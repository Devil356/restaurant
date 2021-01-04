package ru.arsenev.restaurant.web;

import org.springframework.beans.factory.annotation.Autowired;
import ru.arsenev.restaurant.model.Restaurant;
import org.springframework.web.bind.annotation.*;
import ru.arsenev.restaurant.service.AdminService;
import ru.arsenev.restaurant.web.util.SecurityUtil;

import java.util.List;

@RestController
public class AdminRestController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/restaurants")
    public List<Restaurant> getAll(){
        return adminService.getAll();
    }

    @PostMapping("/restaurant/{name}")
    public void createRestaurant(@PathVariable String name){
        adminService.createRestaurant(name, SecurityUtil.getAdminId());
    }

    @PutMapping("/restaurant/{id}")
    public void updateRestaurantMenu(@PathVariable Integer id, @RequestBody Restaurant restaurant){
        adminService.updateMenu(restaurant);
    }

}
