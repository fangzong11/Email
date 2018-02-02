package com.qf.controller;

import com.github.pagehelper.PageInfo;
import com.qf.pojo.Special;
import com.qf.service.SpecialService;
import com.qf.utils.JSONUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller
@RequestMapping("/api/special")
public class SpecialController {
	@Resource(name = "specialService")
	private SpecialService service;

	@ResponseBody
	@RequestMapping("select.json")
	public Map<String, Object> select(@RequestParam(defaultValue = "1") int pageNum) {
		PageInfo<Special> pageInfo = service.select(pageNum);
		Map<String, Object> map = JSONUtil.getSuccess(1, pageInfo.getList(), pageInfo.getPages());
		return map;
	}
}
