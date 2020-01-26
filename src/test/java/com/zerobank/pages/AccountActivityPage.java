package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityPage {


    public AccountActivityPage(){
        PageFactory.initElements(Driver.get(), this);
    }



        @FindBy(xpath="//*[@id='aa_accountId']")
    public WebElement repeatOptions;
    public Select repeatOptionsList(){
        return new Select(repeatOptions);


    }



}


