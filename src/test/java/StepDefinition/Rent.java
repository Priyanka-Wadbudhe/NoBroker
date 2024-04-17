package StepDefinition;

import org.testng.Assert;
import org.testng.AssertJUnit;
import java.awt.AWTException;
import java.util.List;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import DriverSetup.SetupDriver;
import Page.Login;
import Page.RentFac;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Rent 
{
	
	static WebDriver driver;
	RentFac objFac;
	Login log;
	
	@Given("User is on the homepage of NoBroker website")
	public void user_is_on_the_homepage_of_no_broker_website() {
	    driver=SetupDriver.chromedriver();  
//		driver=SetupDriver.edgedriver();  
	}
	
	
    //------------------------------ Scenario 1 - [Search Functionality] ---------------------------------------------------


	@When("User selects the location from the dropdown list")
	public void user_selects_the_location_from_the_dropdown_list() throws InterruptedException, AWTException {
		objFac= new RentFac(driver);
		
		objFac.selectCity();
	    
	}

	@And("User enters and select the locality from the dropdown list")
	public void user_enters_and_select_the_locality_from_the_dropdown_list() throws InterruptedException, AWTException {
		objFac.selectLocalities();
	}

	@And("User clicks on the option from the Property type options displayed")
	public void user_clicks_on_the_option_from_the_property_type_options_displayed() {
		objFac.selectPropertyType();
	}

	@And("User User selects BHK type from the dropdown list")
	public void user_user_selects_bhk_type_from_the_dropdown_list() throws InterruptedException, AWTException {
		objFac= new RentFac(driver);
		objFac.selectBHKType();
	}

	@And("User selects the Availability from the dropdown list")
	public void user_selects_the_availability_from_the_dropdown_list() throws AWTException, InterruptedException {
		objFac.selectPropertyStatus();
	}

	@And("User clicks on the search button")
	public void user_clicks_on_the_search_button() throws InterruptedException {
		objFac.search();
	}

	@Then("User should see a list of properties matching the search criteria")
	public void user_should_see_a_list_of_properties_matching_the_search_criteria() {
		String actual = driver.getCurrentUrl();
		String expected = "https://www.nobroker.in/property/rent/mumbai/Airoli?searchParam=W3sibGF0IjoxOS4xNTkwMTQsImxvbiI6NzIuOTk4NTY4NiwicGxhY2VJZCI6IkNoSUpxN1hZUFZLXzV6c1JZZHBoT2ZlbjZaMCIsInBsYWNlTmFtZSI6IkFpcm9saSJ9XQ==&radius=2.0&sharedAccomodation=0&type=BHK2&availability=within_30_days&city=mumbai&locality=Airoli";
		AssertJUnit.assertEquals(expected, actual);
		
	}
	
	@AfterStep
	public static void takeScreendown1(Scenario scenerio) {
		TakesScreenshot ts= (TakesScreenshot) driver;
		final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		scenerio.attach(src, "image/png",scenerio.getName());
	}


    //------------------------------ Scenario 2 - [Rent Receipt] ---------------------------------------------------

	

	@When("User clicks on the Menu tab")
	public void user_clicks_on_the_menu_tab() throws InterruptedException {
		objFac = new RentFac(driver);
		objFac.clickMenuTab();	    
	}

	@When("User clicks on the Rent Receipt option")
	public void user_clicks_on_the_rent_receipt_option() throws InterruptedException {
		objFac.clickRentReceiptOption();	    
	}

	@When("^user fill out the rent receipt form with (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), and (.*)$")
	public void user_fill_out_the_rent_receipt_form_with_and(String tenantName, String ownerName, String tenantPhone, String ownerPhone, String rent, String ownerPAN, String rentedPropertyAddress, String ownerAddress, String receiptStartDate, String receiptEndDate, String email) throws InterruptedException {
		objFac.fillRentReceiptForm(tenantName, ownerName, tenantPhone , ownerPhone, rent, ownerPAN, rentedPropertyAddress, ownerAddress, receiptStartDate, receiptEndDate, email);
	}

	@When("User clicks on Generate Rent Receipt Now button")
	public void user_clicks_on_generate_rent_receipt_now_button() throws InterruptedException {
		objFac.clickGenerateRentReceiptButton();
	}

	@Then("User should see a Congratulations message and the option to download rent receipt")
	public void user_should_see_a_congratulations_message_and_the_option_to_download_rent_receipt() throws InterruptedException {
		objFac = new RentFac(driver);
		AssertJUnit.assertTrue(objFac.isMessageDisplayed());
	}
	
	@AfterStep
	public static void takeScreendown2(Scenario scenerio) {
		TakesScreenshot ts= (TakesScreenshot) driver;
		final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		scenerio.attach(src, "image/png",scenerio.getName());
	}




    //------------------------------ Scenario 3 - [Pay Rent] ---------------------------------------------------

	
	
	@When("User clicks on the Pay Rent tab")
	public void user_clicks_on_the_pay_rent_tab() throws InterruptedException {
		objFac = new RentFac(driver);
		objFac.clickPayRent();
	}

	@And("User selects the Payment Type from the dropdown list")
	public void user_selects_the_payment_type_from_the_dropdown_list() throws InterruptedException, AWTException {
		objFac = new RentFac(driver);
		objFac.selectPaymentType();
	}

	@And("User enters {string} their Name")
	public void user_enters_their_name(String name) throws InterruptedException {
		objFac.enterName(name);
	}

	@And("User enters their {string} Mobile Number")
	public void user_enters_their_mobile_number(String mobileNumber) throws InterruptedException {
		objFac.enterMobileNumber(mobileNumber);
	}

	@And("User enters their {string} Email")
	public void user_enters_their_email(String email) throws InterruptedException {
		objFac.enterEmail(email);
	}

	@And("User clicks the checkbox to agree to the Terms and Conditions")
	public void user_clicks_the_checkbox_to_agree_to_the_terms_and_conditions() throws InterruptedException {
		objFac.agreeToTermsAndConditions();
	}

	@And("User clicks on the Get Started button")
	public void user_clicks_on_the_get_started_button() throws InterruptedException {
		objFac.clickGetStartedButton();
	}

	@Then("User should receive pop-up for entering a verification code")
	public void user_should_receive_pop_up_for_entering_a_verification_code() throws InterruptedException {
		objFac = new RentFac(driver);
		AssertJUnit.assertTrue(objFac.isVerificationCodePopupDisplayed()); 
	}
	
	@AfterStep
	public static void takeScreendown3(Scenario scenerio) {
		TakesScreenshot ts= (TakesScreenshot) driver;
		final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		scenerio.attach(src, "image/png",scenerio.getName());
	}


    //------------------------------ Scenario 4 - [Save Search] ---------------------------------------------------


	
	@When("User logged in to the NoBroker website")
	public void user_logged_in_to_the_no_broker_website() throws InterruptedException {
	    log = new Login(driver);
	    log.userLogin();
	}
	
	@When("User navigates to the property listing page")
	public void user_navigates_to_the_property_listing_page() {
		driver.get("https://www.nobroker.in/property/sale/mumbai/Airoli?searchParam=W3sibGF0IjoxOS4xNTkwMTQsImxvbiI6NzIuOTk4NTY4NiwicGxhY2VJZCI6IkNoSUpxN1hZUFZLXzV6c1JZZHBoT2ZlbjZaMCIsInBsYWNlTmFtZSI6IkFpcm9saSJ9XQ==&radius=2.0&city=mumbai&locality=Airoli");
	}

	@And("User clicks on the Save Search option")
	public void user_clicks_on_the_save_search_option() throws InterruptedException {
		objFac = new RentFac(driver);
	    objFac.clickSaveSearch();
	}

	@And("User enters and selects location from the avilable options in a list")
	public void user_enters_and_selects_location_from_the_avilable_options_in_a_list(DataTable location) throws InterruptedException, AWTException {
		objFac= new RentFac(driver);
		
		List<List<String>> cells= location.cells();
		objFac.selectLocation(cells.get(0).get(0)); 
	}
   
	@And("User selects the house type")
	public void user_selects_the_house_type() throws InterruptedException {
	    objFac.selectHouseType();
	}
	
	@And("User selects the property type")
	public void user_selects_the_property_type() throws InterruptedException {
	    objFac.propertyType();
	}
	
	@And("User sets the budget from min budget to max budget")
	public void user_sets_the_budget_from_min_budget_to_max_budget() throws InterruptedException {
	    objFac.slideMinBudget();
	    objFac.slideMaxBudget();
	}

	@And("User selects the furnishing type")
	public void user_selects_the_furnishing_type() throws InterruptedException {
	    objFac.selectFurnishingType();
	}

	@And("User enters specific requirements")
	public void user_enters_specific_requirements(DataTable requirement) throws InterruptedException {	
		List<List<String>> cells= requirement.cells();
		objFac.enterRequirements(cells.get(0).get(0)); 
	}

	@And("User clicks on the Save Alert button")
	public void user_clicks_on_the_save_alert_button() throws InterruptedException {
	    objFac.clickSaveAlert();
	}

	@Then("User should see relevant message")
	public void user_should_see_relevant_message() {
		Assert.assertTrue(objFac.isMsgDisplayed2());
	}
	
	
	
	@AfterStep
	public static void takeScreendown4(Scenario scenerio) {
		TakesScreenshot ts= (TakesScreenshot) driver;
		final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		scenerio.attach(src, "image/png",scenerio.getName());
	}


    
    //------------------------------ Scenario 5 - [Refer & Earn] ---------------------------------------------------
	
	
	
	@When("User is logged in to the NoBroker website")
	public void user_is_logged_in_to_the_no_broker_website() throws InterruptedException {
		log = new Login(driver);
	    log.userLogin();
	}

	@When("User clicks on the menu option")
	public void user_clicks_on_the_menu_option() throws InterruptedException {
		objFac = new RentFac(driver);
		objFac.clickMenuTab();	   
	}

	@When("User clicks on the Refer & Earn option")
	public void user_clicks_on_the_refer_earn_option() throws InterruptedException {
		objFac.clickReferAndEarn();
	}

	@When("User clicks on the Enter Owner Details button")
	public void user_clicks_on_the_enter_owner_details_button() throws InterruptedException {
		objFac.clickOwnerDetailsBtn();

	}

	@When("User selects the city from the dropdown list")
	public void user_selects_the_city_from_the_dropdown_list() throws InterruptedException, AWTException {
		objFac.city();	
	}

	@When("User enters the mobile number")
	public void user_enters_the_mobile_number(DataTable Mobno) throws InterruptedException {
		List<List<String>> cells= Mobno.cells();
		objFac.enterMobNo(cells.get(0).get(0));
	}

	@When("User enters the Owner name")
	public void user_enters_the_owner_name(DataTable name) throws InterruptedException {
		List<List<String>> cells= name.cells();
        objFac.enterOwnerName(cells.get(0).get(0));
	}

	@When("User selects the property type from the dropdown list")
	public void user_selects_the_property_type_from_the_dropdown_list() throws InterruptedException, AWTException {
	    objFac.selectProperty();
	}

	@When("User enters the detail in tell us more section")
	public void user_enters_the_detail_in_tell_us_more_section(DataTable data) throws InterruptedException {
		List<List<String>> cells= data.cells();
		objFac.tellUsMore(cells.get(0).get(0));
	}

	@Then("User clicks on the Send Details button")
	public void user_clicks_on_the_send_details_button(String name) throws InterruptedException {
	    objFac.sendDetailsBtn();
	    
	    Thread.sleep(1000);
    	Assert.assertTrue(name.matches("^[A-Za-z\\s]+$"));
	    System.out.println("Owner name field should contains characters only.");
	}
	
	@AfterStep
	public static void takeScreendown5(Scenario scenerio) {
		TakesScreenshot ts= (TakesScreenshot) driver;
		final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		scenerio.attach(src, "image/png",scenerio.getName());
	}

}





