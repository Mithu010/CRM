package stepDefinations;

import com.crm.base.TestBase;
import com.crm.pages.HomePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination extends TestBase{

	 @Given("^Intialize browser with mozilla$")
	    public void intialize_browser_with_mozilla() throws Throwable {
	       
		 initialization();
		 
	    }

	 @Given("^Navigate to url \"([^\"]*)\"$")
	    public void navigate_to_url_something(String strArg1) throws Throwable {
	        
		   driver.get(strArg1);
	    }

	    @Given("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	    	
	    	HomePage hp= new HomePage();
	    	
	    	hp.DemoLinkVerify();
	        
	    }

	   

	    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logsin$")
	    public void user_enters_something_and_something_and_logsin(String strArg1, String strArg2) throws Throwable {
	       
         HomePage hp= new HomePage();
	    	
	    	hp.DemoLink();
	    	
	    	System.out.println(strArg1);
	    	
	    	System.out.println(strArg2);
	    }

	    @Then("^Verify that user is successfully logged in$")
	    public void verify_that_user_is_successfully_logged_in() throws Throwable {
	     
	    	
	    	driver.close();
	    	
	    }

	   

}
