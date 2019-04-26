package org.academiadecodigo.teambravo.services;

import org.academiadecodigo.teambravo.persistence.dao.SkillDao;
import org.academiadecodigo.teambravo.persistence.dao.UserDao;
import org.academiadecodigo.teambravo.persistence.model.Skill;
import org.academiadecodigo.teambravo.persistence.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    private SkillDao skillDao;


    public UserDao getUserDao() {
        return userDao;
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public SkillDao getSkillDao() {
        return skillDao;
    }

    @Autowired
    public void setSkillDao(SkillDao skillDao) {
        this.skillDao = skillDao;
    }


    @Transactional
    @Override
    public User saveUser(User user) {
        return userDao.saveOrUpdate(user);
    }

    @Transactional
    @Override
    public void deleteUser(Integer id) {

        User user = userDao.findById(id);

        if(user == null){
            //throw exception
        }

        userDao.delete(id);
    }

    @Transactional
    @Override
    public void deleteSkill(Integer id, Integer skId) {

        User user = userDao.findById(id);

        //exception if null
        //implement later


    }


    @Transactional
    @Override
    public void addSkill(Integer id, Integer skId) {

        User user = userDao.findById(id);

        user.addSkill(skillDao.findById(skId), 0);
        //see this shit up


        userDao.saveOrUpdate(user);

    }

    @Transactional
    @Override
    public User getUserById(Integer id) {
        return userDao.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Skill> getUserSkills(Integer id) {
        return userDao.findById(id).getSkills();
    }

    @Transactional
    @Override
    public List<Skill> getAllSkills() {
        return skillDao.findAll();
    }


    @Transactional
    @Override
    public Integer getUserRating(Integer id) {
        return userDao.findById(id).getRating();
    }
}
