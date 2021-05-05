package ru.ffclub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AllMethods{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private By loginLoc = By.xpath("//a[@class='guest-login ajax-popup-link pr-10']");
    private By loginLocInput = By.xpath("//input[@name='login']");
    private By passLocInput = By.xpath("//input[@name='password']");
    private By buttonLoc = By.xpath("//button[@name='submit']");
    private By errorMsg = By.xpath("//div[@class='red mb-10']");
    private By forumUpdates  = By.xpath("//div[text()='Обновления на форумах']");
    private String titlePage = "ffclub";



    public void clickLog() {
        clickMethod(loginLoc);
    }

    public void loginForm(String log, String pass) {
        fillString(loginLocInput, log);
        fillString(passLocInput, pass);
        clickMethod(buttonLoc);

    }

    public void loginSuccessfully() {
        isElementDisplayed(forumUpdates);
        isEqualsTitle(forumUpdates, titlePage);
    }

    public void loginErr() {
        waitPresence(errorMsg);
    }

}
