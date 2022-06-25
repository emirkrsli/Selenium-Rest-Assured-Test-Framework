package stepDef;

import io.cucumber.java.en.*;
import utils.Driver;

public class CommonStepDefinitions {

    /**
     * Launches browser according to given browser name
     * @param browser the name of browser that will be launched. ex:chrome
     */
    @Given("Launch browser for {string}")
    public void launch_browser_for(String browser) {
        switch (browser) {
            case "chrome":
                Driver.getDriver("chrome");


        }

    }

    @Given("Navigate to {string}")
    public void navigate_to(String string) {

    }

    @When("Click {string} button")
    public void click_on_button(String string) {

    }

    @When("Verify that {string} is visible")
    public void verify_that_is_visible(String string) {

    }

    @When("Select checkbox {string}")
    public void select_checkbox(String string) {

    }

}