/*

package StepDefinition;

import org.testng.annotations.AfterMethod;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import DriverSetup.SetupDriver;
import Page.Login;
import Page.RentFac;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
//import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Rent 
{
	
	static WebDriver driver;
	RentFac objFac;
	Login log;
	
	@Given("User is on the homepage of NoBroker website")
	public void user_is_on_the_homepage_of_no_broker_website() {
//	    driver=SetupDriver.chromedriver();  
		driver=SetupDriver.edgedriver();  
	}

	@When("User selects the location from the dropdown list")
	public void user_selects_the_location_from_the_dropdown_list() throws InterruptedException, AWTException {
		objFac= new RentFac(driver);
		
		objFac.selectCity();
	    
	}

	@And("User enters and select the locality from the dropdown list")
	public void user_enters_and_select_the_locality_from_the_dropdown_list() throws InterruptedException, AWTException {
		//objFac= new RentFac(driver);
		objFac.selectLocalities();
	}

	@And("User clicks on the option from the Property type options displayed")
	public void user_clicks_on_the_option_from_the_property_type_options_displayed() {
		objFac.selectPropertyType();
	}

	@And("User User selects BHK type from the dropdown list")
	public void user_user_selects_bhk_type_from_the_dropdown_list() throws InterruptedException, AWTException {
		objFac= new RentFac(driver);
		objFac.selectBHKType();
	}

	@And("User selects the Availability from the dropdown list")
	public void user_selects_the_availability_from_the_dropdown_list() throws AWTException, InterruptedException {
		//objFac= new RentFac(driver);
		objFac.selectPropertyStatus();
	}

	@And("User clicks on the search button")
	public void user_clicks_on_the_search_button() throws InterruptedException {
		objFac.search();
	}

	@Then("User should see a list of properties matching the search criteria")
	public void user_should_see_a_list_of_properties_matching_the_search_criteria() {
		String actual = driver.getCurrentUrl();
		String expected = "https://www.nobroker.in/property/rent/mumbai/Airoli?searchParam=W3sibGF0IjoxOS4xNTkwMTQsImxvbiI6NzIuOTk4NTY4NiwicGxhY2VJZCI6IkNoSUpxN1hZUFZLXzV6c1JZZHBoT2ZlbjZaMCIsInBsYWNlTmFtZSI6IkFpcm9saSJ9XQ==&radius=2.0&sharedAccomodation=0&type=BHK2&availability=within_30_days&city=mumbai&locality=Airoli";
		AssertJUnit.assertEquals(expected, actual);
		
	}
	
	@AfterStep
	public static void takeScreendown1(Scenario scenerio) {
		   TakesScreenshot ts= (TakesScreenshot) driver;
		   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		   scenerio.attach(src, "image/png",scenerio.getName());
	}


//===========================================================================================================================================


	

	@When("User clicks on the Menu tab")
	public void user_clicks_on_the_menu_tab() throws InterruptedException {
		objFac = new RentFac(driver);
		objFac.clickMenuTab();	    
	}

	@When("User clicks on the Rent Receipt option")
	public void user_clicks_on_the_rent_receipt_option() throws InterruptedException {
		objFac.clickRentReceiptOption();	    
	}

	@When("user fill out the rent receipt form with {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, and {string}")
	public void user_fill_out_the_rent_receipt_form_with_and(String tenantName, String ownerName, String tenantPhone, String ownerPhone, String rent, String ownerPAN, String rentedPropertyAddress, String ownerAddress, String receiptStartDate, String receiptEndDate, String email) throws InterruptedException {
		objFac.fillRentReceiptForm(tenantName, ownerName, tenantPhone , ownerPhone, rent, ownerPAN, rentedPropertyAddress, ownerAddress, receiptStartDate, receiptEndDate, email);
	}

	@When("User clicks on Generate Rent Receipt Now button")
	public void user_clicks_on_generate_rent_receipt_now_button() throws InterruptedException {
		objFac.clickGenerateRentReceiptButton();
	}

	@Then("User should see a Congratulations message and the option to download rent receipt")
	public void user_should_see_a_congratulations_message_and_the_option_to_download_rent_receipt() throws InterruptedException {
		objFac = new RentFac(driver);
		AssertJUnit.assertTrue(objFac.isMessageDisplayed());
	}
	
	@AfterStep
	public static void takeScreendown2(Scenario scenerio) {
		   TakesScreenshot ts= (TakesScreenshot) driver;
		   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		   scenerio.attach(src, "image/png",scenerio.getName());
	}



//======================================================================================================================



//	@When("User logged in to the NoBroker website")
//	public void user_is_logged_in_to_the_no_broker_website() throws InterruptedException {
//		driver=SetupDriver.chromedriver();
//		log = new Login(driver);
//		//log.userLogin();
//	}
	
	@When("User clicks on the Pay Rent tab")
	public void user_clicks_on_the_pay_rent_tab() throws InterruptedException {
		objFac = new RentFac(driver);
		objFac.clickPayRent();
	}

	@And("User selects the Payment Type from the dropdown list")
	public void user_selects_the_payment_type_from_the_dropdown_list() throws InterruptedException, AWTException {
		objFac = new RentFac(driver);
		objFac.selectPaymentType();
	}

	@And("User enters {string} their Name")
	public void user_enters_their_name(String name) throws InterruptedException {
//		objFac = new RentFac(driver);
		objFac.enterName(name);
	}

	@And("User enters their {string} Mobile Number")
	public void user_enters_their_mobile_number(String mobileNumber) throws InterruptedException {
//		objFac = new RentFac(driver);
		objFac.enterMobileNumber(mobileNumber);
	}

	@And("User enters their {string} Email")
	public void user_enters_their_email(String email) throws InterruptedException {
//		objFac = new RentFac(driver);
		objFac.enterEmail(email);
	}

	@And("User clicks the checkbox to agree to the Terms and Conditions")
	public void user_clicks_the_checkbox_to_agree_to_the_terms_and_conditions() throws InterruptedException {
//		objFac = new RentFac(driver);
		objFac.agreeToTermsAndConditions();
	}

	@And("User clicks on the Get Started button")
	public void user_clicks_on_the_get_started_button() throws InterruptedException {
//		objFac = new RentFac(driver);
		objFac.clickGetStartedButton();
	}

	@Then("User should receive pop-up for entering a verification code")
	public void user_should_receive_pop_up_for_entering_a_verification_code() throws InterruptedException {
		objFac = new RentFac(driver);
		AssertJUnit.assertTrue(objFac.isVerificationCodePopupDisplayed()); 
	}
	
	@AfterStep
	public static void takeScreendown3(Scenario scenerio) {
		   TakesScreenshot ts= (TakesScreenshot) driver;
		   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		   scenerio.attach(src, "image/png",scenerio.getName());
	}


//===============================================================================================================




	@When("User logged in to the NoBroker website")
	public void user_logged_in_to_the_no_broker_website() throws InterruptedException {
	    log = new Login(driver);
	    log.userLogin();
	}
	
	@When("User navigates to the property listing page")
	public void user_navigates_to_the_property_listing_page() {
		driver.get("https://www.nobroker.in/property/sale/mumbai/Airoli?searchParam=W3sibGF0IjoxOS4xNTkwMTQsImxvbiI6NzIuOTk4NTY4NiwicGxhY2VJZCI6IkNoSUpxN1hZUFZLXzV6c1JZZHBoT2ZlbjZaMCIsInBsYWNlTmFtZSI6IkFpcm9saSJ9XQ==&radius=2.0&city=mumbai&locality=Airoli");
	}

    
//	@And("User enters and select the Locality from the dropdown list")
//	public void user_enters_and_select_the_locality_from_the_list(DataTable locality) throws AWTException, InterruptedException{
//		objFac = new RentFac(driver);
//		List<String> data= locality.asList(String.class);
//		objFac.locality(data.get(0));
//	}
//	
//	@And("User clicks on the Search Icon and navigates to next page")
//	public void user_clicks_on_the_search_icon_and_navigates_to_next_page() throws InterruptedException {
//	    objFac.search();
//	}

	@And("User clicks on the Save Search option")
	public void user_clicks_on_the_save_search_option() throws InterruptedException {
		objFac = new RentFac(driver);
	    objFac.clickSaveSearch();
	}

	@And("User enters and selects location from the avilable options in a list")
	public void user_enters_and_selects_location_from_the_avilable_options_in_a_list(DataTable location) throws InterruptedException, AWTException {
		objFac= new RentFac(driver);
//		List<String> data= location.asList(String.class);
//		
//		objFac.selectLocation(data.get(0));
		
		List<List<String>> cells= location.cells();
		objFac.selectLocation(cells.get(0).get(0)); 
	}

//	@And("User selects the tenant type")
//	public void user_selects_the_tenant_type() throws InterruptedException {
//	    objFac.selectTenantType();
//	}
    
	@And("User selects the house type")
	public void user_selects_the_house_type() throws InterruptedException {
	    objFac.selectHouseType();
	}
	
	@And("User selects the property type")
	public void user_selects_the_property_type() throws InterruptedException {
	    objFac.propertyType();
	}
	
	@And("User sets the budget from min budget to max budget")
	public void user_sets_the_budget_from_min_budget_to_max_budget() throws InterruptedException {
	    objFac.slideMinBudget();
	    objFac.slideMaxBudget();
	}

	@And("User selects the furnishing type")
	public void user_selects_the_furnishing_type() throws InterruptedException {
	    objFac.selectFurnishingType();
	}

//	@And("User sets shifting date shifting date")
//	public void user_sets_shifting_date_shifting_date() throws InterruptedException {
//	    objFac.setShiftingDate();
//	}

	@And("User enters specific requirements")
	public void user_enters_specific_requirements(DataTable requirement) throws InterruptedException {
//        List<String> data= requirement.asList(String.class);
//		
//		objFac.enterRequirements(data.get(0)); 
		
		List<List<String>> cells= requirement.cells();
		objFac.enterRequirements(cells.get(0).get(0)); 
	}

	@And("User clicks on the Save Alert button")
	public void user_clicks_on_the_save_alert_button() throws InterruptedException {
	    objFac.clickSaveAlert();
	}

	@Then("User should see relevant message")
	public void user_should_see_relevant_message() {
		Assert.assertTrue(objFac.isMsgDisplayed2());
	}
	
	
	
	@AfterStep
	public static void takeScreendown4(Scenario scenerio) {
		   TakesScreenshot ts= (TakesScreenshot) driver;
		   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		   scenerio.attach(src, "image/png",scenerio.getName());
	}


    
//=====================================================================================================================================
	
	
	
	@When("User is logged in to the NoBroker website")
	public void user_is_logged_in_to_the_no_broker_website() throws InterruptedException {
		log = new Login(driver);
	    log.userLogin();
	}

	@When("User clicks on the menu option")
	public void user_clicks_on_the_menu_option() throws InterruptedException {
		objFac = new RentFac(driver);
		objFac.clickMenuTab();	   
	}

	@When("User clicks on the Refer & Earn option")
	public void user_clicks_on_the_refer_earn_option() throws InterruptedException {
		objFac.clickReferAndEarn();
	}

	@When("User clicks on the Enter Owner Details button")
	public void user_clicks_on_the_enter_owner_details_button() throws InterruptedException {
		objFac.clickOwnerDetailsBtn();

	}

	@When("User selects the city from the dropdown list")
	public void user_selects_the_city_from_the_dropdown_list() throws InterruptedException, AWTException {
		objFac.city();	
	}

	@When("User enters the mobile number")
	public void user_enters_the_mobile_number(DataTable Mobno) throws InterruptedException {
		List<List<String>> cells= Mobno.cells();
		objFac.enterMobNo(cells.get(0).get(0));
	}

	@When("User enters the Owner name")
	public void user_enters_the_owner_name(DataTable name) throws InterruptedException {
		List<List<String>> cells= name.cells();
        objFac.enterOwnerName(cells.get(0).get(0));
        
 
//      Assert.assertEquals("^[A-Za-z\\s]+$", name);  
	}

	@When("User selects the property type from the dropdown list")
	public void user_selects_the_property_type_from_the_dropdown_list() throws InterruptedException, AWTException {
	    objFac.selectProperty();
	}

	@When("User enters the detail in tell us more section")
	public void user_enters_the_detail_in_tell_us_more_section(DataTable data) throws InterruptedException {
		List<List<String>> cells= data.cells();
		objFac.tellUsMore(cells.get(0).get(0));
	}

	@Then("User clicks on the Send Details button")
	public void user_clicks_on_the_send_details_button(String name) throws InterruptedException {
	    objFac.sendDetailsBtn();
	    
	    Thread.sleep(1000);
	    //Assert.assertEquals("^[A-Za-z\\s]+$", name); 

	    	Assert.assertTrue(name.matches("^[A-Za-z\\s]+$"));
	    
	    System.out.println("Owner name field should contains characters only.");
	    
	}
	
	@AfterStep
	public static void takeScreendown5(Scenario scenerio) {
		   TakesScreenshot ts= (TakesScreenshot) driver;
		   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		   scenerio.attach(src, "image/png",scenerio.getName());
	}

}






*/

















