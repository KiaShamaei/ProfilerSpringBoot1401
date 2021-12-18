package kia.academy.blog.moduls.users.repository;

import kia.academy.blog.moduls.users.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<Users , Long> {
    Users findByEmail(String email);
    @Query(nativeQuery= true , value = "select * from Users u where u.Email =:email")
    Users userEmail(@Param("email") String email);
    @Query("select u from Users u where u.email = :email")
    Users userEmailJpql(@Param("email")  String email);

}
