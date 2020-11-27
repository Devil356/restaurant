package model;

import java.util.List;

/*
Меню, привязанное к определенному ресторану, с определенным списком блюд.
 */

public class Menu {
    private Restaurant restaurant;
    private List<Dish> dishes;

    public Menu(Restaurant restaurant, List<Dish> dishes) {
        this.restaurant = restaurant;
        this.dishes = dishes;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public List<Dish> getDishes() {
        return dishes;
    }
}
