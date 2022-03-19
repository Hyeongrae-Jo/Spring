package hello.core.singleton;

public class SingletonService {

    //자기 자신을 내부에 private, static으로 선언함
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    //생성자를 private으로 작성하여 외부에서 new로 생성하지 못하도록 막는다
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
