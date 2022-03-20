package hello.core.member;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MemoryMemberRepository implements MemberRepository{

    //DB가 정해지지않았음을 가정, 메모리에서만 사용하는 클래스
    private static Map<Long, Member> store = new HashMap<>();   //HashMap은 현업에서는 동시성 이슈가 발생할 수 있으나 간단하게 하기위해 사용

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
