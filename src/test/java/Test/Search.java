package Test;

import Base.BaseTest;
import Pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Search extends BaseTest {

    private SearchPage searchPage;

    @BeforeMethod
    public void SetupTest(){
        super.setup();
        searchPage = new SearchPage(driver);
    }

    @AfterMethod
    public void ClearTest(){
        driver.quit();
    }

    @Test
    public void LoginIsWorking() {
        if(!searchPage.LoginVerify())
            Assert.fail();
    }

    @Test
    public void LoggedInOrNot(){
        if(!searchPage.profileUpload())
            Assert.fail();
    }
}