//******************************************************** SEPERATE FILES ************************************************************************

//==============================================Scenario 1 - [Search]=============================================================

//package StepDefinition;
//
//import java.awt.AWTException;
//
//
//import org.junit.Assert;
//import org.openqa.selenium.WebDriver;
//
//
//import DriverSetup.SetupDriver;
//import Page.RentFac;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//
//public class Rent {
//	
//	static WebDriver driver;
//	RentFac nbf;
//	
//	@Given("User is on the homepage of NoBroker website")
//	public void user_is_on_the_homepage_of_no_broker_website() {
//		driver=SetupDriver.chromedriver();  
//	}
//
//	@When("User selects the location from the dropdown list")
//	public void user_selects_the_location_from_the_dropdown_list() throws InterruptedException, AWTException {
//		nbf= new RentFac(driver);
//		
//		nbf.selectCity();
//	    
//	}
//
//	@And("User enters and select the locality from the dropdown list")
//	public void user_enters_and_select_the_locality_from_tyhe_dropdown_list() throws InterruptedException, AWTException {
//		//nbf= new RentFac(driver);
//		nbf.selectLocalities();
//	}
//
//	@And("User clicks on the option from the Property type options displayed")
//	public void user_clicks_on_the_option_from_the_property_type_options_displayed() {
//		nbf.selectPropertyType();
//	}
//
//	@And("User User selects BHK type from the dropdown list")
//	public void user_user_selects_bhk_type_from_the_dropdown_list() throws InterruptedException, AWTException {
//		nbf= new RentFac(driver);
//		nbf.selectBHKType();
//	}
//
//	@And("User selects the Availability from the dropdown list")
//	public void user_selects_the_availability_from_the_dropdown_list() throws AWTException, InterruptedException {
//		//nbf= new RentFac(driver);
//		nbf.selectPropertyStatus();
//	}
//
//	@And("User clicks on the search button")
//	public void user_clicks_on_the_search_button() throws InterruptedException {
//		nbf.search();
//	}
//
//	@Then("User should see a list of properties matching the search criteria")
//	public void user_should_see_a_list_of_properties_matching_the_search_criteria() {
//		String actual = driver.getCurrentUrl();
//		String expected = "https://www.nobroker.in/property/rent/mumbai/Airoli?searchParam=W3sibGF0IjoxOS4xNTkwMTQsImxvbiI6NzIuOTk4NTY4NiwicGxhY2VJZCI6IkNoSUpxN1hZUFZLXzV6c1JZZHBoT2ZlbjZaMCIsInBsYWNlTmFtZSI6IkFpcm9saSJ9XQ==&radius=2.0&sharedAccomodation=0&type=BHK2&availability=within_30_days&city=mumbai&locality=Airoli";
//		Assert.assertEquals(expected, actual);
//		
////		driver.close();
//	}
//	
//}




