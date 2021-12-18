package kia.academy.blog.moduls.users.controller;


import kia.academy.blog.moduls.users.model.Users;
import kia.academy.blog.moduls.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService ;
    @Autowired
    public UserController(UserService userService) {

    this.userService = userService;
    }
    @RequestMapping(value = {"","/"} , method = RequestMethod.POST)
    public Users registerUser (@RequestBody Users user){

    return this.userService.registerUser(user);
    }
    @RequestMapping(value = {"","/"} , method = RequestMethod.GET)
    public List<Users> getUsers(){

    return  this.userService.findAllUsers();
    }
    @DeleteMapping(value = "/{id}")
    public boolean deleteUsers(@PathVariable Long id){
    return  this.userService.deleteUser(id);

    }



}
