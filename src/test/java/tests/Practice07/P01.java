package tests.Practice07;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WebUniversityPage;
import utilities.Driver;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01 {
    // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
// Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
//Tüm yapılacakların üzerini çiz.
//Tüm yapılacakları sil.
//Tüm yapılacakların silindiğini doğrulayın.

    //Exploratory testin..   keşif testi..


    @Test
    public void test01() throws InterruptedException {
        // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
        Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");
        // Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
        WebUniversityPage webUniversityPage=new WebUniversityPage();

        List<String> workList= new ArrayList<> (Arrays.asList("Kahvaltıyı hazırla", "Bulaşıkları yıka", "Bebekle ilgilen", "Çocuğunun ödevine yardım et", "Selenyum çalış", "Uyu"));
        Actions actions=new Actions(Driver.getDriver());

        for (String w:workList) {
            actions.click(webUniversityPage.adNewTodo).sendKeys(w).sendKeys(Keys.ENTER).perform();

        }
        Thread.sleep(2000);
        //Tüm yapılacakların üzerini çiz.
        List<WebElement> todos=webUniversityPage.todosWebElemenrt;
        for (WebElement w:todos) {
            w.click();
        }
        Thread.sleep(2000);
//Tüm yapılacakları sil.
        List<WebElement> deleteButton=webUniversityPage.deleteButtonWebElement;
        for (WebElement w:deleteButton) {
            w.click();
        }

        //Tüm yapılacakların silindiğini doğrulayın.
        Thread.sleep(2000);
        List<WebElement>newtodos=webUniversityPage.todosWebElemenrt;
        Assert.assertEquals(0,newtodos.size());



    }
}
