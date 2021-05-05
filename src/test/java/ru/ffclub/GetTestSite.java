package ru.ffclub;

import org.junit.Test;

public class GetTestSite extends Base{



    @Test
    public void open() {
        homePage.openHomePage();
    }

    //регистрация на сайте
    @Test
    public void signUpSite() {
        homePage.openHomePage();
        signUpPage.signUp();
        signUpPage.fillForm();
    }

    //правельный ввод login and password
    @Test
    public void loginSite() {
        loginSite = "qwerty4321";
        passwordSite = "qwerty1234";
        homePage.openHomePage();
        loginPage.clickLog();
        loginPage.loginForm(loginSite, passwordSite);
        loginPage.loginSuccessfully();
    }


    //без ввод login and password
    @Test
    public void loginSiteNoLoginAndPass() {
        loginSite = "";
        passwordSite = "";
        homePage.openHomePage();
        loginPage.clickLog();
        loginPage.loginForm(loginSite, passwordSite);
        //нет никакого сообщение от том что надо вести login и password страница просто перезагружается
    }



    //НЕ верный ввод login and password
    @Test
    public void loginSiteErrLoginAndPass() {
        loginSite = "nbdgd";
        passwordSite = "adgavdg";
        homePage.openHomePage();
        loginPage.clickLog();
        loginPage.loginForm(loginSite, passwordSite);
        loginPage.loginErr();
    }

    @Test
    public void logOutSite() {
        loginSite();
        logOut.exitSite();
    }

    @Test
    public void addAndDelAutoSite() {
        loginSite();
        addAndDelAuto.clickAddAuto();
        homePage.openAfterLogin();
        loginPage.loginSuccessfully();
        addAndDelAuto.clickDelete();
    }



}
