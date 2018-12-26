package com.baizhi.controller;

import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    EmpService empService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Emp> emps = empService.selectAll();
        model.addAttribute("emps",emps);
        return "emplist";
    }
    @RequestMapping("/add")
    public String add(Emp emp){
        emp.setId(UUID.randomUUID().toString());
        empService.insert(emp);
        return "redirect:/emp/findAll";
    }



    //修改前
    @RequestMapping("/findById")
    public String findById(String id,Model model){
        Emp emp = empService.selectById(id);
        model.addAttribute(emp);
        return "updateEmp";
    }
    //修改后
    @RequestMapping("/update")
    public String update(Emp emp){
        empService.update(emp);
        return "redirect:/emp/findAll";
    }
    @RequestMapping("/delete")
    public String delete(String  id){

        System.out.println("删除"+id);
        empService.delete(id);
        return "redirect:/emp/findAll";
    }















}
