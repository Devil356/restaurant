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
public class Menu {
    @Id
    @SequenceGenerator(
            name = "menus_seq",
            sequenceName = "menus_seq",
            allocationSize = 1,
            initialValue = 100000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "menus_seq"
    )
    private Integer id;

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
    private final LocalDateTime created;

    public Menu(Integer id) {
        this.id = id;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", dishes=" + dishes +
                ", restaurant=" + restaurant.getId() +
                ", created=" + created +
                '}';
    }
}
