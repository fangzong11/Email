package com.qf.service;

import com.github.pagehelper.PageInfo;
import com.qf.pojo.Recommend;

public interface RecommendService {
	public PageInfo<Recommend> select(int pageNum);
}
