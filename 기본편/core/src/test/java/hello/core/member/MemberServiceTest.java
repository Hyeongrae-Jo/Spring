package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    //build때는 main 코드만 나가고 test코드는 배포에서 빠진다
    //main에서는 눈으로 검증하나 test에서는 눈으로 찾지않아도 오류 결과를 편하게(빠르게) 볼 수 있다
    //현업에서 test코드는 선택이 아닌 필수이다

    MemberService memberService;

    @BeforeEach  //각 테스트전에 무조건 실행하는 부분
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void join() {
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
