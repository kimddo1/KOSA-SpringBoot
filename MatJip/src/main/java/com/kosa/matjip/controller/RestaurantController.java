package com.kosa.matjip.controller;

import com.kosa.matjip.domain.Restaurant;
import com.kosa.matjip.service.RestaurantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class RestaurantController {
    private RestaurantService resService;

    public RestaurantController(RestaurantService restaurantService) {
        this.resService = restaurantService;
    }

    @GetMapping("/restaurants")
    public List<Restaurant> findAllRestaurant() {
        return resService.findAll();
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant retrieveRes(@PathVariable int id) {
        return resService.findOne(id);
    }

    @PostMapping("/restaurants")
    public void createRestaurant(@RequestBody Restaurant restaurant) {
        resService.save(restaurant);

    }

}
