package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    public WebDriver driver;

    private String UserName = "abhishu99@gmail.com";
    private String Password = "Frugal@123";




    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }




    public void Login(){
        driver.findElement(By.id("email")).sendKeys(UserName);
        driver.findElement(By.id("txtPassword")).sendKeys(Password);
        driver.findElement(By.id("loginBtn")).click();
    }

    @Step("1st")
    public boolean LoginVerify() {
        Login();
        return driver.getCurrentUrl().contains("user");
    }

    @Step("2nd")
    public boolean CheckUIs(){
        Login();
        return driver.getPageSource().contains("Abhishu");
    }
}

