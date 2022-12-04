package com.github.simileyskiy.stepdefs;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.NoSuchElementException;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class LoginSteps {


    @When("I navigate to {string}")
    public void iNavigateTo(String url) {
        open(url);

    }

    @And("I login with the username {string} and password {string}")
    public void iLogin(String username, String password) {

        $(byId("username")).sendKeys(username);
        $(byId("password")).sendKeys(password);
    }

    @And("I click Submit")
    public void iPressSubmit() {
        $(byCssSelector("button")).scrollTo();
        $(byCssSelector("button")).click();
    }

    @Then("I should be see the message {string}")
    public void iShouldSee(String result) {
        try {
            $(byXpath("//*[contains(text(), '" + result + "')]")).should(Condition.exist);
        } catch (NoSuchElementException e) {
            throw new AssertionError(
                    "\"" + result + "\" not available in results");
//        } finally {
//                getWebDriver().quit();
        }
    }
}

