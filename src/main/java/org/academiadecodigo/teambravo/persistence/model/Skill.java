package org.academiadecodigo.teambravo.persistence.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Skill extends AbstractModel {

    private Integer Rating;
    private String name;

    @ManyToOne
    private User user;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public User getUser() {

        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getRating() {
        return Rating;
    }

    public void setRating(Integer rating) {
        Rating = rating;
    }
}
