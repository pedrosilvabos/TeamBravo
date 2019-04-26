package org.academiadecodigo.teambravo.persistence.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.LinkedList;
import java.util.List;

public class Location extends AbstractModel {

    private String name;

    private List<User> users = new LinkedList<>();

    public List<User> getUsers() {
        return users;
    }


    public void addUser(User user) {

        this.users.add(user);
        user.setLocation(this);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
