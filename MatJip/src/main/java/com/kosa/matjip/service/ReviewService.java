package com.kosa.matjip.service;

import com.kosa.matjip.domain.Review;
import com.kosa.matjip.mapper.RestaurantMapper;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    private RestaurantMapper mapper;

    public ReviewService(RestaurantMapper mapper) {
        this.mapper = mapper;
    }

    public void createReview(Review review) {
        mapper.createReview(review);
    }

}
