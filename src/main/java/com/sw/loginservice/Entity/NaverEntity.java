package com.sw.loginservice.Entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "naver")
@Entity
public class NaverEntity {

    @Id
    private String id;
    private String name;
    private String gender;
    private String birthyear;

}
