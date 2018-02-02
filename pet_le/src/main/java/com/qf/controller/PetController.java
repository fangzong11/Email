package com.qf.controller;

import com.github.pagehelper.PageInfo;
import com.qf.pojo.Detail;
import com.qf.service.DetailService;
import com.qf.utils.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;


@Controller
@RequestMapping("/api/tip")
public class PetController {

    @Autowired
    private DetailService detailService;
    //根据类别查看所有的贴士
    @RequestMapping("/list.json")
    @ResponseBody
    public Map<String,Object>  list(Integer id,@RequestParam(defaultValue = "1") int pageNum){
        PageInfo<Detail> pageInfo = detailService.getPetList(id,pageNum);
        return  JSONUtil.getSuccess(1,pageInfo.getList(),pageInfo.getPages());

    }
    //查看贴士   查看数加一
    @RequestMapping("/view.json")
    @ResponseBody
    public Map<String,Object> add(int id){
        Detail detail=detailService.getPetByID(id);
        detailService.updateViewCount(detail);
        return JSONUtil.getStatusAndObj(1,detail);

    }

}
