package com.qf.controller;

import com.qf.exception.UserException;
import com.qf.pojo.User;
import com.qf.service.UserService;
import com.qf.utils.HttpRequestUtil;
import com.qf.utils.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping("/api/user")
public class UserController {

    //发送验证码
    @RequestMapping("/send.json")
    @ResponseBody
    public void send(String username,HttpServletRequest request){
        int code = (int)((Math.random()*9+1)*100000);
        System.out.println("========================================="+code);
        //验证码存入session
        request.getSession().setAttribute(username,code);
        String url = "http://106.ihuyi.com/webservice/sms.php?method=Submit&";
        String param = "mobile="+username+"&account=C69957421&password=63e49333f3bf5a7f2abda8ff8b08eede&content=您的验证码是："+code+"。请不要把验证码泄露给其他人。";
        HttpRequestUtil.sendGet(url,param);
    }

    @Autowired
    private UserService userService;
    //用户注册
    @RequestMapping("/regist.json")
    @ResponseBody
    public Map<String,Object> regist(User user,int authCode,HttpServletRequest request){
        if((int)request.getSession().getAttribute(user.getUsername())==authCode){
            try {
                userService.addUser(user);
            } catch (UserException e) {
                e.printStackTrace();
                if (e.getMessage().equals("2")){
                    //用户名已注册
                    return JSONUtil.getStatus(2);
                }else {
                    //昵称重复
                    return JSONUtil.getStatus(3);
                }
            }
            //注册成功
            return JSONUtil.getStatus(1);
        }else{
            //验证码错误
            return JSONUtil.getStatus(0);
        }
    }

    //找回密码

    //用户登录
    @RequestMapping("/login.json")
    @ResponseBody
    public Map<String,Object> login(User user, HttpServletRequest request){
        User user1 = null;
        try {
            user1 = userService.getUser(user);
            request.getSession().setAttribute("user",user);
        } catch (UserException e) {
            e.printStackTrace();
            //用户名或密码错误
            return JSONUtil.getStatus(0);
        }
        //登陆成功
        return JSONUtil.getSuccessLogin(1,user1.getID());
    }

    //用户发布
    @RequestMapping("/publish.do")
    @ResponseBody
    public Map<String,Object> publish(MultipartFile[] images, String content){
        for (MultipartFile image : images) {

        }

        return null;
    }

}
