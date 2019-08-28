package stepDefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination {

  @Given("^User is on netbanking Landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
       System.out.println("Given A"); 
    }
 /* @When("^ User login to application with \"([^\"]*)\" and password \"([^\"]*)\"$")
  public void user_login_to_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
      throw new PendingException();
  }  */
  
  @When("^ User login to application with username and password$")
    public void user_login_to_application_with_username_and_password() throws Throwable {
    	  System.out.println("When B"); 
    }
    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	  System.out.println("Then C"); 
    }
    @And("^cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	  System.out.println("AND D"); 
    }

}