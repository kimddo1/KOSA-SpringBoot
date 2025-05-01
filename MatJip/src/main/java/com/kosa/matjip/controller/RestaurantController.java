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
    private RestaurantService service;

    public RestaurantController(RestaurantService restaurantService) {
        this.service = restaurantService;
    }

    @GetMapping("/restaurant")
    public List<Restaurant> findAllRestaurant() {
        return service.findAll();
    }

    @GetMapping("/restaurant/{id}")
    public Restaurant retrieveRes(@PathVariable int id) {
        return service.findOne(id);
    }

    @PostMapping("/restaurant")
    public void createRestaurant(@RequestBody Restaurant restaurant) {
        service.save(restaurant);
    }

    @PutMapping("/restaurant")
    public void updateRestaurant(@RequestBody Restaurant restaurant) {
        service.update(restaurant);
    }

    @DeleteMapping("/restaurant/{id}")
    public void deleteRestaurant(@PathVariable int id) {
        service.delete(id);
    }


}
