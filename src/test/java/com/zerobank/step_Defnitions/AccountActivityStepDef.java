package com.zerobank.step_Defnitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class AccountActivityStepDef {


    @When("the user navigates to Account Activity")
    public void the_user_navigates_to_Account_Activity() {

        Driver.get().findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/ul/li[2]/a")).click();

        BrowserUtils.waitFor(2);

    }

    @When("the user navigates to Account drop down")
    public void the_user_navigates_to_Account_drop_down() {

        Driver.get().findElement(By.name("accountId")).click();
        BrowserUtils.waitFor(2);

    }

    @Then("the default option should be {string}")
    public void the_default_option_should_be(String string) {
        Select account = new Select(Driver.get().findElement(By.name("accountId")));

        String actualOption=account.getFirstSelectedOption().getText();

        String expected="Savings";
        //getOptions--> returns all the available options from the dropdown list

        Assert.assertEquals(actualOption,expected);

        System.out.println(actualOption+"=actualoption");
        System.out.println(expected+"=expectedoption");
        BrowserUtils.waitFor(2);

    }

    @Then("the user should see dropdown options")
    public void the_user_should_see_dropdown_options(List<String>expectedOption) {

        AccountActivityPage dropDownOptions= new AccountActivityPage();
        List<WebElement> actual=dropDownOptions.repeatOptionsList().getOptions();

        ArrayList<String>actualString=new ArrayList<>();

        for( WebElement list:actual){

            actualString.add(list.getText());

        }
        System.out.println(actualString+"=actualoption");
        System.out.println(expectedOption+"=expectedoption");
        Assert.assertEquals(expectedOption,actualString);
    }

    @Then("the user should see tabelerow")
    public void the_user_should_see_tabelerow(List<String>expectedTable) {

        List<WebElement> Table = Driver.get().findElements((By.xpath("//th")));

        System.out.println("Number of columns " + Table);

        ArrayList<String>tableActual=new ArrayList<>();
        //print each column name one by one
        for (WebElement header : Table) {

            tableActual.add(header.getText());
        }
        System.out.println(tableActual+"=tableActual");
        System.out.println(expectedTable+"=expectedTable");
        Assert.assertEquals(expectedTable,tableActual);


    }


}