import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest{
    @DisplayName("1+2는 3이다.") //Test 이름 명시
    @Test //테스트 메소드 애너테이션
    public void junitTest(){
        int a=1;
        int b=2;
        int sum=3;

        Assertions.assertEquals(sum,a+b); //값이 같은지 검증
    }
}