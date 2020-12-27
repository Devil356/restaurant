package model.user;

import model.Restaurant;

import java.util.List;

/*
-Администратор владеет несколькими ресторанами и может вводить новые рестораны.
-Каждый день, для каждого из ресторанов, администратор должен размещать новое меню
(2-5 позиций, название еды и цену).
 */

public class Admin extends AbstractNamedUser {

    /**
     * Рестораны, которыми владеет администратор
     */
    private List<Restaurant> restaurants;

    public Admin(Integer id, String name, String email) {
        super(id, name, email);
        this.restaurants = null;
    }

    public Admin(){

    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }
}
