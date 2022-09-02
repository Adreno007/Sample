package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    public WebDriver driver;

    private String UserName = "adreno1@mailinator.com";
    private String Password = "Ann@1999";




    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }


    public void Login(){
        driver.findElement(By.id("email")).sendKeys(UserName);
        driver.findElement(By.id("txtPassword")).sendKeys(Password);
        driver.findElement(By.id("loginBtn")).click();
    }

    public boolean LoginVerify() {
        Login();
        return driver.getCurrentUrl().contains("user");
    }

    public boolean CheckUIs(){
        Login();
        return driver.getPageSource().contains("Ankit");
    }
}

