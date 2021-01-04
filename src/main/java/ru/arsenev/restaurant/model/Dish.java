package ru.arsenev.restaurant.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/*
Блюдо с названием и ценой.
 */
@Entity
@Table(name = "dishes")
public class Dish extends AbstractNamedEntity {
    @Column(name = "price")
    private double price;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "menus_dishes",
            joinColumns = {@JoinColumn(name = "dish_id")},
            inverseJoinColumns = {@JoinColumn(name = "menu_id")}
    )
    private Set<Menu> menus = new HashSet<>();

    public Dish() {

    }

    public Dish(Integer id, String name, double price){
        super(id, name);
        this.price = price;
    }

    public Dish(String name, double price){
        setName(name);
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public Set<Menu> getMenu() {
        return menus;
    }

    public void setMenu(Set<Menu> menus) {
        this.menus = menus;
    }
}
