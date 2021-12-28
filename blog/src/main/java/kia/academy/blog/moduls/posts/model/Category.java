package kia.academy.blog.moduls.posts.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "category_tb1")
public class Category {
    @Id
    @GeneratedValue
    private Long id ;
    private String title ;

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
