package com.projects.uber.uberApp.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SignupDto {

    private String name;
    private String email;
    private String password;
}
