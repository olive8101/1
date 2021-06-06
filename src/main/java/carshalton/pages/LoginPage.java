package carshalton.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class LoginPage extends ExtendedPageObject{

    @FindBy(className="v-btn__content")
    WebElement username_text;
    public void waitForemailField(){
        withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.name("email"));
//        return username_text.getText();
    }

    @FindBy(xpath = "//*[contains(@class,'alert-danger')]")
    WebElement error_message;
    public String getErrorMessage() {
        withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//*[contains(@class,'alert-danger')]"));
        return error_message.getText();
    }

    @FindBy(id = "login-button")
    WebElement login_btn;
    public void clickOnLoginButton() throws InterruptedException{
        waitForPageLoaded();
        withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.id("login-button"));
        login_btn.click();
    }

}
