package model;

import javax.persistence.*;
import java.util.List;

/*
Блюдо с названием и ценой.
 */
@Entity
@Table(name = "dishes")
public class Dish extends AbstractNamedEntity{
    @Column(name = "price")
    private double price;

    @ManyToMany
    private List<Menu> menus;

    public Dish(){

    }
    public Dish(Integer id, String name, double price) {
        super(id, name);
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
