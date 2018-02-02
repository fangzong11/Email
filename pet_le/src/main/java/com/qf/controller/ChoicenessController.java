package com.qf.controller;

import com.github.pagehelper.PageInfo;
import com.qf.pojo.Shuo;
import com.qf.pojo.Slider;
import com.qf.service.ShuoService;
import com.qf.service.SliderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 首页 精选
 */
@Controller
@RequestMapping("/api")
public class ChoicenessController {


    @Autowired
    private ShuoService shuoService;

    @Autowired
    private SliderService sliderService;

    @RequestMapping("/choiceness.json")
    @ResponseBody
    public Map<String,Object> getIndex(@RequestParam(defaultValue = "1") int pageNum){
        PageInfo<Shuo> pageInfo = shuoService.getShuoList(pageNum);
        List<Slider> sliderList = sliderService.getSliderList();
        Map<String,Object> result = new HashMap<>();
        result.put("msgCode",1);
        Map<String,Object> data = new HashMap<>();
        data.put("slider",sliderList);
        Map<String,Object> userList = new HashMap<>();
        userList.put("pages",pageInfo.getPages());
        userList.put("list",pageInfo.getList());
        data.put("userList",userList);
        result.put("data",data);
        return result;
    }
}
