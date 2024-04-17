package Page;
 
import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class RentFac 
{
	WebDriver driver;
	WebDriverWait wait;
	
    //------------------------------ WebElements for Scenario 1 - [Search Functionality] ---------------------------------------------------


	@FindBy(xpath = "(//div[@class=\"css-16pqwjk-indicatorContainer nb-select__indicator nb-select__dropdown-indicator\"])[1]")
    WebElement City;
	
	@FindBy(id = "listPageSearchLocality")
	WebElement locality;
	
	@FindBy(xpath = "//label[@for=\"RENT\"]")
	WebElement propertyType;
	
	@FindBy(xpath = "//div[@class=\"nb-select__placeholder\"]")
	WebElement bhkTypeDropdown;
	
	@FindBy(xpath = "(//div[@class=\"css-v2nw5i-control nb-select__control\"])[3]")
	WebElement propertyStatusDropdown;

	@FindBy(xpath = "//button[@class=\"prop-search-button flex items-center justify-center btn btn-primary btn-lg\"]")
	WebElement searchButton;
	
    //------------------------------ WebElements for Scenario 2 - [Rent Receipt] ---------------------------------------------------

	@FindBy(id = "main-menu")
	WebElement menuTab;
	  
	@FindBy(xpath = "//a[text()=\"Rent Receipts\"]")
	WebElement rentReceiptOption;
	  
	@FindBy(xpath = "//input[@placeholder=\"Tenant's Name\"]")
	WebElement tenantNameField;
	  
	@FindBy(xpath = "//input[@placeholder=\"Owner's Name\"]")
	WebElement ownerNameField;
	  
	@FindBy(xpath = "//input[@id=\"rentrecipt-form-tenant_phone-nbInput\"]")
	WebElement tenantPhoneField;
	  
	@FindBy(xpath = "//input[@id=\"rentrecipt-form-owner_phone-nbInput\"]")
	WebElement ownerPhoneField;
	  
	@FindBy(id="rentrecipt-form-rent-nbInput")
	WebElement rentField;
	  
	@FindBy(id="rentrecipt-form-owner_pan-nbInput")
	WebElement ownerPanField;
	  
	@FindBy(xpath = "//textarea[@placeholder=\"Address of property as required in rent receipts\"]")
	WebElement rentedPropertyAddressField;
	  
	@FindBy(xpath = "//textarea[@placeholder=\"Current Adress of the owner as required in rental receipts\"]")
	WebElement ownerAddressField;
	  
	@FindBy(xpath = "(//input[@placeholder=\"Receipt Start Date\"])[1]")
	WebElement receiptStartDateField;
	  
	@FindBy(xpath = "(//input[@placeholder=\"Receipt Start Date\"])[2]")
	WebElement receiptEndDateField;
	  
	@FindBy(xpath = "//input[@id=\"rentrecipt-form-email-nbInput\"]")
	WebElement emailField;
	  
	@FindBy(xpath = "//button[@class=\"submit-form btn btn-default\"]")
	WebElement submitButton;
	  
	
    //------------------------------ WebElements for Scenario 3 - [Pay Rent] ---------------------------------------------------

	@FindBy(xpath = "//div[@class=\"text-header-text-color\"]")
    WebElement payRentTab;

    @FindBy(xpath = "//div[@class=\"css-v2nw5i-control nb-select__control\"]/child::div[2]")
    WebElement paymentTypeSelect;

    @FindBy(id = "tenant_name")
    WebElement nameInput;

    @FindBy(id = "tenant_phone")
    WebElement mobileNumberInput;

    @FindBy(id = "tenant_email")
    WebElement emailInput;
   
    @FindBy(xpath = "//div[@class=\"nb__yEPwf\"]/div/div/label/input")
    WebElement termsAndConditionsCheckbox;
      
    @FindBy(xpath = "//button[@class=\"btn btn-primary btn-block\"]")
    WebElement getStartedButton;

    @FindBy(xpath = "//div[@class=\"content-container \"]")
    WebElement verificationCodePopup;
    
	
    //------------------------------ WebElements for Scenario 4 - [Save Search] ---------------------------------------------------
    
    @FindBy(xpath = "(//div[@class=\"css-16pqwjk-indicatorContainer nb-select__indicator nb-select__dropdown-indicator\"])[1]")
    WebElement LocationField;
	
    @FindBy(id = "listPageSearchLocality")
    WebElement LocalityField;
    
    @FindBy(id = "saveSearch")
    WebElement SaveSearch;
    
    @FindBy(css = "#pyrLocality")
    WebElement Location;

    @FindBy(xpath = "//div[@data-value=\"BHK1\"]")
    WebElement HouseType1;
    
    @FindBy(xpath = "//div[@data-value=\"BHK2\"]")
    WebElement HouseType2;
    
    @FindBy(xpath = "(//div[text()=\"Apartment\"])[1]")
    WebElement PropertyType;
    
    @FindBy(xpath = "(//div[@class=\"rc-slider-handle rc-slider-handle-1\"])[1]")
    WebElement minBudgetSlider;
    
    @FindBy(xpath = "(//div[@class=\"rc-slider-handle rc-slider-handle-2\"])[1]")
    WebElement maxBudgetSlider;
                   
    @FindBy(xpath = "//div[@data-value=\"FULLY_FURNISHED\"]")
    WebElement FurnishingType;

    @FindBy(xpath = "//textarea[@placeholder=\"Please mention here...\"]")
    WebElement Requirements;
    
    @FindBy(xpath = "//button[text()=\"Save Alert\"]")
    WebElement SaveAlertBtn;
    
    @FindBy(xpath = "//div[text()=\"Get email alerts for new properties matching the following\"]")
    WebElement SubmitMessage;
    
	
    //------------------------------ WebElements for Scenario 5 - [Refer & Earn] ---------------------------------------------------
    
    @FindBy(xpath = "//a[text()=\"Refer & Earn\"]")
    WebElement ReferAndEarn;
    
    @FindBy(xpath = "//div[@class=\"nb__K5w6e\"]")
    WebElement EnterOwnerDetailsBtn;
    
    @FindBy(xpath = "(//div[@class=\"css-1hwfws3 nb-select__value-container\"])[1]")
    WebElement CityField;
    
    @FindBy(css = "#formValidationOwnerPhone")
    WebElement MobNo;
    
    @FindBy(css = "#formValidationName")
    WebElement OwnerName;
    
    @FindBy(xpath = "(//div[@class=\"css-v2nw5i-control nb-select__control\"])[2]")
    WebElement PropertyTypeField;
    
    @FindBy(css = "#formUserText")
    WebElement TellUsMore;
    
    @FindBy(xpath = "//button[@class=\"btn btn-primary btn-lg btn-block\"]")
    WebElement SendDetailsBtn;
	
    
    //Constructor
  	public RentFac(WebDriver driver) 
  	{
      	this.driver=driver;
  		PageFactory.initElements(driver,this);
    }
  	
	
    //------------------------------ Methods for Scenario 1 - [Search Functionality] ---------------------------------------------------

       
	public void selectCity() throws AWTException, InterruptedException
	{
		City.click();
		Robot robot = new Robot();
	  
	    robot.keyPress(KeyEvent.VK_UP);
	    robot.keyRelease(KeyEvent.VK_UP);
	    Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);  
  	    robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);   
	    robot.keyPress(KeyEvent.VK_TAB);
	    robot.keyRelease(KeyEvent.VK_TAB);
	}
	
	public void selectLocalities() throws InterruptedException, AWTException 
	{
		Robot robot = new Robot();
		wait = new WebDriverWait(driver,Duration.ofSeconds(5));
    	wait.until(ExpectedConditions.visibilityOf(locality));
   	   
    	locality.sendKeys("Airoli");
		Thread.sleep(1000);
		  
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER); 
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000); 
	 }

	 public void selectPropertyType() 
	 {
		propertyType.click();
	 }
 
	 public void selectBHKType() throws InterruptedException, AWTException 
	 {
		wait = new WebDriverWait(driver,Duration.ofSeconds(1));
	   	wait.until(ExpectedConditions.elementToBeClickable(bhkTypeDropdown));
	    bhkTypeDropdown.click(); 
	    
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);  
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		 
		//code for slider
		int xCoordinate = 400;
        int yCoordinate = 450;

        robot.mouseMove(xCoordinate, yCoordinate);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);	 
	}
	 
	public void selectPropertyStatus() throws AWTException, InterruptedException 
	{
		wait = new WebDriverWait(driver,Duration.ofSeconds(1));
   	    wait.until(ExpectedConditions.elementToBeClickable(propertyStatusDropdown));
		propertyStatusDropdown.click(); 
   	    
	    Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);  
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);   
	}
 
	public void search() throws InterruptedException
    {
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	 	wait.until(ExpectedConditions.elementToBeClickable(searchButton));
	 	searchButton.click();	  
	}

	
    //------------------------------ Methods for Scenario 2 - [Rent Receipt] ---------------------------------------------------
	
	
	
	 public void clickMenuTab() throws InterruptedException 
	 {
		 Thread.sleep(1000);
		 wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	 	 wait.until(ExpectedConditions.elementToBeClickable(menuTab));
	 	 menuTab.click();
	 }

	 public void clickRentReceiptOption() throws InterruptedException 
	 {
		 wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	   	 wait.until(ExpectedConditions.elementToBeClickable(rentReceiptOption));
	   	 rentReceiptOption.click();
	 }

	 public void fillRentReceiptForm(String tenantName, String ownerName, String tenantPhone, String ownerPhone, String rent, String ownerPAN, String rentedPropertyAddress, String ownerAddress, String receiptStartDate, String receiptEndDate, String email) throws InterruptedException 
	 {
	     wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	     wait.until(ExpectedConditions.visibilityOf(tenantNameField));
	   	 tenantNameField.sendKeys(tenantName);
	   	    
	     wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	   	 wait.until(ExpectedConditions.visibilityOf(ownerNameField));
	     ownerNameField.sendKeys(ownerName);
	        
	     wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	   	 wait.until(ExpectedConditions.visibilityOf(tenantPhoneField));
	     tenantPhoneField.sendKeys(tenantPhone);

	     wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	   	 wait.until(ExpectedConditions.visibilityOf(ownerPhoneField));
	   	 ownerPhoneField.sendKeys(ownerPhone);

	   	 wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	   	 wait.until(ExpectedConditions.visibilityOf(rentField));
	 	 rentField.sendKeys(rent);

	 	 wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	   	 wait.until(ExpectedConditions.visibilityOf(ownerPanField));
	  	 ownerPanField.sendKeys(ownerPAN);

	  	 wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	   	 wait.until(ExpectedConditions.visibilityOf(rentedPropertyAddressField));
	 	 rentedPropertyAddressField.sendKeys(rentedPropertyAddress);

	 	 wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	   	 wait.until(ExpectedConditions.visibilityOf(ownerAddressField));
	  	 ownerAddressField.sendKeys(ownerAddress);
	  	 Thread.sleep(3000);
	        
	     JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scroll(0,200)");
		 Thread.sleep(3000);

		 wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	   	 wait.until(ExpectedConditions.visibilityOf(receiptStartDateField));
	        
	   	 //selects the start date from the calendar
	   	 receiptStartDateField.sendKeys(receiptStartDate);
	     Thread.sleep(2000);
	     List<WebElement> all=driver.findElements(By.xpath("//div[@aria-label=\"day-19\"]"));
		 for(WebElement e: all)
		 {
			 String date = e.getText();	//1  2  3
			 if(date.equals(receiptStartDate))
			 {
				 e.click();
				 break;
			 }		
		 }
	        
		 wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	   	 wait.until(ExpectedConditions.visibilityOf(receiptEndDateField));
	   	    
	     //selects the start date from the calendar
	     receiptEndDateField.sendKeys(receiptEndDate);
	     Thread.sleep(2000);
	     List<WebElement> all1=driver.findElements(By.xpath("//div[@aria-label=\"day-29\"]"));
	     for(WebElement e1 : all1)
		 {
	    	 String date1 = e1.getText();	//1  2  3
		     if(date1.equals(receiptEndDate))
			 {
		    	 e1.click();
				 break;
			 }			
		 }
	        
		 wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	   	 wait.until(ExpectedConditions.visibilityOf(emailField));
	     emailField.sendKeys(email);
	     Thread.sleep(2000);
	 }

	 public void clickGenerateRentReceiptButton() throws InterruptedException 
	 {
		 wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		 wait.until(ExpectedConditions.elementToBeClickable(submitButton));
		 submitButton.click();
	 }

	 public boolean isMessageDisplayed() throws InterruptedException 
	 {
		 return driver.findElement(By.xpath("//div[text()=\"Congratulations\"]")).isDisplayed();
	 }       
	
	    
	    
	    //------------------------------ Methods for Scenario 3 - [Pay Rent] ---------------------------------------------------
     
	 
	 
	 public void clickPayRent() throws InterruptedException
     {
     	wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		 	wait.until(ExpectedConditions.elementToBeClickable(payRentTab));
     	payRentTab.click();
     	
     	String mainWindowHandle = driver.getWindowHandle();
         Set<String> allWindowHandles = driver.getWindowHandles();
     
         for (String windowHandle : allWindowHandles) 
         {
             if (!windowHandle.equals(mainWindowHandle)) 
             {
                 driver.switchTo().window(windowHandle);
                 break;
             }
         }
     }
     
     public void selectPaymentType() throws InterruptedException, AWTException  
     {   
     	wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		 	wait.until(ExpectedConditions.elementToBeClickable(paymentTypeSelect));
     	paymentTypeSelect.click(); 
 		Robot robot = new Robot();
 		robot.keyPress(KeyEvent.VK_DOWN);
 		robot.keyRelease(KeyEvent.VK_DOWN);
 		robot.keyPress(KeyEvent.VK_DOWN);
 		robot.keyRelease(KeyEvent.VK_DOWN);
 		robot.keyPress(KeyEvent.VK_DOWN);
 		robot.keyRelease(KeyEvent.VK_DOWN);
 		Thread.sleep(1000);
 		robot.keyPress(KeyEvent.VK_ENTER);  
 		robot.keyRelease(KeyEvent.VK_ENTER);
 		Thread.sleep(1000);
     	
     }
     
     public void enterName(String name) throws InterruptedException {
     	wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		 	wait.until(ExpectedConditions.elementToBeClickable(nameInput));
		 	nameInput.sendKeys(name);
     }
 
     public void enterMobileNumber(String mobileNumber) throws InterruptedException {
     	wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		 	wait.until(ExpectedConditions.elementToBeClickable(mobileNumberInput));
		 	mobileNumberInput.click();
		 	wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		 	wait.until(ExpectedConditions.visibilityOf(mobileNumberInput));
     	mobileNumberInput.sendKeys(mobileNumber);
     	
     	JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("window.scroll(0,200)");
         Thread.sleep(3000);
     }
 
     public void enterEmail(String email) throws InterruptedException {
     	wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		 	wait.until(ExpectedConditions.visibilityOf(emailInput));
		 	emailInput.sendKeys(email);
         Thread.sleep(3000);
     }
 
     public void agreeToTermsAndConditions() throws InterruptedException {
     	wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		 	wait.until(ExpectedConditions.elementToBeClickable(termsAndConditionsCheckbox));
		 	termsAndConditionsCheckbox.click();
		 	Thread.sleep(5000);
         termsAndConditionsCheckbox.click();
         Thread.sleep(5000);
     }
 
     public void clickGetStartedButton() throws InterruptedException {
     	wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		 	wait.until(ExpectedConditions.elementToBeClickable(getStartedButton));
		 	getStartedButton.click();
         Thread.sleep(2000);
     }
 
     public boolean isVerificationCodePopupDisplayed() throws InterruptedException {
     	return verificationCodePopup.isDisplayed();
     }

	

     //------------------------------ Methods for Scenario 4 - [Save Search] ---------------------------------------------------

     
     
     public void clickSaveSearch() throws InterruptedException 
     {
     	wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(SaveSearch));
		SaveSearch.click();
        Thread.sleep(1000);
     }
     
     public void selectLocation(String location) throws InterruptedException, AWTException 
	 {
     	Robot robot = new Robot();
     	wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	 	wait.until(ExpectedConditions.visibilityOf(Location));
  		Location.sendKeys(location);
  		Thread.sleep(1000);
  		robot.keyPress(KeyEvent.VK_DOWN);
  		robot.keyRelease(KeyEvent.VK_DOWN);
  		Thread.sleep(1000);
  		robot.keyPress(KeyEvent.VK_ENTER); 
  		robot.keyRelease(KeyEvent.VK_ENTER);
  		Thread.sleep(1000); 
	 }
     

     public void selectHouseType() throws InterruptedException 
     {
     	wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(HouseType1));
		HouseType1.click();
        wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(HouseType2));
		HouseType2.click();
     }
     
     public void propertyType() throws InterruptedException 
     {
     	wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(PropertyType));
		PropertyType.click();
     		        	
     	JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,200)");
     	Thread.sleep(2000);    
     }
     
     // Method to slide the minimum budget slider by a relative offset
     public void slideMinBudget() throws InterruptedException 
     {
         Actions action = new Actions(driver);
         action.clickAndHold(minBudgetSlider).moveByOffset(40, 0).release().build().perform();
         Thread.sleep(2000);
     }

     // Method to slide the maximum budget slider by a relative offset
     public void slideMaxBudget() throws InterruptedException 
     {
         Actions action = new Actions(driver);
         action.clickAndHold(maxBudgetSlider).moveByOffset(-80, 0).release().build().perform();
         Thread.sleep(2000);
     }

     public void selectFurnishingType() throws InterruptedException 
     {
     	wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(FurnishingType));
		FurnishingType.click();
     }

     public void enterRequirements(String specificRequirements) throws InterruptedException 
     {
     	wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOf(Requirements));
		Requirements.sendKeys(specificRequirements);
     	Thread.sleep(3000);
     }

     public void clickSaveAlert() throws InterruptedException 
     {
     	wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(SaveAlertBtn));
		SaveAlertBtn.click();
     }
     
     public boolean isMsgDisplayed2() 
     {
		return SubmitMessage.isDisplayed();
	 }

 
	    	        
	        
     //------------------------------ Methods for Scenario 5 - [Refer & Earn] ---------------------------------------------------
	        
  
     public void clickReferAndEarn() throws InterruptedException
     {
     	wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(ReferAndEarn));
     	ReferAndEarn.click();
     	Thread.sleep(1000);
     }
     
     public void clickOwnerDetailsBtn() throws InterruptedException
     {
     	wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(EnterOwnerDetailsBtn));
		EnterOwnerDetailsBtn.click();
     	Thread.sleep(1000);
     }
     
     public void city() throws InterruptedException, AWTException
     {
     	wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(CityField));
		CityField.click();
     	Thread.sleep(1000);
     	Robot robot = new Robot();
     	Thread.sleep(1000);
  		robot.keyPress(KeyEvent.VK_DOWN);
  		robot.keyRelease(KeyEvent.VK_DOWN);
  		Thread.sleep(1000);
  		robot.keyPress(KeyEvent.VK_DOWN);
  		robot.keyRelease(KeyEvent.VK_DOWN);
  		Thread.sleep(1000);
  		robot.keyPress(KeyEvent.VK_DOWN);
  		robot.keyRelease(KeyEvent.VK_DOWN);
  		Thread.sleep(1000);
  		robot.keyPress(KeyEvent.VK_DOWN);
  		robot.keyRelease(KeyEvent.VK_DOWN);
  		Thread.sleep(1000);
  		robot.keyPress(KeyEvent.VK_ENTER); 
  		robot.keyRelease(KeyEvent.VK_ENTER);
     }
     
     public void enterMobNo(String mobno) throws InterruptedException
     {
     	wait = new WebDriverWait(driver,Duration.ofSeconds(2));
     	wait.until(ExpectedConditions.visibilityOf(MobNo));
	 	MobNo.sendKeys(mobno);
     }
     
     public void enterOwnerName(String name) throws InterruptedException
     {
     	wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOf(OwnerName));
     	OwnerName.sendKeys(name);
     	Thread.sleep(1000);
     }
     
     public void selectProperty() throws InterruptedException, AWTException 
     {
     	wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(PropertyTypeField));
     	PropertyTypeField.click();;
     	Thread.sleep(1000);
     	Robot robot = new Robot();
     	Thread.sleep(1000);
  		robot.keyPress(KeyEvent.VK_DOWN);
  		robot.keyRelease(KeyEvent.VK_DOWN);
  		Thread.sleep(1000);
  		robot.keyPress(KeyEvent.VK_DOWN);
  		robot.keyRelease(KeyEvent.VK_DOWN);
  		Thread.sleep(1000);
  		robot.keyPress(KeyEvent.VK_DOWN);
  		robot.keyRelease(KeyEvent.VK_DOWN);
  		Thread.sleep(1000);
  		robot.keyPress(KeyEvent.VK_ENTER); 
  		robot.keyRelease(KeyEvent.VK_ENTER);
  		Thread.sleep(1000); 
     }
     
     public void tellUsMore(String name) throws InterruptedException
     {
     	wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOf(TellUsMore));
     	TellUsMore.sendKeys(name);
     	Thread.sleep(2000);
     }
     
     public void sendDetailsBtn() throws InterruptedException
     {
     	wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOf(SendDetailsBtn));
     	SendDetailsBtn.click();;
     }           	        
}




































