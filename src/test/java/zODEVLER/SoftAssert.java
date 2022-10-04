package zODEVLER;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Driver;

public class SoftAssert {
    @Test
    public void test01() {

        //    Yeni bir Class Olusturun : C03_SoftAssert
        //"http://zero.webappsecurity.com/"  siteye gidin
       Driver.getDriver().get("http://zero.webappsecurity.com/");

        //Sign in butonuna basin
        Driver.getDriver().findElement(By.xpath("//*[@id='signin_button']")).click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB);
        //Login kutusuna “username” yazin
        actions.sendKeys("Gul",Keys.TAB);
//Password kutusuna “password” yazin
        actions.sendKeys("1234",Keys.TAB);
//Sign in tusuna basin
actions.click().perform();

//Online banking menusu icinde Pay Bills sayfasina gidin
//“Purchase Foreign Currency” tusuna basin
//“Currency” drop down menusunden Eurozone’u secin
//soft assert kullanarak "Eurozone (Euro)" secildigini test edin
//soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
//"Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China  (yuan)",
//"Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong  (dollar)","Japan (yen)",
//"Mexico (peso)","Norway (krone)","New Zealand  (dollar)","Sweden (krona)","Singapore (dollar)",
//"Thailand (baht)"
    }
}