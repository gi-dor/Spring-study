package hello.hellospring;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.JdbcMemberRepository;
import hello.hellospring.repository.JpaMemberRepository;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.service.MemberService;
import jakarta.persistence.EntityManager;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

        private MemberRepository memberRepository;

        private EntityManager em;

        @Autowired
        public SpringConfig(MemberRepository memberRepository) {
            this.memberRepository = memberRepository;
        }

        @Bean
        public MemberService memberService() {
                return new MemberService(memberRepository);
            }

//        @Bean
//        public MemberRepository memberRepository() {
//            return new MemoryMemberRepository();
//            return new JdbcMemberRepository(dataSource);
//            return new JpaMemberRepository(em);
//        }
}