//***************************************************************************************************************************************



/*
package Page;
 
import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.WebDriverWait;
 
public class RentFac 
{
	WebDriver driver;
 

	@FindBy(xpath = "(//div[@class=\"css-16pqwjk-indicatorContainer nb-select__indicator nb-select__dropdown-indicator\"])[1]")
    WebElement City;
	
	@FindBy(xpath = "//label[@for=\"RENT\"]")
	WebElement propertyType;
	
	@FindBy(xpath = "//div[@class=\"nb-select__placeholder\"]")
	WebElement bhkTypeDropdown;
	
//	@FindBy(xpath = "//div[@class=\"css-1hwfws3 nb-select__value-container nb-select__value-container--is-multi nb-select__value-container--has-value\"]")
//	WebElement bhkTypeDropdown1;
	
	@FindBy(xpath = "(//div[@class=\"css-v2nw5i-control nb-select__control\"])[3]")
	WebElement propertyStatusDropdown;

	@FindBy(xpath = "//button[@class=\"prop-search-button flex items-center justify-center btn btn-primary btn-lg\"]")
	WebElement searchButton;

 
    
	public RentFac(WebDriver driver) {
    	this.driver=driver;
		PageFactory.initElements(driver,this);
    }
 

//    
	public void selectCity() 
	throws AWTException, InterruptedException
	{
	 City.click();
//	 Thread.sleep(2000);
//	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//	 wait.until(ExpectedConditions.visibilityOf(landlordDetail));
	 Robot robot = new Robot();
//	 Thread.sleep(2000);
	 
	 robot.keyPress(KeyEvent.VK_DOWN);
	  robot.keyRelease(KeyEvent.VK_DOWN);
	  Thread.sleep(1000);
	  
	  robot.keyPress(KeyEvent.VK_UP);
	  robot.keyRelease(KeyEvent.VK_UP);
	  Thread.sleep(2000);
	  robot.keyPress(KeyEvent.VK_UP);
	  robot.keyRelease(KeyEvent.VK_UP);
	  Thread.sleep(2000);
	  robot.keyPress(KeyEvent.VK_UP);
	  robot.keyRelease(KeyEvent.VK_UP);
	  Thread.sleep(2000);
	  
//	  robot.keyPress(KeyEvent.VK_UP);
//	  robot.keyRelease(KeyEvent.VK_UP);
//	  Thread.sleep(2000);
	  
	  robot.keyPress(KeyEvent.VK_ENTER);  
	  robot.keyRelease(KeyEvent.VK_ENTER);
      Thread.sleep(2000);
      
      robot.keyPress(KeyEvent.VK_ENTER);  
	  robot.keyRelease(KeyEvent.VK_ENTER);
      Thread.sleep(2000);


  
	 
	 
	  robot.keyPress(KeyEvent.VK_TAB);
	  robot.keyRelease(KeyEvent.VK_TAB);
	}
	
	  public void selectLocalities() throws InterruptedException, AWTException 
	  {
		  Robot robot = new Robot();
		  driver.findElement(By.id("listPageSearchLocality")).sendKeys("Airoli");
		  Thread.sleep(1000);
		  robot.keyPress(KeyEvent.VK_DOWN);
		  robot.keyRelease(KeyEvent.VK_DOWN);
		  Thread.sleep(1000);
		  robot.keyPress(KeyEvent.VK_ENTER); 
		  robot.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(1000); 
	  }

	public void selectPropertyType() 
	{
		propertyType.click();
	}
 
	public void selectBHKType() throws InterruptedException, AWTException {
	    bhkTypeDropdown.click(); 
	    Thread.sleep(1000);
		 Robot robot = new Robot();
		  robot.keyPress(KeyEvent.VK_DOWN);
		  robot.keyRelease(KeyEvent.VK_DOWN);
		  Thread.sleep(1000);
		  robot.keyPress(KeyEvent.VK_DOWN);
		  robot.keyRelease(KeyEvent.VK_DOWN);
		  Thread.sleep(1000);
		  robot.keyPress(KeyEvent.VK_ENTER);  
		  robot.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(1000);
		  
		

		  		int xCoordinate = 400;

		          int yCoordinate = 450;

		          robot.mouseMove(xCoordinate, yCoordinate);
		          robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		          robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		  //bhkTypeDropdown.click(); 
		 
	}
	public void selectPropertyStatus() throws AWTException, InterruptedException {
		propertyStatusDropdown.click(); 
		Thread.sleep(1000);
	    Robot robot = new Robot();
		  robot.keyPress(KeyEvent.VK_DOWN);
		  robot.keyRelease(KeyEvent.VK_DOWN);
		  Thread.sleep(1000);
		  robot.keyPress(KeyEvent.VK_DOWN);
		  robot.keyRelease(KeyEvent.VK_DOWN);
		  Thread.sleep(1000);
		  
		  robot.keyPress(KeyEvent.VK_ENTER);  
		  robot.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(1000);
		  
		 // propertyStatusDropdown.click();
	}
 


	public void search() throws InterruptedException
    {
	  searchButton.click();
	  Thread.sleep(2000);	
	}

//======================================================================================================================================
	
	
  @FindBy(id = "main-menu")
  WebElement menuTab;
  
  @FindBy(xpath = "//a[text()=\"Rent Receipts\"]")
  WebElement rentReceiptOption;
  
  @FindBy(xpath = "//input[@placeholder=\"Tenant's Name\"]")
  WebElement tenantNameField;
  
  @FindBy(xpath = "//input[@placeholder=\"Owner's Name\"]")
  WebElement ownerNameField;
  
  @FindBy(xpath = "//input[@id=\"rentrecipt-form-tenant_phone-nbInput\"]")
  WebElement tenantPhoneField;
  
  @FindBy(xpath = "//input[@id=\"rentrecipt-form-owner_phone-nbInput\"]")
  WebElement ownerPhoneField;
  
  @FindBy(id="rentrecipt-form-rent-nbInput")
  WebElement rentField;
  
  @FindBy(id="rentrecipt-form-owner_pan-nbInput")
  WebElement ownerPanField;
  
  @FindBy(xpath = "//textarea[@placeholder=\"Address of property as required in rent receipts\"]")
  WebElement rentedPropertyAddressField;
  
  @FindBy(xpath = "//textarea[@placeholder=\"Current Adress of the owner as required in rental receipts\"]")
  WebElement ownerAddressField;
  
  @FindBy(xpath = "(//input[@placeholder=\"Receipt Start Date\"])[1]")
  WebElement receiptStartDateField;
  
  @FindBy(xpath = "(//input[@placeholder=\"Receipt Start Date\"])[2]")
  WebElement receiptEndDateField;
  
  @FindBy(xpath = "//input[@id=\"rentrecipt-form-email-nbInput\"]")
  WebElement emailField;
  
  @FindBy(xpath = "//button[@class=\"submit-form btn btn-default\"]")
  WebElement submitButton;
  
  
//     public void scroll1() 
//     {
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//	    js.executeScript("window.scroll(0,10000)");
//	 }
	
	 public void clickMenuTab() throws InterruptedException {
	        menuTab.click();
	        Thread.sleep(1000);
	    }

	    public void clickRentReceiptOption() throws InterruptedException {
	        rentReceiptOption.click();
	        Thread.sleep(1000);
	    }

	    public void fillRentReceiptForm(String tenantName, String ownerName, String tenantPhone, String ownerPhone, String rent, String ownerPAN, String rentedPropertyAddress, String ownerAddress, String receiptStartDate, String receiptEndDate, String email) throws InterruptedException {
	        tenantNameField.sendKeys(tenantName);
	        Thread.sleep(1000);
	        ownerNameField.sendKeys(ownerName);
	        Thread.sleep(1000);
	        tenantPhoneField.sendKeys(tenantPhone);
	        Thread.sleep(1000);
	        ownerPhoneField.sendKeys(ownerPhone);
	        Thread.sleep(1000);
	        rentField.sendKeys(rent);
	        Thread.sleep(1000);
	        ownerPanField.sendKeys(ownerPAN);
	        Thread.sleep(1000);
	        rentedPropertyAddressField.sendKeys(rentedPropertyAddress);
	        Thread.sleep(1000);
	        ownerAddressField.sendKeys(ownerAddress);
	        Thread.sleep(1000);
	        
	        JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("window.scroll(0,200)");
   
	        receiptStartDateField.sendKeys(receiptStartDate);
	        
	        List<WebElement> all=driver.findElements(By.xpath("//div[@aria-label=\"day-19\"]"));
			for(WebElement e: all)
			{
			String date = e.getText();	//1  2  3
	        if(date.equals(receiptStartDate))
		    {
			   e.click();
			   break;
		    }
			}
	        
	        Thread.sleep(1000);
	        receiptEndDateField.sendKeys(receiptEndDate);
	        
	        List<WebElement> all1=driver.findElements(By.xpath("//div[@aria-label=\"day-29\"]"));
			for(WebElement e1 : all1)
			{
			String date1 = e1.getText();	//1  2  3
	        if(date1.equals(receiptEndDate))
		    {
			   e1.click();
			   break;
		    }
			}
	        
	        Thread.sleep(1000);
	        emailField.sendKeys(email);
	        Thread.sleep(1000);

	    }

	    public void clickGenerateRentReceiptButton() throws InterruptedException {
	    	submitButton.click();
	    	Thread.sleep(1000);
	    }

	    public boolean isMessageDisplayed() throws InterruptedException {
	    	Thread.sleep(2000);
	    	return driver.findElement(By.xpath("//div[text()=\"Congratulations\"]")).isDisplayed();
	    }       
	
//================================================================================================================================================
	    
	    

	        
	        @FindBy(xpath = "//div[@class=\"text-header-text-color\"]")
	        WebElement payRentTab;
	      
	       // @FindBy(xpath = "//div[@class=\"css-1hwfws3 nb-select__value-container nb-select__value-container--has-value\"]")
	      //  @FindBy(xpath = "//div[@class=\"css-16pqwjk-indicatorContainer nb-select__indicator nb-select__dropdown-indicator\"]") 
	       // @FindBy(xpath = "//div[@class=\"css-v2nw5i-control nb-select__control\"]")
	        @FindBy(xpath = "//div[@class=\"css-v2nw5i-control nb-select__control\"]/child::div[2]")
	        WebElement paymentTypeSelect;
	    
	        @FindBy(id = "tenant_name")
	        WebElement nameInput;
	    
	        @FindBy(id = "tenant_phone")
	        WebElement mobileNumberInput;
	    
	        @FindBy(id = "tenant_email")
	        WebElement emailInput;
	        
	      //@FindBy(xpath = "//div[@class=\"nb__yEPwf\"]//child::div//child::div[@class=\"nb-checkbox mt-0 mb-1p nb-checkbox checkbox\"]//child::label//child::input[@type=\"checkbox\"]")
	     // @FindBy(xpath = "(//input[@type=\"checkbox\"])[2]")
	    //  @FindBy(xpath = "/html/body/div[4]/div/section/div[1]/div[2]/div[1]/div/form/div[5]/div[1]/div/label/input")
	        @FindBy(xpath = "//div[@class=\"nb__yEPwf\"]/div/div/label/input")
	        WebElement termsAndConditionsCheckbox;
	        
	        
	        @FindBy(xpath = "//button[@class=\"btn btn-primary btn-block\"]")
	        WebElement getStartedButton;
	    
	        @FindBy(xpath = "//div[@class=\"content-container \"]")
	        WebElement verificationCodePopup;
	    
	      
	        
	        public void clickPayRent() throws InterruptedException
	        {
	        	payRentTab.click();
	        	
	        	String mainWindowHandle = driver.getWindowHandle();
	            Set<String> allWindowHandles = driver.getWindowHandles();
	        
	            for (String windowHandle : allWindowHandles) {
	                if (!windowHandle.equals(mainWindowHandle)) {
	                    driver.switchTo().window(windowHandle);
	                    break;
	                }
	            }
	        	//driver.navigate().to("https://www.nobroker.in/pay-property-rent-online?nbFr=home_page");
	        	//Thread.sleep(2000);
	        }
	        
	        public void selectPaymentType() throws InterruptedException, AWTException  
	        {    
	        	paymentTypeSelect.click(); 
	    	    Thread.sleep(1000);
	    		Robot robot = new Robot();
	    		robot.keyPress(KeyEvent.VK_DOWN);
	    		robot.keyRelease(KeyEvent.VK_DOWN);
	    		Thread.sleep(1000);
	    		robot.keyPress(KeyEvent.VK_DOWN);
	    		robot.keyRelease(KeyEvent.VK_DOWN);
	    		Thread.sleep(1000);
	    		robot.keyPress(KeyEvent.VK_DOWN);
	    		robot.keyRelease(KeyEvent.VK_DOWN);
	    		Thread.sleep(1000);
//	    		robot.keyPress(KeyEvent.VK_DOWN);
//	    		robot.keyRelease(KeyEvent.VK_DOWN);
//	    		Thread.sleep(1000);
	    		robot.keyPress(KeyEvent.VK_ENTER);  
	    		robot.keyRelease(KeyEvent.VK_ENTER);
	    		Thread.sleep(1000);
	        	
	        }
	        
	        public void enterName(String name) throws InterruptedException {
	            nameInput.sendKeys(name);
	            Thread.sleep(3000);
	        }
	    
	        public void enterMobileNumber(String mobileNumber) throws InterruptedException {
	        	mobileNumberInput.click();
	        	mobileNumberInput.sendKeys(mobileNumber);
	        	
	        	JavascriptExecutor js=(JavascriptExecutor)driver;
			    js.executeScript("window.scroll(0,200)");
	            Thread.sleep(3000);
	        }
	    
	        public void enterEmail(String email) throws InterruptedException {
	            emailInput.sendKeys(email);
	            Thread.sleep(3000);
	        }
	    
	        public void agreeToTermsAndConditions() throws InterruptedException {
	        	termsAndConditionsCheckbox.click();
	        	
//	        	WebDriverWait wait = new WebDriverWait(driver, 10);
//	            wait.until(ExpectedConditions.elementToBeSelected(termsAndConditionsCheckbox));
	            Thread.sleep(5000);
	            termsAndConditionsCheckbox.click();
	            Thread.sleep(5000);
	        }
	    
	        public void clickGetStartedButton() throws InterruptedException {
	            getStartedButton.click();
	            Thread.sleep(2000);
	        }
	    
	        public boolean isVerificationCodePopupDisplayed() throws InterruptedException {
	        	Thread.sleep(2000);
	        	return verificationCodePopup.isDisplayed();
	        }


			
	    
	    
	    

	

//===========================================================================================================================


            
	        
	        
	        @FindBy(xpath = "(//div[@class=\"css-16pqwjk-indicatorContainer nb-select__indicator nb-select__dropdown-indicator\"])[1]")
	        WebElement LocationField;
	    	
	        @FindBy(id = "listPageSearchLocality")
	        WebElement LocalityField;
	        
	        @FindBy(id = "saveSearch")
	        WebElement SaveSearch;
	        
	        @FindBy(css = "#pyrLocality")
	        WebElement Location;
	        	        
//	        @FindBy(xpath = "//div[@data-value=\"BACHELOR_FEMALE\"]")
//	        WebElement TenantType;
	        
	        @FindBy(xpath = "//div[@data-value=\"BHK1\"]")
	        WebElement HouseType1;
	        
	        @FindBy(xpath = "//div[@data-value=\"BHK2\"]")
	        WebElement HouseType2;
	        
	        @FindBy(xpath = "(//div[text()=\"Apartment\"])[1]")
	        WebElement PropertyType;
	        
	        @FindBy(xpath = "(//div[@class=\"rc-slider-handle rc-slider-handle-1\"])[1]")
	        WebElement minBudgetSlider;
	        
	        @FindBy(xpath = "(//div[@class=\"rc-slider-handle rc-slider-handle-2\"])[1]")
	        WebElement maxBudgetSlider;
	                       
	        @FindBy(xpath = "//div[@data-value=\"FULLY_FURNISHED\"]")
	        WebElement FurnishingType;
	        
//	        @FindBy(xpath = "//div[@data-value-desc=\" Within 30 Days\"]")
//	        WebElement ShiftingDate;
	        
	        @FindBy(xpath = "//textarea[@placeholder=\"Please mention here...\"]")
	        WebElement Requirements;
	        
	        @FindBy(xpath = "//button[text()=\"Save Alert\"]")
	        WebElement SaveAlertBtn;
	        
	        @FindBy(xpath = "//div[text()=\"Get email alerts for new properties matching the following\"]")
	        WebElement SubmitMessage;
	        
	        	        
	        
//	        public void locality(String locality) throws AWTException, InterruptedException 
//	        {
//	        	LocationField.click();
//	       	    Thread.sleep(2000);
//	       	    Robot robot = new Robot();
//	       	    Thread.sleep(2000);
//	       	 
//	       	    robot.keyPress(KeyEvent.VK_DOWN);
//	       	    robot.keyRelease(KeyEvent.VK_DOWN);
//	       	    Thread.sleep(1000);
//	       	  
//	       	  robot.keyPress(KeyEvent.VK_UP);
//	       	  robot.keyRelease(KeyEvent.VK_UP);
//	       	  Thread.sleep(2000);
//	       	  robot.keyPress(KeyEvent.VK_UP);
//	       	  robot.keyRelease(KeyEvent.VK_UP);
//	       	  Thread.sleep(2000);
//	       	  robot.keyPress(KeyEvent.VK_UP);
//	       	  robot.keyRelease(KeyEvent.VK_UP);
//	       	  Thread.sleep(2000);
//	       	  
//	       	  robot.keyPress(KeyEvent.VK_ENTER);  
//	       	  robot.keyRelease(KeyEvent.VK_ENTER);
//	          Thread.sleep(2000);
//	             
//	          robot.keyPress(KeyEvent.VK_ENTER);  
//	       	  robot.keyRelease(KeyEvent.VK_ENTER);
//	          Thread.sleep(2000);
//    	 
//	       	  robot.keyPress(KeyEvent.VK_TAB);
//	       	  robot.keyRelease(KeyEvent.VK_TAB);
//	        	
//	       	  //locality
//	          Robot robot1 = new Robot();
//       	      LocalityField.sendKeys("locality");
//     		  Thread.sleep(1000);
//     		  robot1.keyPress(KeyEvent.VK_DOWN);
//     		  robot1.keyRelease(KeyEvent.VK_DOWN);
//     		  Thread.sleep(1000);
//     		  robot1.keyPress(KeyEvent.VK_ENTER); 
//     		  robot1.keyRelease(KeyEvent.VK_ENTER);
//     		  Thread.sleep(1000);  
//     		  
//	        }
	        
	        public void clickSaveSearch() throws InterruptedException {
	            SaveSearch.click();
	            Thread.sleep(1000);
	        }
	        
	        public void selectLocation(String location) throws InterruptedException, AWTException 
	  	  {
	  		  Robot robot = new Robot();
	  		  Location.sendKeys(location);
	  		  Thread.sleep(2000);
	  		  robot.keyPress(KeyEvent.VK_DOWN);
	  		  robot.keyRelease(KeyEvent.VK_DOWN);
	  		  Thread.sleep(2000);
	  		  robot.keyPress(KeyEvent.VK_ENTER); 
	  		  robot.keyRelease(KeyEvent.VK_ENTER);
	  		  Thread.sleep(2000); 
	  	  }
	        
	        
//	        public void selectTenantType() throws InterruptedException {
//                TenantType.click();
//                Thread.sleep(1000);
//	        }
            
	        public void selectHouseType() throws InterruptedException {
	            HouseType1.click();
	            Thread.sleep(2000);
	            HouseType2.click();
	            Thread.sleep(2000);
	        }
	        
	        public void propertyType() throws InterruptedException {
	        	PropertyType.click();
	        		        	
	        	JavascriptExecutor js=(JavascriptExecutor)driver;
			    js.executeScript("window.scroll(0,200)");
			    
	        	Thread.sleep(2000);    
	        }
	        
	        // Method to slide the min budget slider by a relative offset
	        public void slideMinBudget() throws InterruptedException {
	            Actions action = new Actions(driver);
	            action.clickAndHold(minBudgetSlider).moveByOffset(20, 0).release().build().perform();
	            Thread.sleep(2000);
	        }

	        // Method to slide the max budget slider by a relative offset
	        public void slideMaxBudget() throws InterruptedException {
	            Actions action = new Actions(driver);
	            action.clickAndHold(maxBudgetSlider).moveByOffset(80, 0).release().build().perform();
	            Thread.sleep(2000);
	        }

	        public void selectFurnishingType() throws InterruptedException {
	        	FurnishingType.click();
	        	Thread.sleep(2000);
	        }

//	        public void setShiftingDate() throws InterruptedException {
//	        	ShiftingDate.click();
//	        	Thread.sleep(1000);
//	        }

	        public void enterRequirements(String specificRequirements) throws InterruptedException {
	        	Requirements.sendKeys(specificRequirements);
	        	Thread.sleep(2000);
	        }

	        public void clickSaveAlert() throws InterruptedException {
	        	SaveAlertBtn.click();
	        	Thread.sleep(2000);
	        }
	        
	        public boolean isMsgDisplayed2() {
				return SubmitMessage.isDisplayed();
			}

//	        public boolean isMsgDisplayed() {
//	            WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert-message")));
//	            return messageElement.isDisplayed();
//	       }


	        
	        
	        
	        
//===================================================== SCENARIO 5 ==========================================================================
	        
	        
	        
//	        @FindBy(id = "main-menu")
//	        WebElement Menu;
	        
	        @FindBy(xpath = "//a[text()=\"Refer & Earn\"]")
	        WebElement ReferAndEarn;
	        
	        @FindBy(xpath = "//div[@class=\"nb__K5w6e\"]")
	        WebElement EnterOwnerDetailsBtn;
	        
	        @FindBy(xpath = "(//div[@class=\"css-1hwfws3 nb-select__value-container\"])[1]")
	        WebElement CityField;
	        
	        @FindBy(css = "#formValidationOwnerPhone")
	        WebElement MobNo;
	        
	        @FindBy(css = "#formValidationName")
	        WebElement OwnerName;
	        
	        @FindBy(xpath = "(//div[@class=\"css-v2nw5i-control nb-select__control\"])[2]")
	        WebElement PropertyTypeField;
	        
	        @FindBy(css = "#formUserText")
	        WebElement TellUsMore;
	        
	        @FindBy(xpath = "//button[@class=\"btn btn-primary btn-lg btn-block\"]")
	        WebElement SendDetailsBtn;
	        
	        
	        
	        public void clickReferAndEarn() throws InterruptedException
	        {
	        	ReferAndEarn.click();
	        	Thread.sleep(1000);
	        }
	        
	        public void clickOwnerDetailsBtn() throws InterruptedException
	        {
	        	EnterOwnerDetailsBtn.click();
	        	Thread.sleep(1000);
	        }
	        
	        public void city() throws InterruptedException, AWTException
	        {
	        	CityField.click();
	        	Thread.sleep(1000);
	        	Robot robot = new Robot();
		  		Thread.sleep(2000);
		  		robot.keyPress(KeyEvent.VK_DOWN);
		  		robot.keyRelease(KeyEvent.VK_DOWN);
		  		Thread.sleep(2000);
		  		robot.keyPress(KeyEvent.VK_DOWN);
		  		robot.keyRelease(KeyEvent.VK_DOWN);
		  		Thread.sleep(2000);
		  		robot.keyPress(KeyEvent.VK_DOWN);
		  		robot.keyRelease(KeyEvent.VK_DOWN);
		  		Thread.sleep(2000);
		  		robot.keyPress(KeyEvent.VK_DOWN);
		  		robot.keyRelease(KeyEvent.VK_DOWN);
		  		Thread.sleep(2000);
		  		robot.keyPress(KeyEvent.VK_ENTER); 
		  		robot.keyRelease(KeyEvent.VK_ENTER);
		  		Thread.sleep(2000); 
	        }
	        
	        public void enterMobNo(String mobno) throws InterruptedException
	        {
	        	MobNo.sendKeys(mobno);
	        	Thread.sleep(1000);
	        }
	        
	        public void enterOwnerName(String name) throws InterruptedException
	        {
	        	OwnerName.sendKeys(name);
	        	Thread.sleep(1000);
	        }
	        
	        public void selectProperty() throws InterruptedException, AWTException 
	        {
	        	PropertyTypeField.click();;
	        	Thread.sleep(1000);
	        	Robot robot = new Robot();
		  		Thread.sleep(2000);
		  		robot.keyPress(KeyEvent.VK_DOWN);
		  		robot.keyRelease(KeyEvent.VK_DOWN);
		  		Thread.sleep(2000);
		  		robot.keyPress(KeyEvent.VK_DOWN);
		  		robot.keyRelease(KeyEvent.VK_DOWN);
		  		Thread.sleep(2000);
		  		robot.keyPress(KeyEvent.VK_DOWN);
		  		robot.keyRelease(KeyEvent.VK_DOWN);
		  		Thread.sleep(2000);
		  		robot.keyPress(KeyEvent.VK_ENTER); 
		  		robot.keyRelease(KeyEvent.VK_ENTER);
		  		Thread.sleep(2000); 
	        }
	        
	        public void tellUsMore(String name) throws InterruptedException
	        {
	        	TellUsMore.sendKeys(name);
	        	Thread.sleep(1000);
	        }
	        
	        public void sendDetailsBtn() throws InterruptedException
	        {
	        	SendDetailsBtn.click();;
	        	Thread.sleep(1000);
	        }
	        
	        
	        
	        
	        
	        
	        
}


*/


















