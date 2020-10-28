package com.npee.entity.user;

import com.npee.entity.common.BaseTime;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@Entity
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Primary
@Table(name = "users") // TODO: 테이블 이름 users 로 교체
@Slf4j
public class User extends BaseTime implements Serializable {

    @Id
    private Long id;

    @Column(nullable = false, unique = true)
    private String loginId;

    @Column(nullable = false, length = 30)
    private String name;

    @Column(nullable = false, length = 30)
    private String password;

    @Column(nullable = false, length = 30)
    private String phone;

}
