package model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "votes")
public class Vote {
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "vote_time")
    private LocalDateTime voteTime;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "restaurant_id")
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
