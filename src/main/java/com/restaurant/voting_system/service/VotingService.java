package com.restaurant.voting_system.service;

import com.restaurant.voting_system.model.User;
import com.restaurant.voting_system.model.Vote;

public interface VotingService {
    Vote voteFor(Integer restaurantId, User user);
}
