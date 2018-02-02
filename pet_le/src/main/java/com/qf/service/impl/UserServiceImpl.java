package com.qf.service.impl;

import com.qf.dao.UserDao;
import com.qf.exception.UserException;
import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    //用户注册
    @Override
    public void addUser(User user) throws UserException {
        if(userDao.getUserByName(user.getUsername())>0) {
            throw new UserException("2");
        }else if(userDao.getUserByNickName(user.getNickname())>0){
            throw new UserException("3");
        }else{
            userDao.addUser(user);
        }
    }

    //用户登录
    @Override
    public User getUser(User user) throws UserException {
        User curUser = userDao.getUser(user);
        if(curUser == null){
            throw new UserException("2");
        }
        return curUser;
    }



}
