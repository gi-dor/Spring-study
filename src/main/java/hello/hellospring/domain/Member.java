package hello.hellospring.domain;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Member {

    @Id // 해당 프로퍼티가 엔티티를 식별하는 값을 포함 , 기본 키 컬럼의 값을 표현함
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키 값을 생성하느 방법을 지정 , IDENTITY - 기본키 생성을 DB에 위임  DB가 자동으로 auto_incresement 를 사용해 기본키 값 생성
    private Long id;

   @Column(name = "username")   // DB 컬럼명이 "username" 과 매핑했음
    private String name;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
