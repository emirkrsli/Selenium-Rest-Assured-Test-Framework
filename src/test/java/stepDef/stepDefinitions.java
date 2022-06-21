package stepDef;


import io.cucumber.java.en.*;
import org.testng.Assert;

public class stepDefinitions {

    @Given("Print hello to the console")
    public void print_hello_to_the_console() {
        System.out.println("Hello world");
        Assert.assertTrue(true);
    }
}
