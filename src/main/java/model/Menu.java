package model;

import java.util.List;

/*
Меню, привязанное к определенному ресторану, с определенным списком блюд.
 */
<<<<<<< HEAD
public class Menu {
    private int restaurantId;
    private List<Dish> dishes;

    public Menu(int restaurantId, List<Dish> dishes) {
        this.restaurantId = restaurantId;
        this.dishes = dishes;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
=======

public class Menu {
    private Restaurant restaurant;
    private List<Dish> dishes;

    public Menu(Restaurant restaurant, List<Dish> dishes) {
        this.restaurant = restaurant;
        this.dishes = dishes;
    }

    public Restaurant getRestaurant() {
        return restaurant;
>>>>>>> e45bb9c46db1017ad2ae10a59cae239a69c4e5d2
    }

    public List<Dish> getDishes() {
        return dishes;
    }
}
