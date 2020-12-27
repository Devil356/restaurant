package model;

import model.user.Admin;
import model.user.User;

import java.util.List;

/*
Ресторан, которым владеет определенный администратор. У каждого ресторана свое меню. @field users - количество
проголосовавших за ресторан людей.
 */

public class Restaurant extends AbstractNamedEntity {

    //Админ, который владеет этим рестораном
    private Admin admin;

    //Меню, представленное в данном ресторане
    private Menu menu;

    //Список пользователей, проголосовавших за ресторан
    private List<Integer> users;

    public Restaurant(Integer id, String name, Admin admin, Menu menu) {
        super(id, name);
        this.admin = admin;
        this.menu = menu;
        this.users = null;
    }

    public Admin getAdmin() {
        return admin;
    }

    public Menu getMenu() {
        return menu;
    }

    public List<Integer> getUsers() {
        return users;
    }

}
