package com.qf.service;

import com.qf.exception.UserException;
import com.qf.pojo.User;

public interface UserService {

    public void addUser(User user) throws UserException;

    public User getUser(User user) throws UserException;



}
