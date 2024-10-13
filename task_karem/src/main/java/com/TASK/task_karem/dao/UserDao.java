package com.TASK.task_karem.dao;

import com.TASK.task_karem.entity.User;

public interface UserDao {

    void save (User user);

    User findUserById (Integer theId);

    void deleteUser (Integer theId);

    void update (User user);
}
