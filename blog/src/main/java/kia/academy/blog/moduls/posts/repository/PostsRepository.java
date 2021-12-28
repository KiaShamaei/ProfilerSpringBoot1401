package kia.academy.blog.moduls.posts.repository;

import kia.academy.blog.moduls.posts.model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts , Long> {
}
