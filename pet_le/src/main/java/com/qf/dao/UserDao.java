package com.qf.dao;

import com.qf.pojo.User;

public interface UserDao {

    public void addUser(User user);

    public int getUserByName(String username);

    public int getUserByNickName(String nickname);

    public User getUser(User user);


}
