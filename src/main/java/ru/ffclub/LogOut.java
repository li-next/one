package ru.ffclub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOut extends AllMethods{

    public LogOut(WebDriver driver) {
        super(driver);
    }
    private By logOutLoc = By.xpath("//div[@class='fl-r hide-m pl-10']");
    private By exitButton = By.xpath("//ul[@class='bottom'] // div[@class='fl-r item'] / a");


    public void exitSite() {
        clickMethod(logOutLoc);
        clickMethod(exitButton);
        clickModalWindow();
    }
}
