package com.sw.loginservice.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class NaverEntityRequest {

    private final String id;
    private final String name;
    private final String gender;
    private final String birthyear;
}
