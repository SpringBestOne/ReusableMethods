package zODEVLER;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.sDemoPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Configration_sDemo {

        /*
     1- Navigate to  https://www.saucedemo.com/
     2- Enter the username  as standard_user
     3- Enter the password as   secret_sauce
     4- Click on login button
     5- Choose price low to high
       and verify that PRICE (LOW TO HIGH) is visible
     */

    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("sDemo"));
        Actions actions=new Actions(Driver.getDriver());
        sDemoPage sDemoPage=new sDemoPage();
        sDemoPage.userName.sendKeys(ConfigReader.getProperty("sDemoUserName"));
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("sDemoPassword")).perform();
        sDemoPage.login.click();

        sDemoPage.ddm.click();
        Select select= new Select(sDemoPage.ddm);
        select.selectByVisibleText("Price (low to high)");

        Assert.assertTrue(sDemoPage.ddm.isDisplayed());




    }
}
