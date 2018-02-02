package com.qf.service;

import com.github.pagehelper.PageInfo;
import com.qf.pojo.Article;

public interface ArticleService {
	public PageInfo<Article> select(int pageNum);
}
