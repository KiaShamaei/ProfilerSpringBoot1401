package kia.academy.blog.moduls.posts.service;


import kia.academy.blog.moduls.posts.model.Posts;
import kia.academy.blog.moduls.posts.repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostsService {
    private PostsRepository postsRepository ;
    @Autowired
    public PostsService (PostsRepository postsRepository){
        this.postsRepository = postsRepository ;

    }
    public Posts addPosts (Posts posts){
        return this.postsRepository.save(posts) ;
    }
    public List<Posts> findAllPosts(){
        return this.postsRepository.findAll() ;
    }
}
