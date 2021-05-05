package ex.methods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main extends BaseMethods {

    String siteUrl = "https://influential.co/";
    public Main(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get(siteUrl);
    }

    public void firstTask(String strTask) {
        clickMethod(By.xpath(strTask));
    }
}
