package step;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends BaseClass {

	@When("Click find leads")
	public void findLead() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@And("Click on phone")
	public void clickPhoneNumber() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

	}
	@Given("Send phone number as {string}")
	public void enterPhoneNumber(String phno) {
		// TODO Auto-generated method stub
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);

	}
	@When("Find Leads")
	public void findLeadClick() {
		// TODO Auto-generated method stub

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

	}
	
	
	@Given("update company name as {string}")
	public void updateCompanyName(String company) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(company);

	}
	@When("Submit Edit Details")
	public void submitEdit() {
		// TODO Auto-generated method stub
		driver.findElement(By.name("submitButton")).click();

	}
	@Then("Verify Edited Title Page")
	public void verifyTitle() {
		// TODO Auto-generated method stub
		String actTitle="View Lead | opentaps CRM";
		String expTitle=driver.getTitle();
		
		Assert.assertEquals(actTitle,expTitle);
		System.out.println("Edit Lead is successful");
	
		
		
		
			
		
			
}
}
