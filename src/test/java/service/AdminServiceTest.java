package service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.arsenev.restaurant.model.Restaurant;
import ru.arsenev.restaurant.service.AdminService;
import ru.arsenev.restaurant.service.RestaurantService;
import testData.RestaurantTestData;

public class AdminServiceTest extends AbstractServiceClass {

    @Autowired
    private AdminService adminService;

    @Autowired
    private RestaurantService restaurantService;

    @Test
    public void createRestaurant(){
        System.out.println("ENTERING IN METHOD");
        Restaurant created = adminService.createRestaurant("First Restaurant", 100000);
        int newId = created.getId();
        Restaurant newRestaurant = RestaurantTestData.generateRestaurant();
        newRestaurant.setId(newId);
        Assert.assertEquals(created, newRestaurant);
        Assert.assertEquals(newRestaurant, restaurantService.get(newId));
    }
}
