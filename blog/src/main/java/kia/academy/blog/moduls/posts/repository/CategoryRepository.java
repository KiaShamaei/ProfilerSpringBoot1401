package kia.academy.blog.moduls.posts.repository;

import kia.academy.blog.moduls.posts.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category , Long> {
}
