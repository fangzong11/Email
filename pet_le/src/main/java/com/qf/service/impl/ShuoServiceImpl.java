package com.qf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.dao.ShuoDao;
import com.qf.pojo.Shuo;
import com.qf.service.ShuoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShuoServiceImpl implements ShuoService {

    @Autowired
    private ShuoDao shuoDao;

    @Override
    public PageInfo<Shuo> getShuoList(int pageNo) {
        PageHelper.startPage(pageNo,5,"id desc");
        List<Shuo> shuoList = shuoDao.getShuoList();
        PageInfo<Shuo> pageInfo = new PageInfo<>(shuoList);
        return pageInfo;
    }

}
