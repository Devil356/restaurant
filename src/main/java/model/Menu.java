package model;

import java.util.List;

/*
Меню, привязанное к определенному ресторану, с определенным списком блюд.
 */
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
    }

    public List<Dish> getDishes() {
        return dishes;
    }
}
