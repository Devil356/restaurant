package model;

import java.util.List;

/*
Ресторан, которым владеет определенный администратор. У каждого ресторана свое меню. @field users - количество
проголосовавших за ресторан людей.
 */

public class Restaurant {
    private int id;

    //Админ, который владеет этим рестораном
    private Admin admin;

    //Меню, представленное в данном ресторане
    private Menu menu;

    //Список пользователей, проголосовавших за ресторан
    private List<User> users;

    public Restaurant(Admin admin, Menu menu, List<User> users) {
        this.admin = admin;
        this.menu = menu;
        this.users = users;
    }

    public Admin getAdmin() {
        return admin;
    }

    public Menu getMenu() {
        return menu;
    }

    public List<User> getUsers() {
        return users;
    }

    public int getId() {
        return id;
    }
}
