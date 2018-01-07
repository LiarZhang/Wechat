package com.zhangxf.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhangxf.pojo.User;
import com.zhangxf.service.TechsupportService;
import com.zhangxf.service.UserService;

@Controller  
@RequestMapping("/user") //对应的controller 
public class UserController {  
    @Autowired
    private UserService userService; 
    
    @Autowired
	private TechsupportService techsupportService;
	
    
    @RequestMapping("/success")//对应的方法  
    public String toIndex(HttpServletRequest request,Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));  
        User user = this.userService.getUserById(userId);  
        model.addAttribute("user", user);  
        System.out.println("user"+user.getPassword());
        
        
        System.out.println(techsupportService);
        techsupportService.findAllTechsupport();
        
        System.out.println("userid="+userId);
        techsupportService.findStatusById(userId);
        System.out.println("============");
        techsupportService.updateStatusById(2, userId);
        return "/WEB-INF/jsp/success.jsp";  
    }
}
