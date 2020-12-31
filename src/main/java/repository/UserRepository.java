package repository;

import model.Restaurant;
import model.Vote;

public interface UserRepository {
    void vote(Restaurant restaurant);

    void changeVote(Vote vote, Restaurant restaurant);
}
