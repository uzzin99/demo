package com.example.demo.user.entity;

import com.example.demo.security.MyUserDetails;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.security.core.userdetails.User;

@Entity
@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
@Table(name = "user")
//@RequiredArgsConstructor
public class Member {

    @Id
    @Column(name="USER_ID", length=20)
    private String username;

    @Column(name="PWD")
    private String pwd;

    @Column(name="ROLES")
    private String roles;

    public Member() {}

//    @Builder
//    public Member(String username, String pwd, String roles) {
//        this.username = username;
//        this.pwd = pwd;
//        this.roles = roles;
//    }
   public Member(String username, String pwd, String roles) {
        this.username = username;
        this.pwd = pwd;
        this.roles = roles;
    }
}
