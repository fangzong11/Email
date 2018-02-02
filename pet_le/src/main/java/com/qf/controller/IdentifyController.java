package com.qf.controller;

import com.github.pagehelper.PageInfo;
import com.qf.pojo.UserInfo;
import com.qf.service.IdentifyService;
import com.qf.utils.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/api/identify")
public class IdentifyController {

    @Autowired
    private IdentifyService identifyService;

    @RequestMapping("/list.json")
    @ResponseBody
    public Map<String,Object> list(@RequestParam(defaultValue = "1") int pageNum){
        PageInfo<UserInfo> pageInfo =identifyService.getUserIdentifyList(pageNum,7);
        return JSONUtil.getSuccess(1,pageInfo.getList(),pageInfo.getPages());
    }
}
