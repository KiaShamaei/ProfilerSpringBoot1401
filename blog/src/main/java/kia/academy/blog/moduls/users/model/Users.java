package kia.academy.blog.moduls.users.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users_tb1")
public class Users {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
@Id
@GeneratedValue
    private  Long id;

    private String name ;
    @Column(unique = true, length = 255)
    private String email ;
    private String password ;
    private String cover ;
    @Column(name="created_at")
    private LocalDateTime createdAt ;
    @Column(name="updated_at")
    private LocalDateTime updatedAt ;
    public Users() {

    }

    public Users(String name, String email, String password, String cover) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.cover = cover;
    }




}
