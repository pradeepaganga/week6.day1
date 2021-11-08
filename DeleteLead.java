package step;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DeleteLead extends BaseClass{
	
	String leadID;
	
	@Given("Search by Phone number as {string}")

	public  void searchbyPhone(String phno) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);

	}
	
	@Then("Delete the Lead")
	
	public  void deleteleadID() {
		// TODO Auto-generated method stub
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
	}
	
	
	@Given("Send Lead ID Deleted")
	public void searchByDeleteLead() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	
	@Then("Verify No Records to be displayed")
	
	public void verifyDeleteLead() {
		// TODO Auto-generated method stub
		String text = driver.findElement(By.className("x-paging-info")).getText();
		System.out.println(text);
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}
	
	
}
