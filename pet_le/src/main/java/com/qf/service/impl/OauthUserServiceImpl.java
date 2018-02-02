package com.qf.service.impl;

import com.qf.dao.OauthUserDao;
import com.qf.pojo.OauthUser;
import com.qf.service.OauthUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OauthUserServiceImpl implements OauthUserService {

    @Autowired
    private OauthUserDao oauthUserDao;

    @Override
    public void addOauthUser(OauthUser oauthUser) {
        if (oauthUserDao.getQQOauthUser(oauthUser)>0){

        }else{
            oauthUserDao.addOauthUser(oauthUser);
        }
    }
}
