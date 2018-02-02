package com.qf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.dao.SpecialDao;
import com.qf.pojo.Special;
import com.qf.service.SpecialService;

@Service("specialService")
public class SpecialServiceimpl implements SpecialService {

	@Resource(name = "specialDao")
	private SpecialDao dao;

	@Override
	public PageInfo<Special> select(int pageNum) {
		PageHelper.startPage(pageNum, 5);
		List<Special> list = dao.select();
		PageInfo<Special> pageInfo = new PageInfo<Special>(list);
		return pageInfo;
	}

}
