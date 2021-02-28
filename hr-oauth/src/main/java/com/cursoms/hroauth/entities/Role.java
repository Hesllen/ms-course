package com.cursoms.hroauth.entities;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = {"roleName"} )
public class Role implements Serializable {

    public Role() {
    }
    private Long id;
    private String roleName;
}
