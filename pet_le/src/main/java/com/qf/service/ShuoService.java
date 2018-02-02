package com.qf.service;

import com.github.pagehelper.PageInfo;
import com.qf.pojo.Shuo;

public interface ShuoService {

    public PageInfo<Shuo> getShuoList(int pageNo);

}
