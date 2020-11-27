package model;

import java.util.List;

/*
-Администратор владеет несколькими ресторанами и может вводить новые рестораны.
-Каждый день, для каждого из ресторанов, администратор должен размещать новое меню
(2-5 позиций, название еды и цену).
 */

public class Admin {
    private int id;

    //Рестораны, которыми владеет админ
    private List<Restaurant> restaurants;

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public int getId() {
        return id;
    }
}
