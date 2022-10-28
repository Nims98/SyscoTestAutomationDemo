package testing.annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest3 {
    @BeforeMethod
    public void setUp() {
        System.out.println("Before Method");
    }
    @Test
    public void test1() {
        System.out.println("Hello Test1!");
    }

    @Test
    public void test2() {
        System.out.println("Hello Test2!");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After Method");
    }
}

