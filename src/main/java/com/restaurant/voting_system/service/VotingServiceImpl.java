package com.restaurant.voting_system.service;

import com.restaurant.voting_system.model.User;
import com.restaurant.voting_system.model.Vote;
import com.restaurant.voting_system.repository.VotingRepository;
import com.restaurant.voting_system.util.exception.NotFoundException;

public class VotingServiceImpl implements VotingService {
    private final VotingRepository repository;

    public VotingServiceImpl(VotingRepository repository) {
        this.repository = repository;
    }

    @Override
    public Vote voteFor(Integer restaurantId, User user) {
        if (user.canVote()) {
            user.canVote(false);
            return repository.voteFor(restaurantId);
        } else {
            throw new NotFoundException("User " + user.getName() + " already vote");
        }
    }
}
