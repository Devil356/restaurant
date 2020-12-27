package model;

<<<<<<< HEAD
import model.user.Admin;
import model.user.User;

=======
>>>>>>> e45bb9c46db1017ad2ae10a59cae239a69c4e5d2
import java.util.List;

/*
Ресторан, которым владеет определенный администратор. У каждого ресторана свое меню. @field users - количество
проголосовавших за ресторан людей.
 */

<<<<<<< HEAD
public class Restaurant extends AbstractEntity{

    //Админ, который владеет этим рестораном
    private Admin admin;

    //Меню, представленное в данном ресторане
    private Menu menu;

    //Список пользователей, проголосовавших за ресторан
    private List<User> users;

    public Restaurant(Integer id, String name, Admin admin, Menu menu, List<User> users) {
        super(id, name);
=======
public class Restaurant {
    private int id;
    private Admin admin;
    private Menu menu;
    private List<User> users;

    public Restaurant(Admin admin, Menu menu, List<User> users) {
>>>>>>> e45bb9c46db1017ad2ae10a59cae239a69c4e5d2
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

<<<<<<< HEAD
=======
    public int getId() {
        return id;
    }
>>>>>>> e45bb9c46db1017ad2ae10a59cae239a69c4e5d2
}
