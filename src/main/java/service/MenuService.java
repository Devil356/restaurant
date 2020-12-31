package service;

import model.Dish;
import repository.MenuRepository;

public class MenuService {
    private final MenuRepository repository;

    public MenuService(MenuRepository repository){
        this.repository = repository;
    }

    public void create(Integer restaurantId, Dish... dishes){

    }
}
