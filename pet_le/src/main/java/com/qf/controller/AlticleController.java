package com.qf.controller;

import com.github.pagehelper.PageInfo;
import com.qf.pojo.Article;
import com.qf.service.ArticleService;
import com.qf.utils.JSONUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller
@RequestMapping("/api/article")
public class AlticleController {
	@Resource(name = "articleService")
	private ArticleService service;

	@ResponseBody
	@RequestMapping("select.json")
	public Map<String, Object> select(@RequestParam(defaultValue = "1") int pageNum) {
		PageInfo<Article> pages = service.select(pageNum);
		Map<String, Object> map = JSONUtil.getSuccess(1, pages.getList(), pages.getPages());
		return map;
	}
}
