package com.qf.service.impl;

import com.qf.dao.MyDetailDao;
import com.qf.pojo.User;
import com.qf.service.MyDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyDetailServiceImple implements MyDetailService {

    @Autowired
    private MyDetailDao myDetailDao;


    @Override
    public User getUserDetailById(Integer id) {
       User detail= myDetailDao.getUserDetailById(id);
        return detail;
    }
}
