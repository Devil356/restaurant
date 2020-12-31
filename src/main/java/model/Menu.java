package model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/*
Меню, привязанное к определенному ресторану, с определенным списком блюд.
 */
@Entity
@Table(name = "menus")
public class Menu extends AbstractEntity {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "menus_dishes",
            joinColumns = {@JoinColumn(name = "menu_id")},
            inverseJoinColumns = {@JoinColumn(name = "dish_id")}
    )
    private Set<Dish> dishes = new HashSet<>();

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    public Menu(Integer id, Set<Dish> dishes, Restaurant restaurant) {
        super(id);
        setDishes(dishes);
    }

    public Menu(){

    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Set<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(Set<Dish> dishes) {
        this.dishes = dishes;
    }
}
