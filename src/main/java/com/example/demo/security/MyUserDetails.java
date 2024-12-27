package com.example.demo.security;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Table(name="User")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
@Entity
public class MyUserDetails implements UserDetails {

    @Id
    @Column
    private String USER_ID;

    @Column
    private String PWD;

    @Column
    private String ROLES;

    @Override
    public String getUsername() {
        return USER_ID;
    }

    @Override
    public String getPassword() {
        return PWD;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
