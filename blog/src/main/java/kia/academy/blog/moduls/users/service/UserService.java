package kia.academy.blog.moduls.users.service;


import kia.academy.blog.moduls.users.model.Users;
import kia.academy.blog.moduls.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository ;
    @Autowired
    public UserService (UserRepository userRepository){
        this.userRepository = userRepository ;
    }
    public Users registerUser (Users user){
        return  this.userRepository.save(user);
    }
    public List<Users>  findAllUsers (){
        return this.userRepository.findAll();
    }
    public void deleteUser (Long id){
        this.userRepository.deleteById(id);
    }

}
