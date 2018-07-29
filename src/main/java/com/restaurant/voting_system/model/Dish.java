package com.restaurant.voting_system.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.util.Date;

@Entity
@Table(name = "dishes", uniqueConstraints = {@UniqueConstraint(columnNames = {"restaurant_id", "date"}, name = "dishes_unique_person_datetime_idx")})
public class Dish extends AbstractNamedEntity{
    public Dish() {
    }

    @Column(name = "price", columnDefinition = "int default 0")
    private int price;

    public Dish(Integer id, String dishName, int price) {
        super(id, dishName);
        this.price = price;
    }

    public Dish(Integer id, String dishName, int price, Date date) {
        super(id, dishName, date);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
