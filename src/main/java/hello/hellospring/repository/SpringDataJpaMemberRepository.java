package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member , Long> ,  MemberRepository  {
    // 인터페이스는 다중 상속이 가능하다


    @Override
    Optional<Member> findByName(String name);
    // 구현 안해도됨
    // 이게 다만들어진거 개꿀 ㅋ
}
