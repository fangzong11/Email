package com.qf.service;

import com.github.pagehelper.PageInfo;
import com.qf.pojo.NewPet;

public interface NewPetService {
	public PageInfo<NewPet> select(int pageNum);
}
