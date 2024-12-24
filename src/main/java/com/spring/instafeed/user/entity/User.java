package com.spring.instafeed.user.entity;

import com.spring.instafeed.base.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.hibernate.annotations.Comment;

@Getter
@Entity
@Table(name = "users")
@AllArgsConstructor
public class User extends BaseEntity {

    @Comment("사용자 식별자")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT")
    private Long id;

    @Comment("사용자 이름")
    @Column(name = "name", nullable = false, length = 16)
    private String name;
    // [수정 전] columnDefinition = "VARCHAR(16)"
    // [수정 후] length = 16

    @Comment("사용자 이메일")
    @Column(name = "email", nullable = false, unique = true, length = 255)
    private String email;
    // [수정 전] columnDefinition = "VARCHAR(255)"
    // [수정 후] length = 255

    @Comment("사용자 비밀번호")
    @Column(name = "password", nullable = false, length = 255)
    private String password;
    // [수정 전] columnDefinition = "VARCHAR(255)"
    // [수정 후] length = 255

    protected User() {
    }
    // [수정 전] public User() {}


    public User(
            String name,
            String email,
            String password
    ) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    /**
     * 기능
     * 비밀번호 수정
     *
     * @param password : 수정하려는 사용자의 비밀번호
     */
    public void update(String password) {
        this.password = password;
    }
}