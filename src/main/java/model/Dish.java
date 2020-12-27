package model;

<<<<<<< HEAD
/*
Блюдо с названием и ценой.
 */

=======
>>>>>>> e45bb9c46db1017ad2ae10a59cae239a69c4e5d2
public class Dish {
    private String name;
    private double price;

    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
