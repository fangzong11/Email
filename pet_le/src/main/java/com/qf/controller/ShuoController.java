package com.qf.controller;

import com.github.pagehelper.PageInfo;
import com.qf.pojo.Shuo;
import com.qf.service.ShuoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api")
public class ShuoController {

    @Autowired
    private ShuoService shuoService;
    //说说列表
    @RequestMapping("/shuo.json")
    @ResponseBody
    public Map<String,Object> list(int pageNum){
        PageInfo<Shuo> pageInfo = shuoService.getShuoList(pageNum);
        Map<String,Object> result = new HashMap<>();
        result.put("msgCode",1);
        Map<String,Object> data = new HashMap<>();
        data.put("pages",pageInfo.getPages());
        data.put("list",pageInfo.getList());
        result.put("data",data);
        return result;
    }
}
