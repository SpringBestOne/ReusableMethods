package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class WebUniversityPage {
    public WebUniversityPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@type=\"text\"]")
    public WebElement adNewTodo;

    @FindBy(xpath ="//li")
    public List<WebElement>todosWebElemenrt;

    @FindBy(xpath ="//*[@class='fa fa-trash']")
    public List<WebElement>deleteButtonWebElement;

    @FindBy(xpath ="//li")
    public List<WebElement>newtodos;

}


