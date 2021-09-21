package com.task01.monstablab_task01.controller;


import com.task01.monstablab_task01.common.Session;
import com.task01.monstablab_task01.dao.AccountDao;
import com.task01.monstablab_task01.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/login")
    public String login(){
//
        return "login";
    }
}
