package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PageValidation {
//creating an instance of a driver with WebDriver

    private WebDriver driver;

    public PageValidation(WebDriver driver) {
        this.driver = driver;
//Locating elements needed for the Page_Validation class
    }

    @FindBy(xpath = "//input[contains(@value,'radio2')]")
    WebElement Radio2button;

    @FindBy(xpath = "//input[contains(@placeholder,'Type to Select Countries')]")
    WebElement TypeCountry;

    @FindBy(xpath = "//select[contains(@name,'dropdown-class-example')]")
    WebElement DropDownExample;

    @FindBy(xpath = "//input[contains(@value,'option2')]")
    WebElement Option2;

    @FindBy(xpath = "//input[contains(@value,'option3')]")
    WebElement Option3;

    @FindBy(xpath = "//input[contains(@value,'option1')]")
    WebElement Option1;


    @FindBy(id = "courses-iframe")
    WebElement iframename;


//validating if there are iframes
    public void validate_Iframe_present(){

        iframename.isDisplayed();
    }

    //creating a method to click Radio2 button
    public void Click_Radio2button() {
        WebDriverWait radiobutton = new WebDriverWait(driver, 15);
        radiobutton.until(ExpectedConditions.visibilityOf(Radio2button));

        Radio2button.click();
    }
//creating a method to select a suggestion class
    public void Enter_Country() throws InterruptedException {
        TypeCountry.sendKeys("South Africa");
    }


//

//creating a method to select Option3 in the dropdown
    public void Select_Option3() {
        Select dropdown = new Select(DropDownExample);
        dropdown.selectByVisibleText("Option3");
    }
//creating a method to check option2
    public void Check_option2() {
        Option2.click();
    }

    public void Check_option3() {
        Option3.click();
    }

    public void Uncheck_option2() {
        Option2.click();
    }

    public void Check_option1() {
        Option1.click();

    }

    public void teardown() {
        driver.quit();

    }

}
