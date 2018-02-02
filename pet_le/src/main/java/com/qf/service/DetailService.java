package com.qf.service;

import com.github.pagehelper.PageInfo;
import com.qf.pojo.Detail;


public interface DetailService {

   PageInfo<Detail> getPetList(Integer id, int pageNum);

    void updateViewCount(Detail detail);

    Detail  getPetByID(Integer id);
}
