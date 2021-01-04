package testData;

import ru.arsenev.restaurant.model.Role;
import ru.arsenev.restaurant.model.User;

public class AdminTestData {
    public static User generateAdmin() {
        return new User(100000, "Admin1", "admin1@gmail.com", Role.ADMIN);
    }

}
