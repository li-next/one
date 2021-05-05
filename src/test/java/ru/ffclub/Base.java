package ru.ffclub;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import java.util.concurrent.TimeUnit;

public class Base {

    protected String loginSite = "";
    protected String passwordSite = "";

    protected WebDriver driver;
    protected HomePage homePage;
    protected AllMethods allMethods;
    protected SignUpPage signUpPage;
    protected LoginPage loginPage;
    protected LogOut logOut;
    protected AddAndDelAuto addAndDelAuto;



    @Before
    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        homePage = PageFactory.initElements(driver, HomePage.class);
        allMethods = PageFactory.initElements(driver, AllMethods.class);
        signUpPage = PageFactory.initElements(driver, SignUpPage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        logOut = PageFactory.initElements(driver, LogOut.class);
        addAndDelAuto = PageFactory.initElements(driver, AddAndDelAuto.class);


    }
    @After
    public void end() {
        System.out.println("end");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.quit();
    }
}
