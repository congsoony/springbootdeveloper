import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest {
    @DisplayName("1+2=귀요미?")
    @Test
    public void junitTest(){
        int a=1;
        int b= 2;
        int sum=3;
        Assertions.assertEquals(a+b,sum);
    }

    @DisplayName("1+3은 4이당")
    @Test
    public void junitFaildTest(){
        int a = 1;
        int b = 3;
        int sum=3;
        Assertions.assertEquals(a+b,sum);
    }


}
