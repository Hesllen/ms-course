package com.cursoms.hroauth.entities;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"} )
public class User implements Serializable {

    public User() {
    }

    private Set<Role> roles = new HashSet<>();
    private Long id;
    private String name;
    private String email;
    private String password;

}
