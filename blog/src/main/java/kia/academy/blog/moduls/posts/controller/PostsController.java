package kia.academy.blog.moduls.posts.controller;

import kia.academy.blog.moduls.posts.model.Posts;
import kia.academy.blog.moduls.posts.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class PostsController {
    private PostsService postsService ;
    @Autowired
    public PostsController(PostsService postsService){
        this.postsService = postsService ;
    }

    @RequestMapping(value = {"" , "/"} , method = RequestMethod.POST)
    public Posts addPosts( @RequestBody Posts posts){
        return this.postsService.addPosts(posts);
    }
    @RequestMapping(value = {"","/"} , method = RequestMethod.GET)
    public List<Posts> findAllPosts(){
        return  this.postsService.findAllPosts();
    }

}
