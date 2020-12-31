package repository;

import model.Dish;

public interface AdminRepository {

    void createRestaurant(String name);

    void createMenu();

    void addDishesToMenu(Integer menuId, Integer... dishesIds);

    void createDish(String name, double price);

}
