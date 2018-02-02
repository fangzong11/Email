package com.qf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.dao.TopicDao;
import com.qf.pojo.Topic;
import com.qf.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicDao topicDao;

    /**
     * 分页查询
     * @param pageNo 页码
     */
    @Override
    public PageInfo<Topic> getTopicListByNum(int pageNo) {
        PageHelper.startPage(pageNo,7);
        List<Topic> topicList = topicDao.getTopicList();
        PageInfo<Topic> pageInfo = new PageInfo<>(topicList);
        return pageInfo;
    }
}
