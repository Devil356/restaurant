package ru.arsenev.restaurant.model;

import javax.persistence.*;
import java.util.Objects;

/*
Ресторан, которым владеет определенный администратор. У каждого ресторана свое меню. @field users - количество
проголосовавших за ресторан людей.
 */
@Entity
@Table(name = "restaurants")
public class Restaurant {
    @Id
    @SequenceGenerator(
            name = "restaurants_seq",
            sequenceName = "restaurants_seq",
            allocationSize = 1,
            initialValue = 100000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "restaurants_seq"
    )
    private Integer id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "admin_id", nullable = false)
    private User admin;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinTable(
            name = "restaurants_menus",
            joinColumns = {@JoinColumn(name = "restaurant_id")},
            inverseJoinColumns = {@JoinColumn(name = "menu_id")}
    )
    private Menu menu;

    public Restaurant(){

    }
    public Restaurant(Integer id, String name, User admin) {
        this.id = id;
        this.name = name;
        this.admin = admin;
    }

    public Restaurant(String name, User admin) {
        this.name = name;
        this.admin = admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public User getAdmin() {
        return admin;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return admin.equals(that.admin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(admin);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", admin=" + admin.getId() +
                ", menu=" + menu +
                '}';
    }
}
