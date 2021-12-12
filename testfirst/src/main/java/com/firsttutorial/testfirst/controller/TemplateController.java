package com.firsttutorial.testfirst.controller;


import com.firsttutorial.testfirst.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TemplateController {
//    @RequestMapping(value = "/index")
//    public String index(Model model){
//        model.addAttribute("name" , "kia");
//        return "index";
//    }
    //passing obj to view
//    @RequestMapping(value = "/index")
//    public String index(Model model){
//
//        User user = new User("kia" , "12324");
//        model.addAttribute("user" , user);
//        return "index";
//    }
    //passing arraylist to view
//    @RequestMapping(value = "/index")
//    public String index(Model model){
//
//        User user = new User("kia" , "12324");
//        User user1 = new User("ali" , "450") ;
//        List<User> users = new ArrayList<>();
//        users.add(user);
//        users.add(user1);
//        model.addAttribute("users", users);
//        return "index";
//    }
    //passing model to view and geting from a form
    @RequestMapping(value = "/index")
    public String index (Model model){
       model.addAttribute("userData", new User());

        return "index";

    }
    @RequestMapping(value = "/login")
    public  String login (@ModelAttribute("userData") User user){
        System.out.println(user.getPassword() + " , " + user.getUsername());

        return "redirect:index";
    }
}
