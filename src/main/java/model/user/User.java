package model.user;

import java.time.LocalDateTime;

/*
Юзер должен голосовать за ресторан (id ресторана), в котором он сегодня желает обедать.
Только один голос учитывается. Если юзер меняет свое решение в тот же день, то до 11:00 он еще может его изменить.
 */

public class User extends AbstractUser {

    private LocalDateTime voteTime;

    private Integer restaurantId;

    public User(Integer id, String name, String email) {
        super(id, name, email);
    }

    public User(){

    }

    public void vote(Integer restaurantId, LocalDateTime voteTime) {
        this.voteTime = voteTime;
        this.restaurantId = restaurantId;
    }

    public boolean isVoted() {
        return restaurantId != null;
    }

    public LocalDateTime getVoteTime() {
        return voteTime;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

}
