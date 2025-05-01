package com.kosa.matjip.mapper;

import com.kosa.matjip.domain.Menu;
import com.kosa.matjip.domain.Restaurant;
import com.kosa.matjip.domain.Review;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RestaurantMapper {
    // 맛집 리스트 가져오기
    List<Restaurant> findAllRestaurant();
    // 맛집 정보 가져오기
    Restaurant findRestaurant(int restaurantId);
    // 맛집 생성
    void createRestaurant(Restaurant restaurant);
    // 맛집 수정
    void updateRestaurant(Restaurant restaurant);
    // 맛집 삭제
    void deleteRestaurant(int id);
    // 리뷰 작성
    void createReview(Review review, int restaurantId);
    // 리뷰 삭제
    void deleteReview(int reviewId);
    // 맛집에 등록된 리뷰 가져오기
    List<Review> findReview(int restaurantId);
    // 맛집에 등록된 리뷰의 평균 별점 가져오기
    int findAvgScore(int restaurantId);

    // 메뉴 생성
    void createMenu(Menu menu);
}
