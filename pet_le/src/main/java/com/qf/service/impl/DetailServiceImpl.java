package com.qf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.dao.DetailDao;

import com.qf.pojo.Detail;
import com.qf.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DetailServiceImpl implements DetailService {

    @Autowired
    private DetailDao detailDao;

    public PageInfo<Detail> getPetList(Integer id, int pageNum) {
        PageHelper.startPage(pageNum,5);
        List<Detail> detailList = detailDao.getPetList(id);
        PageInfo<Detail> pageInfo=new PageInfo<Detail>(detailList);
        return pageInfo;
    }

    public void updateViewCount(Detail detail) {

        detailDao.updateViewCount(detail);
    }

    public Detail getPetByID(Integer id) {
        Detail detail= detailDao.getPetByID(id);
        return detail;
    }
}
