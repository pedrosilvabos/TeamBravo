package org.academiadecodigo.teambravo.persistence.dao.jpa;

import org.academiadecodigo.teambravo.persistence.dao.UserDao;
import org.academiadecodigo.teambravo.persistence.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class JpaUserDaoImpl extends GenericDao<User> implements UserDao {
    public JpaUserDaoImpl() {
        super(User.class);
    }


}
