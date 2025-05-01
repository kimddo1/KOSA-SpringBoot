package com.kosa.matjip.service;

import com.kosa.matjip.domain.Restaurant;
import com.kosa.matjip.mapper.RestaurantMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class RestaurantService {
    private RestaurantMapper resMapper;

    public RestaurantService(RestaurantMapper resMapper) {
        this.resMapper = resMapper;}

    public List<Restaurant> findAll() {
        return resMapper.findAllRestaurant();
    }

    public Restaurant findOne(@PathVariable int id) {
        return resMapper.findRestaurant(id);
    }

    public void save(Restaurant restaurant) {
        resMapper.createRestaurant(restaurant);
    }

}
