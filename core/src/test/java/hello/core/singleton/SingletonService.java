package hello.core.singleton;

public class SingletonService {
    //
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {
        // 다른 class에서 new로 생성하는 것을 막는다.
    }

    public void logic() {
        //
        System.out.println("싱클톤 객체 로직 호출");
    }
}
