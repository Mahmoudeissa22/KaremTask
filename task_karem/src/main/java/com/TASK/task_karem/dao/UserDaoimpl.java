package com.TASK.task_karem.dao;

import com.TASK.task_karem.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Transient;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDaoimpl implements UserDao{


   EntityManager entityManager;

    public UserDaoimpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public User findUserById(Integer theId) {
        return entityManager.find(User.class , theId);
    }

    @Override
    @Transactional
    public void deleteUser(Integer theId) {
        User theUser = entityManager.find(User.class , theId);

        entityManager.remove(theUser);
    }

    @Override
    public void update(User user) {
        entityManager.merge(user);
    }


}
