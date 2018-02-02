package com.qf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.dao.IdentifyDao;
import com.qf.pojo.UserInfo;
import com.qf.service.IdentifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdentifyServceImple implements IdentifyService{

    @Autowired
    private IdentifyDao identifyDao;

    @Override
    public PageInfo<UserInfo> getUserIdentifyList(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<UserInfo> list=identifyDao.getUserIdentifyList();
        PageInfo<UserInfo> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }
}
