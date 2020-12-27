package model;

import java.util.List;

/*
Меню, привязанное к определенному ресторану, с определенным списком блюд.
 */
public class Menu extends AbstractEntity{
    private Integer restaurantId;
    private List<Dish> dishes;

    public Menu(Integer id, Integer restaurantId, List<Dish> dishes) {
        super(id);
        this.restaurantId = restaurantId;
        this.dishes = dishes;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public List<Dish> getDishes() {
        return dishes;
    }
}
