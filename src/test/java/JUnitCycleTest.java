import org.junit.jupiter.api.*;

public class JUnitCycleTest{

    @BeforeAll //전체 테스트 시작 전 1회 실행. 따라서 static(정적 메소드)로 선언.
    static void beforeAll(){ //예를 들어 DB 연결이나 테스트 환경 초기화시 사용
        System.out.println("@BeforeAll");
    }
    @BeforeEach //테스트 케이스 시작 전 매번 실행. 각 인스턴스에 대해 메소드를 호출하므로 메소드는 정적이 아니여야한다.
    public void beforeEach(){
        System.out.println("@BeforeEach");
    }
    @Test
    public void test1(){
        System.out.println("test1");
    }
    @Test
    public void test2(){
        System.out.println("test2");
    }
    @Test
    public void test3(){
        System.out.println("test3");
    }
    @AfterAll //전체 테스트를 마치고 종료하기 전 한 번만 실행. 마찬가지로 정적.
    static void AfterAll(){ // 예를 들어 DB 연결을 해제하거나 자원을 해제할 때 사용
        System.out.println("@AfterAll");
    }
    @AfterEach //각 테스트 케이스 종료마다 실행
    public void AfterEach(){ //예를 들어 테스트케이스 실행 후 특정 데이터를 삭제할 때 사용
        System.out.println("@AfterEach");
    }


}