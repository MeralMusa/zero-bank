package com.zerobank.step_Defnitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginStepDef {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        System.out.println("Opening the login page");
        //Driver.get()--> this gets the webdriver
        //driver ==Driver.get()
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        BrowserUtils.waitFor(1);

    }

    @When("user logs in using {string} and {string}")
    public void user_logs_in_using_and(String username, String password) {

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
        BrowserUtils.waitFor(3);

    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        String actualUrl = Driver.get().getCurrentUrl();
        String expectedurl="http://zero.webappsecurity.com/bank/account-summary.html";
        Assert.assertEquals(expectedurl,actualUrl);
        BrowserUtils.waitFor(3);

    }

    @Then("the title should contains {string}")
    public void the_title_should_contains(String title) {


        String actualTitle = Driver.get().getTitle();

        Assert.assertEquals(title,actualTitle);
        BrowserUtils.waitFor(1);

    }

    @Then("the unauthorized user should not be able to login")
    public void the_unauthorized_user_should_not_be_able_to_login() {


        String actualUrl = Driver.get().getCurrentUrl();
        String expectedurl="http://zero.webappsecurity.com/login.html?login_error=true";
        Assert.assertEquals(expectedurl,actualUrl);
        BrowserUtils.waitFor(1);


    }
    @Then("the message should contains {string}")
    public void the_message_should_contains(String message) {

        WebElement actuelMessage = Driver.get().findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/form/div[1]"));

        String actm=actuelMessage.getText();

        String expectedMassege=message;

        Assert.assertEquals(actm,expectedMassege);

        System.out.println("actuellmessage="+actm);
        System.out.println("expectedmessage ="+expectedMassege);
        BrowserUtils.waitFor(1);


    }



}