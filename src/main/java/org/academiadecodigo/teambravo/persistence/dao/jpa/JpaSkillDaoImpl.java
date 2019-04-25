package org.academiadecodigo.teambravo.persistence.dao.jpa;

import org.academiadecodigo.teambravo.persistence.dao.Dao;
import org.academiadecodigo.teambravo.persistence.dao.SkillDao;
import org.academiadecodigo.teambravo.persistence.model.Skill;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class JpaSkillDaoImpl extends GenericDao<Skill> implements SkillDao {


    public JpaSkillDaoImpl() {
        super(Skill.class);
    }
}
