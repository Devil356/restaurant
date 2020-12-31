package model;

import java.time.LocalDateTime;
public class Vote {
    private Integer userId;
    private LocalDateTime voteTime;
    private Restaurant restaurant;

    public Vote() {

    }

    public Vote(Integer userId, LocalDateTime voteTime, Restaurant restaurant) {
        this.userId = userId;
        this.voteTime = voteTime;
        this.restaurant = restaurant;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public LocalDateTime getVoteTime() {
        return voteTime;
    }

    public void setVoteTime(LocalDateTime voteTime) {
        this.voteTime = voteTime;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }
}
