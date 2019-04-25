package org.academiadecodigo.teambravo.persistence.dao.jpa;

import org.academiadecodigo.teambravo.persistence.dao.Dao;
import org.academiadecodigo.teambravo.persistence.model.Model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class GenericDao<T extends Model> implements Dao<T> {


    protected Class<T> modelType;

    @PersistenceContext
    protected EntityManager em;


    public void setEm(EntityManager em) {
        this.em = em;
    }
}
