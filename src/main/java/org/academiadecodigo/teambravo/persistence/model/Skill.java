package org.academiadecodigo.teambravo.persistence.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class Skill extends AbstractModel {

    private Integer Rating;
    private String name;

    @ManyToMany
    private List<User> users;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public List<User> getUser() {

        return users;
    }

    public void setUser(List<User> user) {
        this.users = user;
    }

    public void addUser(User user){
        this.users.add(user);
    }

    public Integer getRating() {
        return Rating;
    }

    public void setRating(Integer rating) {
        Rating = rating;
    }
}