//******************************************************** SEPERATE FILES ************************************************************************



//===================================================Scenario 1 - [Search]=============================================================

//package Page;
//
// 
//import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.InputEvent;
//import java.awt.event.KeyEvent;
// 
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
// 
//public class RentFac {
//	WebDriver driver;
// 
//
//	@FindBy(xpath = "(//div[@class=\"css-16pqwjk-indicatorContainer nb-select__indicator nb-select__dropdown-indicator\"])[1]")
//    WebElement City;
//	
//	@FindBy(xpath = "//label[@for=\"RENT\"]")
//	WebElement propertyType;
//	
//	@FindBy(xpath = "//div[@class=\"nb-select__placeholder\"]")
//	WebElement bhkTypeDropdown;
//	
////	@FindBy(xpath = "//div[@class=\"css-1hwfws3 nb-select__value-container nb-select__value-container--is-multi nb-select__value-container--has-value\"]")
////	WebElement bhkTypeDropdown1;
//	
//	@FindBy(xpath = "(//div[@class=\"css-v2nw5i-control nb-select__control\"])[3]")
//	WebElement propertyStatusDropdown;
//
//	@FindBy(xpath = "//button[@class=\"prop-search-button flex items-center justify-center btn btn-primary btn-lg\"]")
//	WebElement searchButton;
//
// 
//    
//	public RentFac(WebDriver driver) {
//    	this.driver=driver;
//		PageFactory.initElements(driver,this);
//    }
// 
//
////    
//	public void selectCity() 
//	throws AWTException, InterruptedException
//	{
//	 City.click();
//	 Thread.sleep(2000);
//	 Robot robot = new Robot();
//	 Thread.sleep(2000);
//	 
//	 robot.keyPress(KeyEvent.VK_DOWN);
//	  robot.keyRelease(KeyEvent.VK_DOWN);
//	  Thread.sleep(1000);
//	  
//	  robot.keyPress(KeyEvent.VK_UP);
//	  robot.keyRelease(KeyEvent.VK_UP);
//	  Thread.sleep(2000);
//	  robot.keyPress(KeyEvent.VK_UP);
//	  robot.keyRelease(KeyEvent.VK_UP);
//	  Thread.sleep(2000);
//	  robot.keyPress(KeyEvent.VK_UP);
//	  robot.keyRelease(KeyEvent.VK_UP);
//	  Thread.sleep(2000);
//	  
////	  robot.keyPress(KeyEvent.VK_UP);
////	  robot.keyRelease(KeyEvent.VK_UP);
////	  Thread.sleep(2000);
//	  
//	  robot.keyPress(KeyEvent.VK_ENTER);  
//	  robot.keyRelease(KeyEvent.VK_ENTER);
//      Thread.sleep(2000);
//      
//      robot.keyPress(KeyEvent.VK_ENTER);  
//	  robot.keyRelease(KeyEvent.VK_ENTER);
//      Thread.sleep(2000);
//
//
//  
//	 
//	 
//	  robot.keyPress(KeyEvent.VK_TAB);
//	  robot.keyRelease(KeyEvent.VK_TAB);
//	}
//	
//	  public void selectLocalities() throws InterruptedException, AWTException 
//	  {
//		  Robot robot = new Robot();
//		  driver.findElement(By.id("listPageSearchLocality")).sendKeys("Airoli");
//		  Thread.sleep(1000);
//		  robot.keyPress(KeyEvent.VK_DOWN);
//		  robot.keyRelease(KeyEvent.VK_DOWN);
//		  Thread.sleep(1000);
//		  robot.keyPress(KeyEvent.VK_ENTER); 
//		  robot.keyRelease(KeyEvent.VK_ENTER);
//		  Thread.sleep(1000); 
//	  }
//
//	public void selectPropertyType() 
//	{
//		propertyType.click();
//	}
// 
//	public void selectBHKType() throws InterruptedException, AWTException {
//	    bhkTypeDropdown.click(); 
//	    Thread.sleep(1000);
//		 Robot robot = new Robot();
//		  robot.keyPress(KeyEvent.VK_DOWN);
//		  robot.keyRelease(KeyEvent.VK_DOWN);
//		  Thread.sleep(1000);
//		  robot.keyPress(KeyEvent.VK_DOWN);
//		  robot.keyRelease(KeyEvent.VK_DOWN);
//		  Thread.sleep(1000);
//		  robot.keyPress(KeyEvent.VK_ENTER);  
//		  robot.keyRelease(KeyEvent.VK_ENTER);
//		  Thread.sleep(1000);
//		  
//		
//
//		  		int xCoordinate = 400;
//
//		          int yCoordinate = 450;
//
//		          robot.mouseMove(xCoordinate, yCoordinate);
//		          robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		          robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//
//		  //bhkTypeDropdown.click(); 
//		 
//	}
//	public void selectPropertyStatus() throws AWTException, InterruptedException {
//		propertyStatusDropdown.click(); 
//		Thread.sleep(1000);
//	    Robot robot = new Robot();
//		  robot.keyPress(KeyEvent.VK_DOWN);
//		  robot.keyRelease(KeyEvent.VK_DOWN);
//		  Thread.sleep(1000);
//		  robot.keyPress(KeyEvent.VK_DOWN);
//		  robot.keyRelease(KeyEvent.VK_DOWN);
//		  Thread.sleep(1000);
//		  
//		  robot.keyPress(KeyEvent.VK_ENTER);  
//		  robot.keyRelease(KeyEvent.VK_ENTER);
//		  Thread.sleep(1000);
//		  
//		 // propertyStatusDropdown.click();
//	}
// 
//
//
//	public void search() throws InterruptedException
//    {
//	  searchButton.click();
//	  Thread.sleep(2000);	
//	}
//
// 
//}



