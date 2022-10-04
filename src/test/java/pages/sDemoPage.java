package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class sDemoPage {

    public sDemoPage() {
        PageFactory.initElements(Driver.getDriver(),this);



    }
    @FindBy(xpath = "//*[@id='user-name']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='login-button']")
    public WebElement login;

    @FindBy(xpath = "//*[@class=\"product_sort_container\"]")
    public WebElement ddm;

}
