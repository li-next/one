package ru.mmgp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import ru.ffclub.*;

import java.util.concurrent.TimeUnit;

public class Basemmg {

    protected WebDriver driver;

    @Before
    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);



    }
    @After
    public void end() {
        System.out.println("end");
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.quit();
    }
}
