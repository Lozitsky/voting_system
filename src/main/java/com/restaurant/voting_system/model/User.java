package com.restaurant.voting_system.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "persons", uniqueConstraints = {@UniqueConstraint(columnNames = "email", name = "users_unique_email_idx")})
public class User extends Person {
    @Column(name = "canVote")
    private Boolean canVote;

    public User() {
    }

    public User(Integer id, String name, String email, String password, boolean enabled, Date registered, Set<Role> roles) {
        super(id, name, email, password, enabled, registered, roles);
    }

    public Boolean canVote() {
        return canVote;
    }

    public void canVote(Boolean canVote) {
        this.canVote = canVote;
    }
}
