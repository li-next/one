package ru.ffclub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AllMethods{

    private String siteUrl = "https://ffclub.ru/";
    private String titleStr = "Автомобили Ford и их друзья";
    public HomePage(WebDriver driver) {
        super(driver);
    }


    private By h1 = By.xpath("//h1");
    private By titleLoc = By.xpath("//head/title[1]");



    public void openHomePage() {
        driver.get(siteUrl);
        isElementDisplayed(h1);
        isEqualsTitle(titleLoc, titleStr);

    }

    public void openAfterLogin() {
        driver.get(siteUrl);
    }
}
