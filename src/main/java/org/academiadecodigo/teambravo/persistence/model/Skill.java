package org.academiadecodigo.teambravo.persistence.model;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

public class Skill extends AbstractModel {

    private String skillName;

    private List<User> users = new LinkedList<>();

    public void setName(String name) {
        this.skillName = name;
    }

    public String getName() {
        return skillName;
    }


    public List<User> getUser() {

        return users;
    }

    public void setUser(User user) {
        users.add(user);
    }

    public void addUser(User user){
        this.users.add(user);
    }

    @Override
    public String toString() {
        return "Skill{" +
                "skillName='" + skillName + '\'' +
                '}';
    }
}
