package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    //same with driver.findElement(By.id("prependedInput"));
    @FindBy(name = "user_login")
    public WebElement usernameInput;

    @FindBy(id = "user_password")
    public WebElement passwordInput;

    @FindBy(name = "submit")
    public WebElement loginBtn;

    public void login(String usernameStr,String passwordStr){

        usernameInput.sendKeys(usernameStr);
        passwordInput.sendKeys(passwordStr);
        loginBtn.click();
    }


}