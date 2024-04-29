package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.SaucePage;
import utilities.Config;
import utilities.Driver;

public class TestClass {
    WebDriver driver;
    SaucePage saucePage = new SaucePage();
    @Test
    public void test(){
        driver = Driver.getDriver();
        driver.get("https://www.saucedemo.com/");
        saucePage.userName.sendKeys("standard_user");
        saucePage.password.sendKeys("secret_sauce");
        saucePage.login.click();
       // System.out.println(Assertions.assertEquals(saucePage.logi));
        Assertions.assertEquals("https://www.saucedemo.com/",Config.getProperty("sauceDemo"));
    }
    @Test
    public void test2(){

    }


}

