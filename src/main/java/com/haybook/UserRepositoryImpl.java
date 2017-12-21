package com.haybook;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by Albert.sepian on 12/21/2017.
 */
@Transactional
@Repository
public class UserRepositoryImpl implements UserRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public void create(User user) {
        entityManager.persist(user);
    }

    public void delete(User u) {
        entityManager.remove(u);
    }

    @Override
    public User getbyid(long id) {
        return entityManager.find(User.class, id);
    }
}
