package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.MyDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api/my")
public class MyDetailController {

    @Autowired
    private MyDetailService  detailService;

    @ResponseBody
    @RequestMapping("/detail.json")
    public Map<String,Object> getDetail(Integer id){
        System.out.println("++++============="+id);
       User detail= detailService.getUserDetailById(id);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("msgCode", 1);
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("detail",detail);
        map.put("data",data);
       return map;
    }
}
