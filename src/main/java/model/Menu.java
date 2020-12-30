package model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Arrays;
import java.util.List;

/*
Меню, привязанное к определенному ресторану, с определенным списком блюд.
 */
@Entity
@Table(name = "menus")
public class Menu extends AbstractEntity {

    @ManyToMany
    private List<Dish> dishes;

    public Menu(Integer id, Dish... dishes) {
        super(id);
        if (dishes.length > 0) {
            this.dishes.addAll(Arrays.asList(dishes));
        }
    }

    public Menu(){

    }
    public Menu change(Integer restaurantId, Dish... dishes) {
        return new Menu(restaurantId, dishes);
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public List<Dish> getDishes() {
        return dishes;
    }
}
