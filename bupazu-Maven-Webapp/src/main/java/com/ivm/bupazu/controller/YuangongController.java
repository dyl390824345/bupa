package com.ivm.bupazu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ivm.bupazu.entity.TYuangong;
import com.ivm.bupazu.entity.Ttest;
import com.ivm.bupazu.service.testManager;
@Controller	
@RequestMapping("/student1.do")
public class YuangongController {
	@Autowired
	private testManager testservice;
	
    @RequestMapping(params = "method=add")   
    public String add(HttpServletRequest request, ModelMap modelMap) throws Exception{   
        return "yuangong_add";   
    }  
	
    @RequestMapping(params = "method=save")   
    public String save(HttpServletRequest request, ModelMap modelMap){   
        String name = request.getParameter("user");   
        String psw = request.getParameter("psw");   
        Ttest test = new Ttest();   
        test.setName(name); 
        test.setPassword(psw);
        try{   
        	testservice.saveTest(test)   ;
            modelMap.put("addstate", "添加成功");   
        }   
        catch(Exception e){   
        	
            modelMap.put("addstate", "添加失败");   
        }              
        return "yuangong_add";   
    }   
}
