package kia.academy.blog.moduls.posts.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import kia.academy.blog.moduls.users.model.Users;
import org.apache.catalina.User;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "post_tb1")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class , property = "id")
public class Posts {
    @Id
    @GeneratedValue
    private Long Id ;
    private String title;
    private String body;
    private String cover;
    @ManyToMany
    @JoinTable(name="posts_categories")
    private List<Category> categories ;

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    @ManyToOne
    @JoinColumn(name = "user_fk")
    private Users users;

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Column(name = "created_at")
    private LocalDateTime createdAt ;
    @Column(name ="updated_at")
    private LocalDateTime updateAt ;

    public Posts(){}

    public Posts(Long id, String title, String body, String cover, Users users, LocalDateTime createdAt, LocalDateTime updateAt) {
        Id = id;
        this.title = title;
        this.body = body;
        this.cover = cover;
        this.users = users;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }
}
