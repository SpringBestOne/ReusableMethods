package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_Priority extends TestBaseBeforeMethodAfterMethod {

/*
 TestNG (default) olarak @Test methodlarıni alfabetik sıraya göre run eder. (Yukardan asagi degil!)
 priority annotation Testlere öncelik vermek için kullanılır.
Kucuk olan Numara daha once calisir priority yazmayan Test method'u varsa oncelikle o calisir,
sonra priority yazan testler siralanir

 */

    @Test (priority = 1)
    public void youtubeTesti() {
        driver.get("https://youtube.com");

    }

    @Test  //Burayı 0 Kabul eder, ilk bu çalışır
    public void bestBuyTesti() {
        driver.get("https://bestbuy.com");

    }

    @Test(priority = 2)
    public void amazonesti() {
        driver.get("https://amazon.com");

    }
    @Test(priority = -1, groups = "gp1")
    public void hepsiburadaTesti() {
        driver.get("https://hepsiburada.com");

    }
}



