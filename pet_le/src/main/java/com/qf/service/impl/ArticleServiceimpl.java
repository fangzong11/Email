package com.qf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.dao.ArticleDao;
import com.qf.pojo.Article;
import com.qf.service.ArticleService;

@Service("articleService")
public class ArticleServiceimpl implements ArticleService {
	@Resource(name = "articleDao")
	private ArticleDao dao;

	@Override
	public PageInfo<Article> select(int pageNum) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, 5);
		List<Article> list = dao.select();
		PageInfo<Article> pageInfo = new PageInfo<Article>(list);
		return pageInfo;
	}

}
