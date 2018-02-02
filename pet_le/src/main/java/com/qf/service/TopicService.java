package com.qf.service;

import com.github.pagehelper.PageInfo;
import com.qf.pojo.Topic;

public interface TopicService {

    //分页查询
    public PageInfo<Topic> getTopicListByNum(int pageNo);
}
