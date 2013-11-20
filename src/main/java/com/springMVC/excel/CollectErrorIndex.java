package com.springMVC.excel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * 收集错误数据 
 * @author huanghu
 * @date 2013-11-20
 */
@Controller
@RequestMapping("/collectError")
public class CollectErrorIndex {
	
	@RequestMapping(value = "executeCollect" ,method = RequestMethod.POST)
	public ModelAndView executeCollect(HttpServletRequest request ,HttpServletResponse response){
		System.out.println("post");
		List<String> list = new ArrayList<String>();
		list.add("test1");
		list.add("test2");
		Map<String, List<String>> model = new HashMap<String, List<String>>();
		model.put("list", list);
		ExportExcel viewExcel = new ExportExcel();
		return new ModelAndView(viewExcel ,model);
		
	}
}
