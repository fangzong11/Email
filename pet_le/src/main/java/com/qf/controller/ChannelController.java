package com.qf.controller;

import com.github.pagehelper.PageInfo;
import com.qf.pojo.Channel;
import com.qf.service.ChannelService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api/channel")
public class ChannelController {
	@Resource(name = "channelService")
	private ChannelService service;

	@ResponseBody
	@RequestMapping("select.json")
	public Map<String, Object> select(@RequestParam(defaultValue = "1") int pageNum) {
		PageInfo<Channel> pageInfo = service.select(pageNum);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("msgCode", 1);
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("list", pageInfo.getList());
		String classify[] = { "46", "23", "68", "54", "178", "96" };
		data.put("classify", classify);
		data.put("pages",pageInfo.getPages());
		map.put("data", data);

		return map;
	}
}
