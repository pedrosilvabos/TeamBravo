package org.academiadecodigo.teambravo.persistence.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorColumn(name = "skill_id")
public class Skill extends AbstractModel {


    private String name;

    @ManyToOne
    private User user;

    public String getName() {
        return name;
    }


    public User getUser() {

        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setName(String name) {
        this.name = name;
    }
}
