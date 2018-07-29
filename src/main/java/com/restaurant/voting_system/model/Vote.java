package com.restaurant.voting_system.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "votes", uniqueConstraints = {@UniqueConstraint(columnNames = {"restaurant_id", "date"}, name = "voters_unique_restaurant_data_idx")})
public class Vote extends AbstractEntity{

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id", nullable = false)
    @NotNull
    private Restaurant restaurant;

    @Column(name="number_of_votes", columnDefinition = "int default 0")
    private Long numberOfVotes;

    public Vote() {
    }

    public Vote(Integer id, Date date) {
        super(id, date);
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Long getNumberOfVotes() {
        return numberOfVotes;
    }

    public void setNumberOfVotes(Long numberOfVotes) {
        this.numberOfVotes = numberOfVotes;
    }
}
