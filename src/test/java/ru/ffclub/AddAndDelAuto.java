package ru.ffclub;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddAndDelAuto extends AllMethods{
    public AddAndDelAuto(WebDriver driver) {
        super(driver);
    }

    private String title = "Автомобили";
    private By h1 = By.xpath("//h1");

    private By loginLoc = By.xpath("//div[@class='fl-r hide-m pl-10']");
    private By addAutoLoc = By.xpath("//div[@class='fl-l item mr-10']/a");

    private By allAutoClick = By.xpath("//select[@name='select_make']");
    private By allAuto = By.xpath("//select[@name='select_make']/option");

    private By modelAutoClick = By.xpath("//select[@name='select_model']");
    private By modelAuto = By.xpath("//select[@name='select_model']/option");

    private By genAutoClick = By.xpath("//select[@name='select_gen']");
    private By genAuto = By.xpath("//select[@name='select_gen']/option");

    private By button = By.xpath("//button[@id='btn_submit']");

    private By settings = By.xpath("//div[@class='fl-l item']//a[text()='Настройки']");
    private By settingAuto = By.xpath("//div[@class='nav-a']/a[text()='Автомобили']");
    private By deleteAuto = By.xpath("//td[@class='del-icon']/a[text()='x']");





    public void clickAddAuto() {
        clickMethod(loginLoc);
        clickMethod(addAutoLoc);
        isEqualsTitle(h1, title);
        getElementDropBox(allAuto);
        sleepMethod(1000);
        getElementDropBox(modelAuto);
        sleepMethod(1000);
        if(driver.findElements(genAuto).size() > 0) {
            getElementDropBox(genAuto);
        }
        clickMethod(button);
    }

    public void clickDelete() {
        clickMethod(loginLoc);
        clickMethod(settings);
        sleepMethod(1000);
        clickMethod(settingAuto);
        clickMethod(deleteAuto);
        clickModalWindow();

    }
}
