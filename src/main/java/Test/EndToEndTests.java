package Test;

import Pages.PageValidation;
import Setup.Setup_Class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
//Running the class
public class EndToEndTests {
    private WebDriver driver = Setup_Class.startBrowserOfChoice("https://rahulshettyacademy.com/AutomationPractice/", "chrome");
    PageValidation pagevalidation= PageFactory.initElements(driver,PageValidation.class);



    @Test
    public void PageValidationTest() throws InterruptedException {
    pagevalidation.validate_Iframe_present();
    pagevalidation.Click_Radio2button();
    pagevalidation.Enter_Country();
    Thread.sleep(2000);
    pagevalidation.Select_Option3();
    pagevalidation.Check_option2();
    pagevalidation.Check_option3();
    pagevalidation.Uncheck_option2();
    pagevalidation.Check_option1();


    }

}



