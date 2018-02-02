package com.qf.service;

import com.github.pagehelper.PageInfo;
import com.qf.pojo.Channel;

public interface ChannelService {
	public PageInfo<Channel> select(int pageNum);

}
