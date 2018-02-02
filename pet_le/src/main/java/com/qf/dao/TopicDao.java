package com.qf.dao;

import com.qf.pojo.Topic;

import java.util.List;

public interface TopicDao {

    //查询所有话题列表
    public List<Topic> getTopicList();
}
