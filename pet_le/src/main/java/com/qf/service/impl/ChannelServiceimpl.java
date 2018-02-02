package com.qf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.dao.ChannelDao;
import com.qf.pojo.Channel;
import com.qf.service.ChannelService;

@Service("channelService")
public class ChannelServiceimpl implements ChannelService {
	@Resource(name = "channelDao")
	private ChannelDao dao;

	@Override
	public PageInfo<Channel> select(int pageNum) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, 5);
		List<Channel> list = dao.select();
		System.out.println(list.get(0));
		PageInfo<Channel> pageInfo = new PageInfo<Channel>(list);
		return pageInfo;
	}

}
