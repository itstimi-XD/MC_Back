package com.mini.mbti_collector.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_idx")
    private int userIdx;

    @Getter
    @Setter
    @Column(name = "nickname", nullable = false, length = 50)
    private String nickname;

    @Getter
    @Setter
    @Column(name = "email", nullable = false, length = 255)
    private String email;

    @Setter
    @Getter
    @Column(name = "password", nullable = false, length = 60)
    private String password;

    @Setter
    @Column(name = "createdAt", nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDateTime createdAt;

    @Getter
    @Setter
    @Column(name = "deleted", nullable = false, length = 1)
    private String deleted;

    public static User of(String nickname, String email, String password) {
        User user = new User();
        user.nickname = nickname;
        user.email = email;
        user.password = password;
        user.createdAt = LocalDateTime.now(); // createdAt 필드를 현재 시간으로 설정합니다.
        user.deleted = "N"; // 필요하다면 이런식으로 deleted 필드도 설정할 수 있습니다.
        return user;
    }
}
