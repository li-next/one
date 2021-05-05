package ex.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskOne extends BaseMethods {


    public TaskOne(WebDriver driver) {
        super(driver);
    }

    public void isCorrect() {
        isElementDisplayed(By.xpath("//section/h1"));
    }
}
