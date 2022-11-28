package parallelTest;

import org.testng.annotations.Test;

public class parallelTest1 {
    @Test
    void method1() throws InterruptedException {
        System.out.println("This is test 1");
        Thread.sleep(5000);
    }
    @Test
    void method2() throws InterruptedException {
        System.out.println("This is test 2");
        Thread.sleep(2000);
    }
    @Test
    void method3() throws InterruptedException {
        System.out.println("This is test 3");
        Thread.sleep(3000);
    }
}
