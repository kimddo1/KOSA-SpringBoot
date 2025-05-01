package com.kosa.matjip.controller;

import com.kosa.matjip.domain.Review;
import com.kosa.matjip.service.ReviewService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
