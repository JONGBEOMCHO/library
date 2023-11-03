package com.group.libraryapp.dto.user.request;

public class UserCreateRequest {

    private String name;
    private Integer age; //int는 null 표현 불가능이여서

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
