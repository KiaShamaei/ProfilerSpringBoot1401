package kia.academy.blog.moduls.posts.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "category_tb1")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class , property = "id")
public class Category {
    @Id
    @GeneratedValue
    private Long id ;
    private String title ;

    @ManyToMany(mappedBy = "categories")
    private List<Posts> posts;

    public List<Posts> getPosts() {
        return posts;
    }

    public void setPosts(List<Posts> posts) {
        this.posts = posts;
    }

    public LocalDateTime getCreatAt() {
        return creatAt;
    }

    public void setCreatAt(LocalDateTime creatAt) {
        this.creatAt = creatAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public Category() {
    }
    public Category(String title){
        this.title = title ;
    }
    @Column(name= "creat_at")
    private LocalDateTime creatAt ;
    @Column(name = "update_at")
    private LocalDateTime updateAt ;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
