package zODEVLER;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.YouTubePage;
import utilities.Driver;

public class YoutubeAssertions {
    /*
1) Bir class oluşturun: YoutubeAssertions
2) https://www.youtube.com adresine gidin
3) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin
    ○ titleTest => Sayfa başlığının "YouTube" oldugunu test edin
    ○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
    ○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
    ○ wrongTitleTest => Sayfa basliginin "youtube" olmadigini dogrulayin
 */
    SoftAssert softAssert=new SoftAssert();
    YouTubePage youtubePage=new YouTubePage();
    @Test (priority = 0)
    public void titleTest01() {
      //  https://www.youtube.com adresine gidin
        Driver.getDriver().get("https://www.youtube.com");
       // titleTest => Sayfa başlığının "YouTube" oldugunu test edin
    String actualTitle=Driver.getDriver().getTitle();
    String expectedTitle="YouTube";
    softAssert.assertEquals(expectedTitle,actualTitle);

    }

    @Test(priority = 1)
    public void imageTest02() {
        //imageTest => YouTube resminin görüntülendiğini (isDisplayed())
        softAssert.assertTrue(youtubePage.YouTubeLogosu.isDisplayed());

    }

    @Test(dependsOnMethods = "imageTest02",priority = 2)
    public void SBtest03() {
        //Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        softAssert.assertTrue(youtubePage.YoutubeSB.isEnabled());

    }

    @Test(priority = 3)
    public void WrongTitletest04() {
        //wrongTitleTest => Sayfa basliginin "youtube" olmadigini dogrulayin
        softAssert.assertNotEquals(Driver.getDriver().getTitle(),"youtube");
        softAssert.assertAll();
    }
}
