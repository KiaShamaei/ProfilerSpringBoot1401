package kia.academy.blog.moduls.posts.model;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "post_tb1")
public class Posts {
    @Id
    @GeneratedValue
    private Long Id ;
    private String title;
    private String body;
    private String cover;
    @Column(name = "created_at")
    private LocalDateTime createdAt ;
    @Column(name ="updated_at")
    private LocalDateTime updateAt ;

    public Posts(String title , String body) {
        this.title = title;
        this.body = body;
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
