package com.projects.uber.uberApp.entities;


import com.projects.uber.uberApp.entities.enums.Role;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "app_user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;
    private String password;

    @ElementCollection(fetch = FetchType.LAZY) // this is to create a separate table called roles and then we use it
    @Enumerated(EnumType.STRING) // this is to store the users in String format, we can also make it ordinal e.g. 0 for DRIVER, 1 from USER, etc
    private Set<Role> roles;
}
