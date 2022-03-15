package hello.core.member;

public interface MemberRepository {
    //우선 두가지 기능만 제공

    void save(Member member);

    Member findById(Long memberId);
}
