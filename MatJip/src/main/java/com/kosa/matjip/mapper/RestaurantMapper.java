package com.kosa.matjip.mapper;

import com.kosa.matjip.domain.Menu;
import com.kosa.matjip.domain.Restaurant;
import com.kosa.matjip.domain.Review;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RestaurantMapper {
    // 맛집 리스트 가져오기
    public List<Restaurant> findAllRestaurant();
    // 맛집 정보 가져오기
    public Restaurant findRestaurant(int restaurantId);
    // 맛집 생성
    public void createRestaurant(Restaurant restaurant);
    // 맛집 수정
    public void updateRestaurant(Restaurant restaurant);
    // 맛집 삭제
    public void deleteRestaurant(Restaurant restaurant);
    // 리뷰 작성
    public void createReview(Review review, int restaurantId);
    // 리뷰 삭제
    public void deleteReview(int reviewId);
    // 맛집에 등록된 리뷰 가져오기
    public List<Review> findReview(int restaurantId);
    // 맛집에 등록된 리뷰의 평균 별점 가져오기
    public int findAvgScore(int restaurantId);


    //    public Restaurant findMenu(int menuId);    // 요건 없어도 될듯요
    // 메뉴 생성
    public void createMenu(Menu menu, int restaurantId);
}
