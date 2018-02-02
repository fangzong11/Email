package com.qf.service;

import com.github.pagehelper.PageInfo;
import com.qf.pojo.UserInfo;

public interface IdentifyService {

    PageInfo<UserInfo> getUserIdentifyList(int pageNum,int pageSize);
}
