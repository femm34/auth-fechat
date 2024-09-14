package com.microservice.userAuthService.models.dto;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@Builder
public class UserDto implements Serializable {
    private Integer id;
    private String username;
    private String name;
    private String password;
    private String email;
}
