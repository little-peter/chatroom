package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;



@Getter
@Setter
@ToString
public class User extends Response implements Serializable {
    private static final Long serialVersionUID = 1L;

    private Integer userId;
    private String name;
    private String password;
    private String nickName;
    private String iconPath;
    private String signature;
    private java.util.Date lastLogout;
}
