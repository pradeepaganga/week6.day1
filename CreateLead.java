package step;



	import org.openqa.selenium.By;

	import io.cucumber.java.en.And;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class CreateLead extends BaseClass{
		
		@When("Click on Create Lead")
		public void clickCreateLead() {
			// TODO Auto-generated method stub
			driver.findElement(By.linkText("Create Lead")).click();

		}
		
		@Given("Enter company name as {string}")
		public void enter_company_name_as_test_leaf(String company) {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		}

		
		@And("Enter First name as {string}")
		public void firstName(String fName) {
			// TODO Auto-generated method stub
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		}
		
		@And("Enter Last name as {string}")
	public void lastName(String lName) {
			// TODO Auto-generated method stub
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);

		}
		
		@And("Enter phone as {string}")
		
		public void phonenumber(String phno) {
			// TODO Auto-generated method stub
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		}
		
		
	@When("click on submitbutton")
	public void submit() {
		// TODO Auto-generated method stub
		driver.findElement(By.name("submitButton")).click();
	}
		

	@Then("Verify create lead page is displayed")

	public  void VerifyCreateLead() {
		// TODO Auto-generated method stub
		
		if(driver.getTitle().equals("View Lead | opentaps CRM"))
		{
			System.out.println("Create Lead is successful");
		}

	}
	}

	
	
	

