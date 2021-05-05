package ex.example;

import org.junit.Test;

public class First extends Base{


    @Test
    public void first() {
        main.goTo();
        main.firstTask("//a[text()='About'][1]");
        taskOne.isCorrect();
    }

    @Test
    public void second() {
        driver.get("https://influential.co/");
    }
}
