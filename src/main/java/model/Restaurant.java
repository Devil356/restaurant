package model;

import javax.persistence.*;

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
    private User user;

    //Меню, представленное в данном ресторане
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "menu_id",nullable = false)
    private Menu menu;

    public Restaurant(){

    }
    public Restaurant(Integer id, String name, User user, Menu menu) {
        super(id, name);
        this.user = user;
        this.menu = menu;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public User getUser() {
        return user;
    }

    public Menu getMenu() {
        return menu;
    }

}
