package ru.arsenev.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.arsenev.restaurant.model.Restaurant;
import ru.arsenev.restaurant.repository.datajpa.RestaurantRepository;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public Restaurant get(Integer id){
        return restaurantRepository.getOne(id);
    }
}