//==============================================Scenario 2 - [RentReceipt]=====================================================


//@RentReceipt


//package StepDefinition;
//
//import org.junit.Assert;
//
//import org.openqa.selenium.WebDriver;
//
//
//import DriverSetup.SetupDriver;
//import Page.RentFac;
//import io.cucumber.java.After;
////import io.cucumber.java.After;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Rent 
//{
//	static WebDriver driver;
//	RentFac rrf;
//	
//	
//	@Given("User is on the homepage of the NoBroker website")
//	public void user_is_on_the_homepage_of_the_no_broker_website() {
//		driver=SetupDriver.chromedriver();
////		driver=SetupDriver.edgedriver();
//	}
//
//	@When("User clicks on the Menu tab")
//	public void user_clicks_on_the_menu_tab() throws InterruptedException {
//	    rrf = new RentFac(driver);
//	    rrf.clickMenuTab();	    
//	}
//
//	@When("User clicks on the Rent Receipt option")
//	public void user_clicks_on_the_rent_receipt_option() throws InterruptedException {
//		rrf.clickRentReceiptOption();	    
//	}
//
//	@When("user fill out the rent receipt form with {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, and {string}")
//	public void user_fill_out_the_rent_receipt_form_with_and(String tenantName, String ownerName, String tenantPhone, String ownerPhone, String rent, String ownerPAN, String rentedPropertyAddress, String ownerAddress, String receiptStartDate, String receiptEndDate, String email) throws InterruptedException {
//	    rrf.fillRentReceiptForm(tenantName, ownerName, tenantPhone , ownerPhone, rent, ownerPAN, rentedPropertyAddress, ownerAddress, receiptStartDate, receiptEndDate, email);
//	}
//
//	@When("User clicks on Generate Rent Receipt Now button")
//	public void user_clicks_on_generate_rent_receipt_now_button() throws InterruptedException {
//	    rrf.clickGenerateRentReceiptButton();
//	}
//
//	@Then("User should see a Congratulations message and the option to download rent receipt")
//	public void user_should_see_a_congratulations_message_and_the_option_to_download_rent_receipt() {
//		rrf = new RentFac(driver);
//		Assert.assertTrue(rrf.isMessageDisplayed());
//	}
//	
//	@After
//    public void tearDown() {
//        driver.quit();
//    }
//
//}

