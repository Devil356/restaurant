package model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/*
Блюдо с названием и ценой.
 */
@Entity
@Table(name = "dishes")
public class Dish extends AbstractNamedEntity {
    //стоимость блюда
    @Column(name = "price")
    private double price;

    //меню, в котором это блюдо будет представлено
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "menus_dishes",
            joinColumns = {@JoinColumn(name = "dish_id")},
            inverseJoinColumns = {@JoinColumn(name = "menu_id")}
    )
    private Set<Menu> menus = new HashSet<>();

    public Dish() {

    }

    public Dish(Integer id, String name, double price, Set<Menu> menus) {
        super(id, name);
        this.price = price;
        this.menus = menus;
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
