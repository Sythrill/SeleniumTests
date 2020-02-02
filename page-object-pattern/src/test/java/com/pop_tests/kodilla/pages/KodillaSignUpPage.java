package com.pop_tests.kodilla.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class KodillaSignUpPage {
    private WebDriver driver;

    private static String PAGE_URL="https://kodilla.com/pl/sign-in";

    @FindBy(name = "email")
    private WebElement email;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"sign-in\"]/form/div[2]/button")
    private WebElement submitButton;

    public KodillaSignUpPage(WebDriver driver) {
        this.driver = driver;
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String email) {
        this.email.clear();
        this.email.sendKeys(email);
    }

    public void enterPassword(String password) {
        this.password.clear();
        this.password.sendKeys(password);
    }

    public KodillaMainPage submit() {
        submitButton.click();
        return new KodillaMainPage(driver);
    }
}