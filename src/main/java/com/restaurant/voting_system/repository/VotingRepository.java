package com.restaurant.voting_system.repository;

import com.restaurant.voting_system.model.Vote;

public interface VotingRepository {
    Vote voteFor(Integer restaurantId);
}
