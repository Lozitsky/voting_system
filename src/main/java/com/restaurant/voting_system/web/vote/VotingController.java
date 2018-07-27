package com.restaurant.voting_system.web.vote;

import com.restaurant.voting_system.model.User;
import com.restaurant.voting_system.model.Vote;
import com.restaurant.voting_system.service.VotingService;
import org.springframework.stereotype.Controller;

@Controller
public class VotingController {

private final VotingService service;

    public VotingController(VotingService service) {
        this.service = service;
    }

    public Vote voteFor(Integer restaurantId, User user) {
        return service.voteFor(restaurantId, user);
    }
}
