package model;

import javax.persistence.*;
import java.util.Objects;

/*
Ресторан, которым владеет определенный администратор. У каждого ресторана свое меню. @field users - количество
проголосовавших за ресторан людей.
 */
@Entity
@Table(name = "restaurants")
public class Restaurant extends AbstractNamedEntity {

    //Админ, который владеет этим рестораном
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "admin_id", nullable = false)
    private User admin;

    //Меню, представленное в данном ресторане
    @OneToOne(fetch = FetchType.EAGER)
    private Menu menu;

    public Restaurant(){

    }
    public Restaurant(Integer id, String name, User admin, Menu menu) {
        super(id, name);
        this.admin = admin;
        this.menu = menu;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public User getAdmin() {
        return admin;
    }

    public Menu getMenu() {
        return menu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return admin.equals(that.admin) && menu.equals(that.menu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(admin, menu);
    }
}
