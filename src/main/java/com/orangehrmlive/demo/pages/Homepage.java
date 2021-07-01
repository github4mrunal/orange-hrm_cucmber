package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Utility {

    private static final Logger log = LogManager.getLogger(Homepage.class.getName());

    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement userName;

    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement passWord;

    @FindBy(xpath = "//input[@id = 'btnLogin']")
    WebElement loginBtn;

    @FindBy(xpath = "//div[@id ='logInPanelHeading']")
    WebElement loginPanelTxt;


    public void clickOnUserName(String str){
        log.info("CLicking on Username" +userName.toString());
        sendTextToElement(userName,str);
    }

    public void clickOnPassword(String pass){
        log.info("Clicking on Password" + passWord.toString());
        sendTextToElement(passWord,pass);
    }
    public void clickOnLoginButton(){
        log.info("CLicking on Login Button" +loginBtn.toString());
        clickOnElement(loginBtn);

    }
    public String verifyLoginPanelTxt(){
        log.info("Verifying Login Panel Text" + loginPanelTxt);
        return getTextFromElement(loginPanelTxt);

    }
}
