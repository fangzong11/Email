package com.qf.controller;

import com.qf.pojo.OauthUser;
import com.qf.service.OauthUserService;
import com.qq.connect.QQConnectException;
import com.qq.connect.api.OpenID;
import com.qq.connect.api.qzone.UserInfo;
import com.qq.connect.javabeans.AccessToken;
import com.qq.connect.javabeans.qzone.UserInfoBean;
import com.qq.connect.oauth.Oauth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 第三方登陆---------->>>>>>>>QQ
 */
@Controller
@RequestMapping("/api/qq")
public class QQLoginController {

    @RequestMapping("/login.do")
    public void login(HttpServletRequest request, HttpServletResponse response){
        try {
            response.sendRedirect(new Oauth().getAuthorizeURL(request));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (QQConnectException e) {
            e.printStackTrace();
        }
    }

    @Autowired
    private OauthUserService oauthUserService;

    @RequestMapping("/afterlogin.do")
    public String afterLogin(HttpServletRequest request, HttpServletResponse response){
        try {
            AccessToken accessTokenObj = (new Oauth()).getAccessTokenByRequest(request);
            String accessToken = null,openID = null;

            long tokenExpireIn = 0L;

            if (accessTokenObj.getAccessToken().equals("")){
                //我们的网站被CSRF攻击了或者用户取消了授权
                //做一些数据统计工作
                System.out.print("没有获取到响应参数");
            }else {
                accessToken = accessTokenObj.getAccessToken();
                //获取accessToken的有效期，单位为秒
                tokenExpireIn = accessTokenObj.getExpireIn();

                // 利用获取到的accessToken 去获取当前用的openid -------- start
                OpenID openIDObj =  new OpenID(accessToken);
                openID = openIDObj.getUserOpenID();
                // 利用获取到的accessToken 去获取当前用户的openid --------- end


                OauthUser oauthUser = new OauthUser("qq", openID, accessToken, tokenExpireIn);
                oauthUserService.addOauthUser(oauthUser);


                //利用获取到的accessToken,openid 去获取用户在Qzone的昵称等信息
                UserInfo qzoneUserInfo = new UserInfo(accessToken, openID);
                UserInfoBean userInfoBean = qzoneUserInfo.getUserInfo();
                if (userInfoBean.getRet() == 0) {
                    //获取用户昵称
                    userInfoBean.getNickname();
                    //获取用户性别 - 男 女
                    userInfoBean.getGender();
                    //用户头像
                    //userInfoBean.getAvatar().getAvatarURL30();
                    userInfoBean.getAvatar().getAvatarURL50();
                    //userInfoBean.getAvatar().getAvatarURL100();
                } else {
                    //out.println("很抱歉，我们没能正确获取到您的信息，原因是： " + userInfoBean.getMsg());
                }
            }
        } catch (QQConnectException e) {
            e.printStackTrace();
        }
        return null;
    }
}
