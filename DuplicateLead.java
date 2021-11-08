package step;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DuplicateLead extends BaseClass {
	@Given("Search Leads with phone number as {string}")
	public void findLeadByPhoneNumber(String phno) {
		// TODO Auto-generated method stub
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

	}
	@When("Click on Duplicate Lead")
	public void clickDuplicateLead() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
	
	}
	@And("Click on submit Duplicate Lead")
public void submitDuplicateLead() {
		// TODO Auto-generated method stub
	driver.findElement(By.name("submitButton")).click();
	}
	
	@Then("verify Duplicate Lead")
	public void verifyDuplicateLead() {
		// TODO Auto-generated method stub
		
		String actTitle="View Lead | opentaps CRM";
		String expTitle=driver.getTitle();
		
		Assert.assertEquals(actTitle,expTitle);
		System.out.println("Duplicate is created and page is verified");
		
	}
	
	


}
