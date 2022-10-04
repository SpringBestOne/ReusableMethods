package tests.day18;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HmcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_ConfigReader {
    @Test(groups  ="gp2")
    public void test01() {

        //https://www.hotelmycamp.com adresine git

        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
//login butonuna bas
        HmcPage hmcPage=new HmcPage();
//pageClassındaki locatelerimize ulaşabilmek icin pageClassımızdan bir obje olusturarak olusturmus olduğumuz
        //obje ile page classımızdaki locatelerimize ulasabiliriz

        hmcPage.login.click();
//test data username: manager ,
        hmcPage.userName.sendKeys(ConfigReader.getProperty("user"));
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password")).
                sendKeys(Keys.ENTER).perform();

//test data password : Manager1!
//Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
//         */

        Assert.assertTrue(hmcPage.girisYapildi.isDisplayed());
    }
}