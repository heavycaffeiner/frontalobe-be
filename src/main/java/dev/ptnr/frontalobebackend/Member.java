package dev.ptnr.frontalobebackend;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Entity
// Data Access Object (DAO) - Database의 구조를 담고 있는 객체
public class Member {
    // DB Table의 `id` 컬럼과 매칭
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    // DB Table의 `name` 컬럼과 매칭
    @Column(name = "name", nullable = false)
    private String name;
}
