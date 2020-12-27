package model;

/*
Блюдо с названием и ценой.
 */

public class Dish extends AbstractNamedEntity{
    private String name;
    private double price;

    public Dish(Integer id, String name, double price) {
        super(id, name);
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
