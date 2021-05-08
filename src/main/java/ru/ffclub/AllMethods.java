package ru.ffclub;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AllMethods {

    protected WebDriver driver;
    protected WebDriverWait wait;



    public AllMethods(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }


    //ожидаем видимости элемента
    public void waitPresence(By el) {
        sleepMethod(1000);
        wait.until(ExpectedConditions.presenceOfElementLocated(el));
    }



    //нажать на кнопку
    public void clickMethod(By el) {
        waitPresence(el);
        driver.findElement(el).click();
    }

    //нажать на модальное окно
    public void clickModalWindow() {
        Alert alert = wait.until((ExpectedConditions.alertIsPresent()));
        alert.accept();
    }

    //поиск похожих элементов
    public List<WebElement> allElementsAddList(By el) {
        waitPresence(el);
        List<WebElement> elementsList = driver.findElements(el);
        return elementsList;
    }
    //получить элемент из списка
    public String getElementList(List<WebElement> elList) {
        return elList.get(rnd(0, elList.size())).getText();
    }

    public void getElementDropBox(By Auto) {
        //clickMethod(Click);
        clickMethod(By.xpath("//option[text()='"+ getElementList(allElementsAddList(Auto)) + "']"));
    }

    //спать заданное время
    public void sleepMethod(int mSec){
        try {
            Thread.sleep(mSec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }





    //элемент отображается assertTrue
    public void isElementDisplayed(By el) {
        waitPresence(el);
        Assert.assertTrue(driver.findElement(el).isDisplayed());
    }

    //элемент отображается assert
    public void isEqualsTitle(By el, String title) {
        waitPresence(el);
        Assert.assertEquals(title, driver.getTitle());
    }
    //ввод email
    public void fillEmail(By el, int i) {
        waitPresence(el);
        String tmpEmail = randomString(i) + rnd(10, 99) + "@gmail.com";
        driver.findElement(el).sendKeys(tmpEmail);

    }
    //ввод password
    public void fillPass(By el, By el2, int i) {
        waitPresence(el);
        waitPresence(el2);
        String tmpPass = randomString(i) + rnd(10, 99) + randomString(i) + rnd(10, 99);
        driver.findElement(el).sendKeys(tmpPass);
        driver.findElement(el2).sendKeys(tmpPass);

    }
    //ввод строки
    public void fillString(By el, String str) {
        waitPresence(el);
        driver.findElement(el).sendKeys(str);
    }

    //псевдослучайная строка переменной длины
    public static String randomString(int i) {
        Random random = new Random();
        String tmp = "";
        List<String> list = new ArrayList<>();
        for(int x = 97; x < 123; x++) {
            list.add(String.valueOf((char)x));
        }
        for(int y = 0; y < i; y++) {
            tmp = tmp + list.get(random.nextInt(list.size()));
        }
        return tmp;
    }

    //псевдослучайная строка переменной длины
    public String randomUpCaseString(int i) {
        String tmp = randomString(i);
        return tmp.substring(0, 1).toUpperCase() + tmp.substring(1);
    }
    //число от min до max
    public int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }



}
