package carshalton.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ManageProduct extends ExtendedPageObject{
    TestDataSetup testDataSetup;
    public void clickOnmanageProductsTab(String tab){
        withTimeoutOf(15, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//a//div[text()='Manage Products']"));
        String xpathExpression = "//a//div[text()='"+tab+"']";
        getDriver().findElement(By.xpath(xpathExpression)).click();

    }

    @FindBy(xpath = "//div//span[text()='All Products']")
    WebElementFacade manege_pag_heading;
    public String getManageProductPageHeaing() throws InterruptedException{
        waitForPageLoaded();
        withTimeoutOf(10,TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//div//span[text()='All Products']"));
        return manege_pag_heading.getText();
    }

    public void clickOnGivenButton(String btn) throws InterruptedException{
        String xpathExpression ="//span[contains(text(),'"+btn+"')]";
        getDriver().findElement(By.xpath(xpathExpression)).click();
    }

    @FindBy(xpath = "(//label[text()='Product Name']/following-sibling::input)")
    WebElementFacade product_name;
    public void fillProductName()throws InterruptedException{
        Random rnd = new Random();
        int n = 100000 + rnd.nextInt(900000);
        String productName = "product_"+n;
        waitForRenderedElements(By.xpath("(//label[text()='Product Name']/following-sibling::input)"));
        product_name.sendKeys(productName);
        testDataSetup.setProductName(productName);
    }

    @FindBy(className = "notification-content")
    WebElementFacade message_content;
    public String getSucessMessage() throws InterruptedException {
        withTimeoutOf(10,TimeUnit.SECONDS).waitForPresenceOf(By.className("notification-content"));
        String msg = message_content.getText();
        return msg;
    }

    public void activateTheProductStatus() throws Throwable{
        withTimeoutOf(25,TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//input[@role='switch']"));
        getDriver().findElement(By.xpath("//label[text()='De-activate']")).click();
    }

}
