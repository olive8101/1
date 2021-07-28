package carshalton.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TemplatePage extends ExtendedPageObject{

    @FindBy(xpath = "//span[text()='Templates']")
    WebElementFacade templates;
    public void clickOnOpenBlockIcon(){
        waitForRenderedElements(By.xpath("//span[@title='Open Blocks']"));
        templates.click();
    }

    @FindBy(xpath = "//div[@title='1 Column']")
    WebElementFacade column1;
    @FindBy(id = "wrapper")
    WebElementFacade wrapper_elements;
    public void selectAFormAndDragAndDrop() throws InterruptedException{
        clickOnOpenBlockIcon();
        Thread.sleep(1999);
        waitForRenderedElements(By.xpath("(//div[@class='preview-wrapper'])[1]"));
        getDriver().findElement(By.xpath("(//div[@class='preview-wrapper'])[1]")).click();
        //(new Actions(getDriver())).dragAndDrop(column1, wrapper_elements).perform();
        Thread.sleep(3999);
    }

    public void clickOnSaveBtn(){
        waitForRenderedElements(By.xpath("//span[text()='SAVE']"));
        getDriver().findElement(By.xpath("//span[text()='SAVE']")).click();
    }

    public void enterTemplateName()throws InterruptedException{
        String name = TestDataSetup.getProductName();
        getDriver().findElement(By.xpath("(//div[contains(@class,'v-dialog')]//input)[1]")).sendKeys(name);
        Thread.sleep(999);
        getDriver().findElement(By.xpath("(//div[contains(@class,'v-dialog')]//span[text()='Save'])[1]")).click();
    }
}
