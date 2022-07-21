import org.testng.annotations.Test;

public class TestCases {

    @Test(priority = 1)
    void start(){
        System.out.println("I am inside start");
    }

    @Test(priority = 2)
    void mid(){
        System.out.println("I am inside mid");
    }

    @Test(priority = 3)
    void end(){
        System.out.println("I am inside end");
    }
}
