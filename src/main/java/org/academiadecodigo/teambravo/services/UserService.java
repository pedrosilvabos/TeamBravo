package org.academiadecodigo.teambravo.services;

import org.academiadecodigo.teambravo.persistence.model.Skill;
import org.academiadecodigo.teambravo.persistence.model.User;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Map;

public interface UserService {


    User saveUser(User user);

    void deleteUser(Integer id);

    void deleteSkill(Integer id, Integer skId);

    void addSkill(Integer id,Integer skId );

    User getUserById(Integer id);

    List getUserSkills(Integer id);

    List<Skill> getAllSkills();

    Integer getUserRating(Integer id);







}
