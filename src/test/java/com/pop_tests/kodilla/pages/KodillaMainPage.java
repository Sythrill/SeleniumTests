package com.pop_tests.kodilla.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class KodillaMainPage {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/header/div/h1")
    private WebElement pageHeader;

    public KodillaMainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String confirmationHeader() {
        return pageHeader.getText();
    }
}
