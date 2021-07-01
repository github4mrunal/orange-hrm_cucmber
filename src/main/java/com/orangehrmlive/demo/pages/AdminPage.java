package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends Utility {

    private static final Logger log = LogManager.getLogger(AdminPage.class.getName());

    @FindBy(xpath = "//a[@id = 'welcome']")
    WebElement welcomeTxt;

    @FindBy(xpath = "//a[contains(text(), 'Logout')]")
    WebElement logOut;

    public void clickOnLogutButton(){
        clickOnElement(logOut);
        log.info("Clicking on Log Out Button" +logOut.toString());
    }
    public String verifyAndClickOnWelcomeTxt(){
        clickOnElement(welcomeTxt);
        log.info("Verifying and Clicking on Welcome Text" +welcomeTxt.toString());
        return getTextFromElement(welcomeTxt);
    }


}
