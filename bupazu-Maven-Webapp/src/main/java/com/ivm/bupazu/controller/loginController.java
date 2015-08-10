package com.ivm.bupazu.controller;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ivm.bupazu.entity.Ttest;
import com.ivm.bupazu.service.loginManager;
import com.ivm.bupazu.service.testManager;
import com.ivm.bupazu.entity.TYonghu;

@Controller
@RequestMapping("/login.do")
@SessionAttributes("currentYonghu")
public class loginController {
	@Autowired
	private loginManager loginservice;
	
	@RequestMapping(params = "method=login")
//	public String login(HttpServletRequest request, ModelMap model) throws Exception{   
	public @ResponseBody Map<String, String> login(HttpServletRequest request, ModelMap model) throws Exception{ 
		
		String name = request.getParameter("name");   
        String password = request.getParameter("password");   
        Short shenfen = Short.parseShort(request.getParameter("yonghushenfen")) ;        
        TYonghu yonghu = loginservice.loginValid(name, password, shenfen) ;
        Map<String, String> hmap = new HashMap<String, String>();
        if((null==yonghu)||yonghu.equals("") ){
    
//        	model.addAttribute("msg", "用户名和密码不正确!");
        	hmap.put("error", "false");
//        	return("login");
        	return hmap ;
        }else{
        	model.addAttribute("currentYonghu", yonghu) ;
        	hmap.put("success", "true");
//        	return("index") ;
        	return hmap ;
        } 
        }      
    }  

