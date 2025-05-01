package com.kosa.matjip.service;

import com.kosa.matjip.domain.Restaurant;
import com.kosa.matjip.mapper.RestaurantMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class RestaurantService {
    private RestaurantMapper mapper;

    public RestaurantService(RestaurantMapper mapper) {
        this.mapper = mapper;
    }

    public List<Restaurant> findAll() {
        return mapper.findAllRestaurant();
    }

    public Restaurant findOne(@PathVariable int id) {
        return mapper.findRestaurant(id);
    }

    public void save(Restaurant restaurant) {
        mapper.createRestaurant(restaurant);
    }

}
