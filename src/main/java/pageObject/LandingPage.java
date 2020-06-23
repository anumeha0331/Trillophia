package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	By sigIn= By.xpath("//span[contains(text(),'Log')]");
	By title=By.xpath("//h1[@class='intro-heading__caption']");
	By header =By.xpath("//div[@class='intro-heading__title']");
	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement Header()
	{
		return driver.findElement(header);
	}
	
	public WebElement Title()
	{
		return driver.findElement(title);
	}
	public WebElement logIn()
	{
		return driver.findElement(sigIn);
	}
}
