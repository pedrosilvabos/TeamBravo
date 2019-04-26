package org.academiadecodigo.teambravo.persistence.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "skills")
public class Skill extends AbstractModel {

    private String skillName;

    @ManyToMany(mappedBy = "skills", fetch = FetchType.LAZY)
    private List<User> users;

    public void setName(String name) {
        this.skillName = name;
    }

    public String getName() {
        return skillName;
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


}
