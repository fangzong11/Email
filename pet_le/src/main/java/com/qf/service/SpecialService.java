package com.qf.service;

import com.github.pagehelper.PageInfo;
import com.qf.pojo.Special;

public interface SpecialService {
	public PageInfo<Special> select(int pageNum);
}