//==============================================Scenario 2 - [RentReceipt]=====================================================

//@RentReceipt


//package Page;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class RentFac 
//{
//    WebDriver driver;
//	
//    @FindBy(id = "main-menu")
//    WebElement menuTab;
//    
//    @FindBy(xpath = "//a[text()=\"Rent Receipts\"]")
//    WebElement rentReceiptOption;
//    
//    @FindBy(xpath = "//input[@placeholder=\"Tenant's Name\"]")
//    WebElement tenantNameField;
//    
//    @FindBy(xpath = "//input[@placeholder=\"Owner's Name\"]")
//    WebElement ownerNameField;
//    
//    @FindBy(xpath = "//input[@id=\"rentrecipt-form-tenant_phone-nbInput\"]")
//    WebElement tenantPhoneField;
//    
//    @FindBy(xpath = "//input[@id=\"rentrecipt-form-owner_phone-nbInput\"]")
//    WebElement ownerPhoneField;
//    
//    @FindBy(id="rentrecipt-form-rent-nbInput")
//    WebElement rentField;
//    
//    @FindBy(id="rentrecipt-form-owner_pan-nbInput")
//    WebElement ownerPanField;
//    
//    @FindBy(xpath = "//textarea[@placeholder=\"Address of property as required in rent receipts\"]")
//    WebElement rentedPropertyAddressField;
//    
//    @FindBy(xpath = "//textarea[@placeholder=\"Current Adress of the owner as required in rental receipts\"]")
//    WebElement ownerAddressField;
//    
//    @FindBy(xpath = "(//input[@placeholder=\"Receipt Start Date\"])[1]")
//    WebElement receiptStartDateField;
//    
//    @FindBy(xpath = "(//input[@placeholder=\"Receipt Start Date\"])[2]")
//    WebElement receiptEndDateField;
//    
//    @FindBy(xpath = "//input[@id=\"rentrecipt-form-email-nbInput\"]")
//    WebElement emailField;
//    
//    @FindBy(xpath = "//button[@class=\"submit-form btn btn-default\"]")
//    WebElement submitButton;
//    
//    
//    
//	public RentFac(WebDriver driver)
//	{
//		this.driver = driver;
//		PageFactory.initElements(driver, this);	
//	}
//	
//	 public void clickMenuTab() throws InterruptedException {
//	        menuTab.click();
//	        Thread.sleep(1000);
//	    }
//
//	    public void clickRentReceiptOption() throws InterruptedException {
//	        rentReceiptOption.click();
//	        Thread.sleep(1000);
//	    }
//
//	    public void fillRentReceiptForm(String tenantName, String ownerName, String tenantPhone, String ownerPhone, String rent, String ownerPAN, String rentedPropertyAddress, String ownerAddress, String receiptStartDate, String receiptEndDate, String email) throws InterruptedException {
//	        tenantNameField.sendKeys(tenantName);
//	        Thread.sleep(1000);
//	        ownerNameField.sendKeys(ownerName);
//	        Thread.sleep(1000);
//	        tenantPhoneField.sendKeys(tenantPhone);
//	        Thread.sleep(1000);
//	        ownerPhoneField.sendKeys(ownerPhone);
//	        Thread.sleep(1000);
//	        rentField.sendKeys(rent);
//	        Thread.sleep(1000);
//	        ownerPanField.sendKeys(ownerPAN);
//	        Thread.sleep(1000);
//	        rentedPropertyAddressField.sendKeys(rentedPropertyAddress);
//	        Thread.sleep(1000);
//	        ownerAddressField.sendKeys(ownerAddress);
//	        Thread.sleep(1000);
//	        receiptStartDateField.sendKeys(receiptStartDate);
//	        
//	        List<WebElement> all=driver.findElements(By.xpath("//div[@aria-label=\"day-19\"]"));
//			for(WebElement e: all)
//			{
//			String date = e.getText();	//1  2  3
//	        if(date.equals(receiptStartDate))
//		    {
//			   e.click();
//			   break;
//		    }
//			}
//	        
//	        Thread.sleep(1000);
//	        receiptEndDateField.sendKeys(receiptEndDate);
//	        
//	        List<WebElement> all1=driver.findElements(By.xpath("//div[@aria-label=\"day-29\"]"));
//			for(WebElement e1 : all1)
//			{
//			String date1 = e1.getText();	//1  2  3
//	        if(date1.equals(receiptEndDate))
//		    {
//			   e1.click();
//			   break;
//		    }
//			}
//	        
//	        Thread.sleep(1000);
//	        emailField.sendKeys(email);
//	        Thread.sleep(1000);
//
//	    }
//
//	    public void clickGenerateRentReceiptButton() throws InterruptedException {
//	    	submitButton.click();
//	    	Thread.sleep(1000);
//	    }
//
//	    public boolean isMessageDisplayed() {
//	    	return driver.findElement(By.xpath("//div[text()=\"Congratulations\"]")).isDisplayed();
//	    }       
//	   
//}



