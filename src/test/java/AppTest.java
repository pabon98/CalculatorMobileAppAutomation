import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppTest {
    private AndroidDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        Capabilities options = new BaseOptions()
                .amend("platformName", "android")
                .amend("appium:automationName", "UiAutomator2")
                .amend("appium:uuid", "926c8bac")
                .amend("appium:deviceName", "Xiaomi 11 Lite 5G NE")
                .amend("appium:appPackage", "com.google.android.calculator")
                .amend("appium:appActivity", "com.android.calculator2.Calculator")
                .amend("appium:ensureWebviewsHavePages", true)
                .amend("appium:nativeWebScreenshot", true)
                .amend("appium:newCommandTimeout", 3600)
                .amend("appium:connectHardwareKeyboard", true);

        URL remoteUrl = new URL("http://127.0.0.1:4723");

        driver = new AndroidDriver(remoteUrl, options);
    }

    @Test
    public void sumOfNumbers() {
        WebElement el1 = driver.findElement(AppiumBy.accessibilityId("1"));
        el1.click();
        WebElement el2 = driver.findElement(AppiumBy.accessibilityId("0"));
        el2.click();
        WebElement el3 = driver.findElement(AppiumBy.accessibilityId("plus"));
        el3.click();
        WebElement el4 = driver.findElement(AppiumBy.accessibilityId("9"));
        el4.click();
        WebElement el5 = driver.findElement(AppiumBy.accessibilityId("0"));
        el5.click();
        WebElement el6 = driver.findElement(AppiumBy.accessibilityId("equals"));
        el6.click();
        WebElement el7 = driver.findElement(AppiumBy.accessibilityId("clear"));
        el7.click();
    }
    @Test
    public void divisiOfNumber(){
        WebElement el8 = driver.findElement(AppiumBy.accessibilityId("5"));
        el8.click();
        WebElement el9 = driver.findElement(AppiumBy.accessibilityId("0"));
        el9.click();
        WebElement el10 = driver.findElement(AppiumBy.accessibilityId("divide"));
        el10.click();
        WebElement el11 = driver.findElement(AppiumBy.accessibilityId("5"));
        el11.click();
        WebElement el12 = driver.findElement(AppiumBy.accessibilityId("equals"));
        el12.click();
        WebElement el13 = driver.findElement(AppiumBy.accessibilityId("clear"));
        el13.click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
