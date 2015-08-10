package com.ivm.bupazu.controller;

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

import com.ivm.bupazu.confirm.testModel;
import com.ivm.bupazu.entity.TYuangong;
import com.ivm.bupazu.entity.Ttest;
import com.ivm.bupazu.service.testManager;
@Controller
@RequestMapping("/student.do")

public class testvalidController {
	@Autowired
	private testManager testservice;
	
    @RequestMapping(params = "method=add")   
    public String add(HttpServletRequest request, ModelMap modelMap) throws Exception{   
        return "yuangong_add";   
    }  
	
    @RequestMapping(params = "method=save0" )   
    public String save0(@Valid @ModelAttribute("testmodel") testModel testmodel, Errors errors,ModelMap modelMap){
    	
    	 if(errors.hasErrors()) {  
             return "yuangong";  
         }  
    	 else{
    		 Ttest test = new Ttest();   
    	 		test.setName(testmodel.getName()); 
    	 		test.setPassword(testmodel.getPsw());
    	 		try{   
    	 			testservice.saveTest(test);   
    	 			modelMap.put("addstate", "添加成功");
            
    	 		}   
    	 		catch(Exception e){   
        	
    	 		modelMap.put("addstate", "添加失败");   
    	 		} 
    	 		return "yuangong_add";
    	 }  
    }   
    
    @RequestMapping(params = "method=save" )   
    public String save(@Valid @ModelAttribute("testmodel") Ttest test, Errors errors,ModelMap modelMap){
    	
    	 if(errors.hasErrors()) {  
             return "yuangong";  
         }  
    	 else{
    	 		try{   
    	 			testservice.saveTest(test);   
    	 			modelMap.put("addstate", "添加成功");
            
    	 		}   
    	 		catch(Exception e){   
        	
    	 		modelMap.put("addstate", "添加失败");   
    	 		} 
    	 		return "yuangong_add";
    	 }  
    }   
}

