package com.zerobank.step_Defnitions;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PayBillStepDef {


    @When("the user navigates to Pay Bills page")
    public void the_user_navigates_to_Pay_Bills_page() {

        Driver.get().findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/ul/li[4]/a")).click();

        BrowserUtils.waitFor(2);
    }


    @When("the user enter amount {string} and description {string} and the other options")
    public void the_user_enter_amount_and_description_and_the_other_options(String amount, String date) {


        WebElement dropdownElement = Driver.get().findElement(By.name("payee"));

        //open the dropdown
        dropdownElement.click();

        List<WebElement> listofOptions = Driver.get().findElements(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div/article/fieldset/div[1]/div/select/option"));

        //size of the list
        System.out.println("Number of links " + listofOptions.size());

        //text of first element in the list

        System.out.println(listofOptions.get(0).getText());
        //print text of each link
        for (WebElement link : listofOptions) {
            System.out.println(link.getText());
        }

        //locate the element and clicking it
        //driver.findElement(By.linkText("Yahoo")).click();

        //index of the list and click
        listofOptions.get(2).click();


        WebElement dropdownElement2 = Driver.get().findElement(By.name("account"));

        //open the dropdown
        dropdownElement2.click();

        List<WebElement> listofOptions2 = Driver.get().findElements(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div/article/fieldset/div[2]/div/select/option"));
        //size of the list
        System.out.println("Number of links " + listofOptions2.size());

        //text of first element in the list

        System.out.println(listofOptions2.get(0).getText());
        //print text of each link

        for (WebElement link : listofOptions2) {
            System.out.println(link.getText());
        }

        //locate the element and clicking it
        //driver.findElement(By.linkText("Yahoo")).click();

        //index of the list and click
        listofOptions2.get(3).click();

        WebElement amountInputbox = Driver.get().findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div/article/fieldset/div[3]/div/input"));

        amountInputbox.sendKeys(amount);

        WebElement dateInputbox = Driver.get().findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div/article/fieldset/div[4]/div/input"));

        dateInputbox.sendKeys(date);


        WebElement descripInputbox = Driver.get().findElement(By.id("sp_description"));

        descripInputbox.sendKeys("Car bills");


        Driver.get().findElement(By.id("pay_saved_payees")).click();


    }

    @Then("{string} should be displayed.")
    public void should_be_displayed(String expectedMessage) {
        WebElement messageElement = Driver.get().findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div/span"));
        String actualMessage = messageElement.getText();

        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @When("user entering all options without amount")
    public void user_entering_all_options_without_amount() {

        WebElement dropdownElement = Driver.get().findElement(By.name("payee"));

        //open the dropdown
        dropdownElement.click();

        List<WebElement> listofOptions = Driver.get().findElements(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div/article/fieldset/div[1]/div/select/option"));

        //size of the list
        System.out.println("Number of option " + listofOptions.size());

        //text of first element in the list

        System.out.println(listofOptions.get(0).getText());
        //print text of each link
        for (WebElement option : listofOptions) {
            System.out.println(option.getText());
        }

        //locate the element and clicking it
        //driver.findElement(By.linkText("Yahoo")).click();

        //index of the list and click
        listofOptions.get(2).click();


        WebElement dropdownElement2 = Driver.get().findElement(By.name("account"));

        //open the dropdown
        dropdownElement2.click();

        List<WebElement> listofOptions2 = Driver.get().findElements(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div/article/fieldset/div[2]/div/select/option"));
        //size of the list
        System.out.println("Number of options " + listofOptions2.size());

        //text of first element in the list

        System.out.println(listofOptions2.get(0).getText());
        //print text of each link

        for (WebElement option : listofOptions2) {
            System.out.println(option.getText());
        }

        //locate the element and clicking it
        //driver.findElement(By.linkText("Yahoo")).click();

        //index of the list and click
        listofOptions2.get(3).click();

        WebElement dateInputbox = Driver.get().findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div/article/fieldset/div[4]/div/input"));

        dateInputbox.sendKeys("2020-01-10");


        WebElement descripInputbox = Driver.get().findElement(By.id("sp_description"));

        descripInputbox.sendKeys("Car bills");


        Driver.get().findElement(By.id("pay_saved_payees")).click();

        BrowserUtils.waitFor(2);

    }

    @Then("message should displayed {string}")
    public void message_should_displayed(String expectedMessage) throws InterruptedException {


        String actualMessage = Driver.get().findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div/article/fieldset/div[3]/div/input")).getAttribute("validationMessage");
        Thread.sleep(2000);

        System.out.println(expectedMessage+" = expectedMessage");
        System.out.println(actualMessage+" = actualMessage");

        Assert.assertEquals(expectedMessage,actualMessage);
        System.out.println(expectedMessage+" = expectedMessage");
        System.out.println(actualMessage+" = actualMessage");


    }

    @When("user entering all options without date")
    public void user_entering_all_options_without_date() {
        WebElement dropdownElement = Driver.get().findElement(By.name("payee"));

        //open the dropdown
        dropdownElement.click();

        List<WebElement> listofOptions = Driver.get().findElements(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div/article/fieldset/div[1]/div/select/option"));

        //size of the list
        System.out.println("Number of links "+listofOptions.size());

        //text of first element in the list

        System.out.println(listofOptions.get(0).getText());
        //print text of each link
        for (WebElement link : listofOptions) {
            System.out.println(link.getText());
        }

        //locate the element and clicking it
        //driver.findElement(By.linkText("Yahoo")).click();

        //index of the list and click
        listofOptions.get(2).click();



        WebElement dropdownElement2 = Driver.get().findElement(By.name("account"));

        //open the dropdown
        dropdownElement2.click();

        List<WebElement> listofOptions2 = Driver.get().findElements(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div/article/fieldset/div[2]/div/select/option"));
        //size of the list
        System.out.println("Number of links "+listofOptions2.size());

        //text of first element in the list

        System.out.println(listofOptions2.get(0).getText());
        //print text of each link

        for (WebElement link : listofOptions2) {
            System.out.println(link.getText());
        }

        //locate the element and clicking it
        //driver.findElement(By.linkText("Yahoo")).click();

        //index of the list and click
        listofOptions2.get(3).click();

        WebElement amountInputbox = Driver.get().findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div[1]/form/div[1]/div/article/fieldset/div[3]/div/input"));

        amountInputbox.sendKeys("100");

        WebElement descripInputbox = Driver.get().findElement(By.id("sp_description"));

        descripInputbox.sendKeys("Car bills");


        Driver.get().findElement(By.id("pay_saved_payees")).click();

        BrowserUtils.waitFor(2);

    }
}