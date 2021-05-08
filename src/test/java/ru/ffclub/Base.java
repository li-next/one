package ru.ffclub;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import java.util.concurrent.TimeUnit;

public class Base {

    protected static String loginSite = "";
    protected static  String passwordSite = "";

    protected static  WebDriver driver;
    protected HomePage homePage = new HomePage(driver);
    protected AllMethods allMethods = new AllMethods(driver);
    protected SignUpPage signUpPage = new SignUpPage(driver);
    protected LoginPage loginPage = new LoginPage(driver);
    protected LogOut logOut = new LogOut(driver);
    protected AddAndDelAuto addAndDelAuto = new AddAndDelAuto(driver);



    @BeforeClass
    public static void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //homePage = PageFactory.initElements(driver, HomePage.class);
        //allMethods = PageFactory.initElements(driver, AllMethods.class);
        //signUpPage = PageFactory.initElements(driver, SignUpPage.class);
        //loginPage = PageFactory.initElements(driver, LoginPage.class);
        //logOut = PageFactory.initElements(driver, LogOut.class);
        //addAndDelAuto = PageFactory.initElements(driver, AddAndDelAuto.class);


    }
    @AfterClass
    public static void end() {
        System.out.println("end");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.quit();
    }
}