//======================================================Scenario 3 - [PayRent]=============================================================

//@PayRent


//package StepDefinition;
//
//import static org.testng.Assert.assertTrue;
//
//import java.awt.AWTException;
//
//import org.openqa.selenium.WebDriver;
//
//import Page.Login;
//import Page.RentFac;
//import DriverSetup.SetupDriver;
//import io.cucumber.java.After;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Rent
//{
//	static WebDriver driver;
//	RentFac prf;
//	Login log;
//	
//	@Given("User logged in to the NoBroker website")
//	public void user_is_logged_in_to_the_no_broker_website() throws InterruptedException {
//		driver=SetupDriver.chromedriver();
//		log = new Login(driver);
//		//log.userLogin();
//	}
//	
//	@When("User clicks on the Pay Rent tab")
//	public void user_clicks_on_the_pay_rent_tab() throws InterruptedException {
//		prf = new RentFac(driver);
//		prf.clickPayRent();
//	}
//
//	@And("User selects the Payment Type from the dropdown list")
//	public void user_selects_the_payment_type_from_the_dropdown_list() throws InterruptedException, AWTException {
//		prf = new RentFac(driver);
//		prf.selectPaymentType();
//	}
//
//	@And("User enters {string} their Name")
//	public void user_enters_their_name(String name) throws InterruptedException {
////		prf = new RentFac(driver);
//		prf.enterName(name);
//	}
//
//	@And("User enters their {string} Mobile Number")
//	public void user_enters_their_mobile_number(String mobileNumber) throws InterruptedException {
////		prf = new RentFac(driver);
//		prf.enterMobileNumber(mobileNumber);
//	}
//
//	@And("User enters their {string} Email")
//	public void user_enters_their_email(String email) throws InterruptedException {
////		prf = new RentFac(driver);
//		prf.enterEmail(email);
//	}
//
//	@And("User clicks the checkbox to agree to the Terms and Conditions")
//	public void user_clicks_the_checkbox_to_agree_to_the_terms_and_conditions() throws InterruptedException {
////		prf = new RentFac(driver);
//		prf.agreeToTermsAndConditions();
//	}
//
//	@And("User clicks on the Get Started button")
//	public void user_clicks_on_the_get_started_button() throws InterruptedException {
////		prf = new RentFac(driver);
//		prf.clickGetStartedButton();
//	}
//
//	@Then("User should receive pop-up for entering a verification code")
//	public void user_should_receive_pop_up_for_entering_a_verification_code() {
//		assertTrue(prf.isVerificationCodePopupDisplayed()); 
//	}
//	
//	@After
//    public void tearDown() {
//        driver.quit();
//    }
//
//
//}



