package com.qf.dao;

import com.qf.pojo.OauthUser;

public interface OauthUserDao {

    //添加第三方登录用户的信息
    public void addOauthUser(OauthUser oauthUser);

    //判断数据库中是否保存过之前的登录信息
    public int getQQOauthUser(OauthUser oauthUser);
}
