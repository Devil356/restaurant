package model;

import java.time.LocalDateTime;

/*
Юзер должен голосовать за ресторан (id ресторана), в котором он сегодня желает обедать.
Только один голос учитывается. Если юзер меняет свое решение в тот же день, то до 11:00 он еще может его изменить.
 */

public class User {
    private boolean isVoted;
    private LocalDateTime voteTime;
    private int restaurantId;

    public User(boolean isVoted, LocalDateTime voteTime, int restaurantId) {
        this.isVoted = isVoted;
        this.voteTime = voteTime;
        this.restaurantId = restaurantId;
    }

    public boolean isVoted() {
        return isVoted;
    }

    public LocalDateTime getVoteTime() {
        return voteTime;
    }

    public int getRestaurantId() {
        return restaurantId;
    }
}