//======================================================Scenario 4 - [SaveSearch]=============================================================


//package StepDefinition;
//
//import org.openqa.selenium.WebDriver;
//
//import DriverSetup.SetupDriver;
//import Page.Login;
//import Page.RentFac;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Rent
//{
//	static WebDriver driver;
//	RentFac ssf;
//	Login log;
//	
//
//	@Given("User logged in to the NoBroker website")
//	public void user_logged_in_to_the_no_broker_website() {
//		driver=SetupDriver.chromedriver();
//		log = new Login(driver);
//	}
//
//	@When("User enters and select the locality from the dropdown list")
//	public void user_enters_and_select_the_locality_from_the_dropdown_list(io.cucumber.datatable.DataTable dataTable) {
//		ssf= new RentFac(driver);
//		ssf.selectLocalities();
//	}
//
//	@When("User clicks on the search button and navigates to next page")
//	public void user_clicks_on_the_search_button_and_navigates_to_next_page() {
//	    
//	}
//
//	@When("User clicks on the Save Search option")
//	public void user_clicks_on_the_save_search_option() {
//	    
//	}
//
//	@When("User enters and selects {string}, {string}, sets budget from {string} to {string}, selects {string}, {string}, {string}, sets shifting date {string}, and enters specific requirements {string}")
//	public void user_enters_and_selects_sets_budget_from_to_selects_sets_shifting_date_and_enters_specific_requirements(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, io.cucumber.datatable.DataTable dataTable) {
//	    
//	}
//
//	@When("User clicks on the Save Alert button")
//	public void user_clicks_on_the_save_alert_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User should see relevant message")
//	public void user_should_see_relevant_message() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//}











