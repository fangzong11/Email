package com.qf.controller;

import com.github.pagehelper.PageInfo;
import com.qf.pojo.Topic;
import com.qf.service.TopicService;
import com.qf.utils.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/api/topic")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/list.json")
    @ResponseBody
    public Map<String,Object> getTopicListByNo(@RequestParam(defaultValue = "1") int pageNum){
        PageInfo<Topic> pageInfo = topicService.getTopicListByNum(pageNum);
        return JSONUtil.getSuccess(1,pageInfo.getList(),pageInfo.getPages());
    }
}
