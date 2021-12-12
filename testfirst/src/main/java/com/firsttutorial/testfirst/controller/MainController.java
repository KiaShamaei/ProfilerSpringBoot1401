package com.firsttutorial.testfirst.controller;


import com.firsttutorial.testfirst.models.User;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {
    @RequestMapping(value = "/first" , method = RequestMethod.GET)
    public String firstRest(){
        return "this is my first page";
    }
    @PostMapping(value = "/first")
    public String secondRest(){
        return "this is secon rest with same url and different method";
    }


    @RequestMapping(value={"/path/{username}/{password}","/path/{password}" } , method = RequestMethod.POST)
    public String path(@PathVariable (value = "username" , required = false) String username, @PathVariable("password") String password){
return  "hello" +  username + "," + password;
    }
    @RequestMapping("/param")
    public  String param(@RequestParam("username") String username , @RequestParam("password") String password){
        return  "hello " + username + " ," +  password ;
    }
    @RequestMapping( "/body")
    public String body(@RequestBody User user){
        return  user.getUsername() + " " + user.getPassword() ;
    }
    @RequestMapping("/json")
    public String json (){
        User user = new User("kiabala" , "12345");
        User user1 = new User("mahsa", "123555");
        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        return new Gson().toJson(users);
    }
}
