package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C01_BeforeMethodAfterMethod extends TestBaseBeforeMethodAfterMethod {

    //TestNG frameworkunde @Before ve @After Notasyonları yerine @BeforeMethod ve @AfterMethod kullanılır
    // çalışma prensibi, J Unit deki  @Before ve @After daki ile aynıdır.
    @Test
    public void amazonTesti() {
        driver.get("https://amazon.com");

    }

    @Test(groups="gp1")
    public void bestBuyTesti() {
        driver.get("https://bestbuy.com");

    }

    @Test
    public void techproTesti() {
        driver.get("https://techproeducation.com");

    }
}
