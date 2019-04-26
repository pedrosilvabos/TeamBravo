package org.academiadecodigo.teambravo.services;

import org.academiadecodigo.teambravo.persistence.model.Location;
import org.academiadecodigo.teambravo.persistence.model.Skill;
import org.academiadecodigo.teambravo.persistence.model.User;

import java.util.List;

public interface UserService {


    User saveUser(User user);

    void deleteUser(Integer id);

    void deleteSkill(Integer id, Integer skId);

    void addSkill(Integer id, Integer skId);

    User getUserById(Integer id);

    List getUserSkills(Integer id);

    List<Skill> getAllSkills();

    Integer getUserRating(Integer id);

    List<Location> getAllLocations();

    List<User> getUsersBySkill(Skill skill);

    Skill getSkillById(Integer id);


}
