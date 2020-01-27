package com.zerobank.step_Defnitions;


import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before("@db")
    public void setUpDatabase(){

        System.out.println("\tCONNECTION DATABASE");
        BrowserUtils.waitFor(2);

    }

    @Before
    public void setUp(){

        System.out.println("\tthis is coming from BEFORE");
        BrowserUtils.waitFor(2);

    }

    @After("@db")
    public void tearDownDatabase(){

        System.out.println("\tCLOSING DATABASE CONNECTION");
        BrowserUtils.waitFor(2);

    }

    @After
    public void tearDown(Scenario scenario){

        //if the scenario fails take the screenshot
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png");
        }

        Driver.closeDriver();
        BrowserUtils.waitFor(2);

    }




}
