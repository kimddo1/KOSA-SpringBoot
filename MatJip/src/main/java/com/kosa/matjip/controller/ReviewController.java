package com.kosa.matjip.controller;

import com.kosa.matjip.domain.Review;
import com.kosa.matjip.service.ReviewService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReviewController {
    private ReviewService service;

    public ReviewController(ReviewService reviewService) {
        this.service = reviewService;
    }

    @PostMapping("/review")
    public void createReview(@RequestBody Review review) {
        service.createReview(review);
    }

    @DeleteMapping("/review/{id}")
    public void deleteReview(@PathVariable int id) {
        service.deleteReview(id);
    }
}
