package ex.example;

import org.junit.Test;

public class Second extends Base{

    @Test
    public void first() {
        driver.get("https://influential.co/");
    }

    @Test
    public void second() {
        driver.get("https://influential.co/");
    }
}
