package carshalton.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class LandingPage extends ExtendedPageObject{
    public void openURL() throws InterruptedException {
        waitForPageLoaded();
        waitForPageLoaded();
        String url = "https://dev.app.trackmatrix.com/";
//      sString url = System.getProperty("URL");
        ChromeOptions opt = new ChromeOptions();
        //opt.addArguments("--no-sandbox");
        //    opt.addArguments("--headless");
        // opt.addArguments("--disable-dev-shm-usage");
        opt.addArguments("window-size=3157,1183");
        opt.addArguments("--kiosk");
        //getDriver().manage().window().maximize();
        if (url == null) {
            throw new InterruptedException("URL is null");
        }
        getDriver().get(url);
    }

    public void quitBrowser() {
        getDriver().close();
    }

    @FindBy(name = "email")
    WebElementFacade email;

    public void setEmail(String strUsername) throws InterruptedException {
        waitForPageLoaded();
        waitForPageLoaded();
        withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.name("email"));
        email.sendKeys(strUsername);
    }

    @FindBy(name = "password")
    WebElementFacade pass;

    public void setPassword(String strPasss) throws InterruptedException {
        waitForPageLoaded();
        pass.sendKeys(strPasss);
        Thread.sleep(999);
    }

    @FindBy(xpath = "//button[text()='Sign in']")
    WebElement btn;

    public void clickLoginBtn() throws InterruptedException {
        waitForPageLoaded();
        Thread.sleep(1999);
        getDriver().findElement(By.xpath("//button[@type='submit']//span[contains(text(),'Login')]")).click();
        waitForPageLoaded();
    }

    @FindBy(xpath = "//div[@class='main-title']")
    WebElement popup_heading;

    public String getPopupHeading() throws InterruptedException {
        waitForPageLoaded();
        getDriver().manage().window().maximize();
        Thread.sleep(4999);
        return popup_heading.getText();

    }

    @FindBy(xpath = "//*[text()='Dashboard']")
    WebElement popup_heading2;

    public String getPopupHeading2() throws InterruptedException {
        waitForPageLoaded();
        withTimeoutOf(15,TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//div[contains(text(),'Dashboard')]"));
        int len= getDriver().findElements(By.xpath("(//span[@class='v-btn__content'])")).size();
        if ((len>0)){
            getDriver().findElement(By.xpath("(//span[@class='v-btn__content'])[1]")).click();
        }
        String str = popup_heading2.getText();
        return str;

    }

    @FindBy(xpath = "//*[text()='Collection']")
    WebElement collection_tab;

    public void clickOnCollectionTab() {
        collection_tab.click();
    }

    @FindBy(xpath = "//*[text()='Delivery']")
    WebElement delivery_tab;

    public void clickOnDeliveryTab() {
        delivery_tab.click();
    }

    public boolean checkCollectionTabElement() {
        clickOnCollectionTab();
        waitForTextToAppear("Order Now For Collection");
        withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//*[text()='Order Now For Collection']"));
        withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//*[contains(text(),'ORDER NOW')]"));
        return true;
    }

    public boolean checkDeliveryTabElement() {
        clickOnDeliveryTab();
        waitForTextToAppear("Order Now For Delivery");
        withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//*[text()='Order Now For Collection']"));
        withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//input[@placeholder=\"Enter your postcode to begin\"]"));
        withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//*[contains(text(),'ORDER NOW')]"));
        return true;
    }

    public void clickOnGivenButton(String btnName) throws InterruptedException {
        String xpathExpression = "//*[contains(text(),'" + btnName + "')]";
        getDriver().findElement(By.xpath(xpathExpression)).click();

    }

    @FindBy(xpath = "//a[text()='Orders']")
    WebElement oroder;
    @FindBy(xpath = "(//button/span//i[contains(@class,'mdi-plus')])[2]")
    WebElement add_icon;

    public void createAOrder() throws InterruptedException {
        oroder.click();
        withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("(//button/span//i[contains(@class,'mdi-plus')])[1]"));
        Thread.sleep(1999);
        add_icon.click();
        Random rn = new Random();
        int qty = rn.nextInt(10) + 1;
        withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//*[@type='text' and @required='required']"));
        getDriver().findElement(By.xpath("//*[@type='text' and @required='required']")).sendKeys("" + qty);
        clickOnGivenButton("Review Order");
        clickOnGivenButton("Submit Order");

    }

    public String getHeading() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitForPresenceOf(By.className("headline"));
        return getDriver().findElements(By.className("headline")).get(0).getText();
    }

    @FindBy(xpath = "//h2[text()='Dashboard']")
    WebElementFacade dashboard_elm;
    public boolean dashboard_page_is_displayed() throws InterruptedException {
        waitForPageLoaded();
        withTimeoutOf(5, TimeUnit.SECONDS).waitForPresenceOf(By.xpath("//h2[text()='Dashboard']"));
        return dashboard_elm.isDisabled();

    }


    public void user_click_on_the_tab(String string) {
        String xpath_newportal = "//a[text()='"+string+"']";
        getDriver().findElement(By.xpath(xpath_newportal)).click();
    }


    public String user_can_see_the_new_portal() throws InterruptedException {
        waitForPageLoaded();
        return getDriver().getCurrentUrl();

    }


    public void openurlp() throws InterruptedException {
        waitForPageLoaded();
        waitForPageLoaded();
        String url = "https://dev.app.trackmatrix.com/login";
        getDriver().get(url);

    }


}
