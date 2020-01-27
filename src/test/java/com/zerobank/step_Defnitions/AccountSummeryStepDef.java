package com.zerobank.step_Defnitions;

import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AccountSummeryStepDef {

    @Then("the user should see the following account table types")
    public void the_user_should_see_the_following_account_table_types(List<String> expectedTable) {
        List<WebElement> Table = Driver.get().findElements((By.cssSelector("h2.board-header")));

        System.out.println("Number of columns " + Table);

        ArrayList<String> tableActual=new ArrayList<>();
        //print each column name one by one
        for (WebElement header : Table) {

            tableActual.add(header.getText());
        }
        System.out.println(tableActual+"=tableActual");
        System.out.println(expectedTable+"=expectedTable");
        Assert.assertEquals(expectedTable,tableActual);
    }


    @Then("the user should see the following credit account columns")
    public void the_user_should_see_the_following_credit_account_columns(List<String>  expectedTable) {


        List<WebElement> Table = Driver.get().findElements((By.xpath("//div[3]//tr/th")));

        System.out.println("Number of columns " + Table);

        ArrayList<String> tableActual=new ArrayList<>();
        //print each column name one by one
        for (WebElement header : Table) {

            tableActual.add(header.getText());
        }
        System.out.println(tableActual+"=tableActual");
        System.out.println(expectedTable+"=expectedTable");
        Assert.assertEquals(expectedTable,tableActual);
    }


    }

