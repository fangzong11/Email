package com.qf.dao;

import com.qf.pojo.Detail;

import java.util.List;

public interface DetailDao {
    //根据宠物类别获取所有的贴士
    List<Detail> getPetList(Integer id);
    //查看贴士内容
    Detail  getPetByID(Integer id);
    //查看数加一
    void updateViewCount(Detail detail);
}
