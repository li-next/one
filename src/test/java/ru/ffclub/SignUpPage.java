package ru.ffclub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends AllMethods{

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    private By signLoc = By.xpath("//a[@class='green-login']");
    private By emailLoc = By.xpath("//input[@name='email']");
    private By passwordLoc = By.xpath("//input[@name='password']");
    private By passwordLoc2 = By.xpath("//input[@name='password2']");
    private By recaptcha = By.xpath("//div[@class='recaptcha-checkbox-border']");
    private int number = 8;

    public void signUp() {
        clickMethod(signLoc);
    }
    public void fillForm() {
        fillEmail(emailLoc, number);
        fillPass(passwordLoc, passwordLoc2, number/4);
        //clickMethod(recaptcha);

    }

}
