package hello.core.member;

public interface MemberService {
    //회원가입과 회원조회 두가지 기능 제공

    void join(Member member);

    Member findMember(Long memberId);
}
