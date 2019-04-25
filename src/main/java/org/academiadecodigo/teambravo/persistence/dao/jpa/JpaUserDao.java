package org.academiadecodigo.teambravo.persistence.dao.jpa;

import org.academiadecodigo.teambravo.persistence.dao.UserDao;
import org.academiadecodigo.teambravo.persistence.model.User;

import java.util.List;

public class JpaUserDao extends GenericDao<User> implements UserDao {
    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById() {
        return null;
    }

    @Override
    public User saveOrUpdate(User modelObject) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
