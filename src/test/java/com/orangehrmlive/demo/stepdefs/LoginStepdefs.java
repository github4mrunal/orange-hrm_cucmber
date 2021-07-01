package com.orangehrmlive.demo.stepdefs;

import com.orangehrmlive.demo.pages.AdminPage;
import com.orangehrmlive.demo.pages.Homepage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStepdefs {
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
        new Homepage();
    }

    @And("^I enter Username \"([^\"]*)\"$")
    public void iEnterUsername(String username)  {
        new Homepage().clickOnUserName(username);
    }

    @And("^I enter Password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new Homepage().clickOnPassword(password);

    }

    @When("^I click on Login Button$")
    public void iClickOnLoginButton() {
        new Homepage().clickOnLoginButton();
    }

    @Then("^I should successfully navigate to Admin Page and see message \"([^\"]*)\"$")
    public void iShouldSuccessfullyNavigateToAdminPageAndSeeMessage(String welmessage)  {
        welmessage = new AdminPage().verifyAndClickOnWelcomeTxt();
        Assert.assertTrue( welmessage.contains( "Welcome" ) );

    }

    @When("^I click on Logout Button$")
    public void iClickOnLogoutButton() {
        new AdminPage().clickOnLogutButton();
    }

    @Then("^I should Logout Successfully and see \"([^\"]*)\"$")
    public void iShouldLogoutSuccessfullyAndSee(String lgpnl)  {
        Assert.assertEquals(lgpnl,new Homepage().verifyLoginPanelTxt());

    }
}


