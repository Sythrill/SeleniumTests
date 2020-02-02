package com.pop_tests.kodilla.tests;

import com.pop_tests.kodilla.pages.KodillaMainPage;
import com.pop_tests.kodilla.pages.KodillaSignUpPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

public class SignUpFormTest {

    WebDriver driver;
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDrivers\\Chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void signUp() {

        KodillaSignUpPage kodillaSignUpPage = new KodillaSignUpPage(driver);

        kodillaSignUpPage.enterEmail("testemail@yopmail.com");
        kodillaSignUpPage.enterPassword("Test1234");

        KodillaMainPage kodillaMainPage = kodillaSignUpPage.submit();
        assertEquals("Sprawdź czy nauka programowania jest dla Ciebie!", kodillaMainPage.confirmationHeader());
    }

    @After
    public void close(){
        driver.close();
    }
}