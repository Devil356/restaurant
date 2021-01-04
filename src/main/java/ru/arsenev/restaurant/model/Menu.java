package ru.arsenev.restaurant.model;

import javax.persistence.*;
import java.time.LocalDateTime;
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
    @JoinTable(
            name = "restaurants_menus",
            joinColumns = {@JoinColumn(name = "menu_id")},
            inverseJoinColumns = {@JoinColumn(name = "restaurant_id")}
    )
    private Restaurant restaurant;

    @Column(name = "created")
    private LocalDateTime created;

    public Menu(Integer id) {
        super(id);
        this.created = LocalDateTime.now();
    }

    public Menu(){
        this.created = LocalDateTime.now();
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
