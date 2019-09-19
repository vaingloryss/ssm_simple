package com.vainglory.controller;

import com.vainglory.domain.User;
import com.vainglory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserList")
    public String getUserList(Model model){
        List<User> userList = userService.getUserList();
        model.addAttribute("userList",userList);
        return "list";
    }
}
