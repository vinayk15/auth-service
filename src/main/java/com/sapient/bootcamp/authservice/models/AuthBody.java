package com.sapient.bootcamp.authservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthBody {

	private String email;
    private String password;
}
