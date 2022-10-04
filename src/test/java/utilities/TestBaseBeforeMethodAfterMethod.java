package utilities;


import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public abstract class TestBaseBeforeMethodAfterMethod {
    protected WebDriver driver;
    protected String tarih;

    //TestNG frameworkunde @Before ve @After Notasyonları yerine @BeforeMethod ve @AfterMethod kullanılır
    // çalışma prensibi, J Unit deki  @Before ve @After daki ile aynıdır.

    @BeforeMethod(groups = {"gp1", "gp2"})
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("YYMMddHHmmss");
        tarih = date.format(formater);
    }
    @AfterMethod(groups = {"gp1", "gp2"})
    public void tearDown() {
        //driver.quit();
    }
}