//======================================================Scenario 3 - [PayRent]=============================================================



//@PayRent


//package Page;
//
//import java.awt.AWTException;
//
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
//import java.util.Set;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class RentFac {
//    WebDriver driver;
//    
//    @FindBy(xpath = "//div[@class=\"text-header-text-color\"]")
//    WebElement payRentTab;
//  
//   // @FindBy(xpath = "//div[@class=\"css-1hwfws3 nb-select__value-container nb-select__value-container--has-value\"]")
//  //  @FindBy(xpath = "//div[@class=\"css-16pqwjk-indicatorContainer nb-select__indicator nb-select__dropdown-indicator\"]") 
//   // @FindBy(xpath = "//div[@class=\"css-v2nw5i-control nb-select__control\"]")
//    @FindBy(xpath = "//div[@class=\"css-v2nw5i-control nb-select__control\"]/child::div[2]")
//    WebElement paymentTypeSelect;
//
//    @FindBy(id = "tenant_name")
//    WebElement nameInput;
//
//    @FindBy(id = "tenant_phone")
//    WebElement mobileNumberInput;
//
//    @FindBy(id = "tenant_email")
//    WebElement emailInput;
//
//    @FindBy(xpath = "//div[@class=\"nb__yEPwf\"]/div/div/label/input")
////  @FindBy(xpath = "(//input[@type=\"checkbox\"])[2]")
//    WebElement termsAndConditionsCheckbox;
//
//    @FindBy(xpath = "//button[@class=\"btn btn-primary btn-block\"]")
//    WebElement getStartedButton;
//
//    @FindBy(xpath = "//div[@class=\"content-container \"]")
//    WebElement verificationCodePopup;
//
//    public RentFac(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//    }
//    
//    public void clickPayRent() throws InterruptedException
//    {
//    	payRentTab.click();
//    	
//    	String mainWindowHandle = driver.getWindowHandle();
//        Set<String> allWindowHandles = driver.getWindowHandles();
//    
//        for (String windowHandle : allWindowHandles) {
//            if (!windowHandle.equals(mainWindowHandle)) {
//                driver.switchTo().window(windowHandle);
//                break;
//            }
//        }
//    	//driver.navigate().to("https://www.nobroker.in/pay-property-rent-online?nbFr=home_page");
//    	//Thread.sleep(2000);
//    }
//    
//    public void selectPaymentType() throws InterruptedException, AWTException  
//    {    
//    	paymentTypeSelect.click(); 
//	    Thread.sleep(1000);
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
////		robot.keyPress(KeyEvent.VK_DOWN);
////		robot.keyRelease(KeyEvent.VK_DOWN);
////		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_ENTER);  
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(1000);
//    	
//    }
//    
//    public void enterName(String name) throws InterruptedException {
//        nameInput.sendKeys(name);
//        Thread.sleep(3000);
//    }
//
//    public void enterMobileNumber(String mobileNumber) throws InterruptedException {
//    	//mobileNumberInput.click();
//    	mobileNumberInput.sendKeys(mobileNumber);
//        Thread.sleep(3000);
//    }
//
//    public void enterEmail(String email) throws InterruptedException {
//        emailInput.sendKeys(email);
//        Thread.sleep(3000);
//    }
//
//    public void agreeToTermsAndConditions() throws InterruptedException {
//    	termsAndConditionsCheckbox.click();
//    	
////    	WebDriverWait wait = new WebDriverWait(driver, 10);
////        wait.until(ExpectedConditions.elementToBeSelected(termsAndConditionsCheckbox));
//        Thread.sleep(5000);
//    }
//
//    public void clickGetStartedButton() throws InterruptedException {
//        getStartedButton.click();
//        Thread.sleep(2000);
//    }
//
//    public boolean isVerificationCodePopupDisplayed() {
//        return verificationCodePopup.isDisplayed();
//    }
//}

