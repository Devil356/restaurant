package model;

import java.util.List;

/*
Меню, привязанное к определенному ресторану, с определенным списком блюд.
 */
public class Menu extends AbstractEntity{
    private List<Dish> dishes;

    public Menu(Integer id, List<Dish> dishes) {
        super(id);
        this.dishes = dishes;
    }

    public List<Dish> getDishes() {
        return dishes;
    }
}
