package testData;

import ru.arsenev.restaurant.model.Restaurant;

import java.util.List;

public class RestaurantTestData {

    public static Restaurant generateRestaurant() {
        return new Restaurant(null, "First Restaurant", AdminTestData.generateAdmin());
    }
}
