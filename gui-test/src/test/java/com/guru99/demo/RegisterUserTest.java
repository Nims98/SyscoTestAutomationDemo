package com.guru99.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterUserTest {
    WebDriver driver;
    // before method
    @BeforeMethod
    public void setUp() {
        System.out.println("Before Method");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("REGISTER")).click();

    }

    // test method
    @Test
    public void testRegisterUser() {
        System.out.println("Hello Test!");
        driver.findElement(By.name("firstName")).sendKeys("sysco");
        driver.findElement(By.name("lastName")).sendKeys("Labs");
        driver.findElement(By.name("submit")).click();

    }
}
