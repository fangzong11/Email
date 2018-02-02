package com.qf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.dao.RecommendDao;
import com.qf.pojo.Recommend;
import com.qf.service.RecommendService;

@Service("recommendService")
public class RecommendServiceimpl implements RecommendService {
	@Resource(name = "recommendDao")
	private RecommendDao dao;

	@Override
	public PageInfo<Recommend> select(int pageNum) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, 5);
		List<Recommend> list = dao.select();
		PageInfo<Recommend> pageInfo = new PageInfo<Recommend>(list);
		return pageInfo;
	}

}
