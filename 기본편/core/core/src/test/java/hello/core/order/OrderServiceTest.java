package hello.core.order;

import hello.core.AppConfig;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService;
    OrderService orderService;

    //단위테스트를 잘하는것이 정말 중요하다.
    //단위테스트란 스프링이나 컨테이너의 도움없이 순수하게 자바 코드로 테스트 하는것을 말한다.
    //세미콜론까지 자동완성되는 커맨드 : ctrl+shift+enter

    @BeforeEach
    void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    void createOrder() {
        Long memberId = 1L;
        //long memberId = 1L;  primitive type(long)으로 해도 상관없으나 null을 대입할 수 없음
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        //Assertions.core
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
