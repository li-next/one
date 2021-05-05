package ex.methods;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseMethods {

    public WebDriver driver;
    public WebDriverWait wait;



    public BaseMethods(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    //ожидаем видимости элемента
    public void waitVisibility(By el) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(el));
    }

    //нажать на кнопку
    public void clickMethod(By el) {
        waitVisibility(el);
        driver.findElement(el).click();
    }

    //элемент отображается
    public void isElementDisplayed(By el) {
        waitVisibility(el);
        Assert.assertTrue(driver.findElement(el).isDisplayed());
    }
 }
