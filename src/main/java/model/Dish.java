package model;

/*
Блюдо с названием и ценой.
 */

public class Dish extends AbstractNamedEntity{
    private double price;

    public Dish(Integer id, String name, double price) {
        super(id, name);
        this.price = price;
    }


    public double getPrice() {
        return price;
    }
}
