package com.qf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.dao.NewPetDao;
import com.qf.pojo.NewPet;
import com.qf.service.NewPetService;

@Service("newPetService")
public class NewPetServiceimpl implements NewPetService {
	@Resource(name = "newPetDao")
	private NewPetDao dao;

	@Override
	public PageInfo<NewPet> select(int pageNum) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, 5);
		List<NewPet> select = dao.select();
		PageInfo<NewPet> pageInfo = new PageInfo<NewPet>(select);
		return pageInfo;
	}

}
