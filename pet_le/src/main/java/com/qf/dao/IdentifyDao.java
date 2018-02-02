package com.qf.dao;

import com.qf.pojo.UserInfo;

import java.util.List;

public interface IdentifyDao {

    //获取认证号
    List<UserInfo> getUserIdentifyList();
}
