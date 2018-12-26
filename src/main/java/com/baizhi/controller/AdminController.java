package com.baizhi.controller;

import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminService adminService;
    @RequestMapping("/login")
    public String login(String username, String password, HttpSession session){
       Admin wjn = adminService.login(username, password);
       if (wjn!=null){
           session.setAttribute("admin",wjn);
           return "redirect:/emp/findAll";
       }
       else return "login";


    }
}
