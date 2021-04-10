package com.example.springboottest.entity;

import lombok.*;

@Data
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private String address;
}