//======================================================Scenario 4 - [SaveSearch]=============================================================


//package Page;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class RentFac 
//{
//    WebDriver driver;
//    WebDriverWait wait;
//
//    @FindBy(css = "#location")
//    private WebElement locationInput;
//
//    @FindBy(css = "#tenantType")
//    private WebElement tenantTypeInput;
//
//    @FindBy(css = "#minBudget")
//    private WebElement minBudgetInput;
//
//    @FindBy(css = "#maxBudget")
//    private WebElement maxBudgetInput;
//
//    @FindBy(css = "#houseType")
//    private WebElement houseTypeInput;
//
//    @FindBy(css = "#propertyType")
//    private WebElement propertyTypeInput;
//
//    @FindBy(css = "#furnishingType")
//    private WebElement furnishingTypeInput;
//
//    @FindBy(css = "#shiftingDate")
//    private WebElement shiftingDateInput;
//
//    @FindBy(css = "#specificRequirements")
//    private WebElement specificRequirementsInput;
//
//    @FindBy(css = "#saveAlertButton")
//    private WebElement saveAlertButton;
//
//    public RentFac(WebDriver driver) {
//        this.driver = driver;
//        this.wait = new WebDriverWait(driver, 10);
//    }
//
//    public void enterAndSelectSearchCriteria(String location, String tenantType, String minBudget, String maxBudget, String houseType, String propertyType, String furnishingType, String shiftingDate, String specificRequirements) {
//        locationInput.sendKeys(location);
//        tenantTypeInput.sendKeys(tenantType);
//        minBudgetInput.sendKeys(minBudget);
//        maxBudgetInput.sendKeys(maxBudget);
//        houseTypeInput.sendKeys(houseType);
//        propertyTypeInput.sendKeys(propertyType);
//        furnishingTypeInput.sendKeys(furnishingType);
//        shiftingDateInput.sendKeys(shiftingDate);
//        specificRequirementsInput.sendKeys(specificRequirements);
//    }
//
//    public void clickSaveAlertButton() {
//        saveAlertButton.click();
//    }
//
//    public boolean isMessageDisplayed() {
//        WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert-message")));
//        return messageElement.isDisplayed();
//    }
//}
//
























