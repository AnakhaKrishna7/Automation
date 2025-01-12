package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{
	public void locators() {
		WebElement showmessagebutton=driver.findElement(By.id("button-one"));//element find syntax
		WebElement buttonGetTotal=driver.findElement(By.id("button-two"));
		WebElement singleInputField=driver.findElement(By.id("single-input-field"));
		WebElement mbSec=driver.findElement(By.className("mb-sec"));
		WebElement classNameSample=driver.findElement(By.className("clearfix"));
		WebElement topLogo=driver.findElement(By.className("top-logo"));
		WebElement nameSample=driver.findElement(By.name("viewport"));
		WebElement description=driver.findElement(By.name("description"));
		WebElement keywords=driver.findElement(By.name("keywords"));
		WebElement selectInput=driver.findElement(By.linkText("Jquery Select2"));
		WebElement ajaxFormSubmit=driver.findElement(By.linkText("Ajax Form Submit"));
		WebElement checkboxDemo=driver.findElement(By.linkText("Checkbox Demo"));
		WebElement partialLinkTesxtSample=driver.findElement(By.partialLinkText("Checkbox"));
		WebElement ajaxForm=driver.findElement(By.partialLinkText("Ajax Form"));
		WebElement Select2=driver.findElement(By.partialLinkText("Select2"));
		WebElement css=driver.findElement(By.cssSelector(".clearfix"));// 2nd word need to give a dot.
		WebElement tagNameSample=driver.findElement(By.tagName("div"));
		WebElement css1=driver.findElement(By.cssSelector("button#button-one"));
		WebElement cssSample=driver.findElement(By.cssSelector("link[href='css/main.css']"));
		WebElement xpath1=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement xpath2=driver.findElement(By.xpath("//button[@id='button-two']"));
		WebElement xpath3=driver.findElement(By.xpath("//div[@id='message-one']"));
		WebElement xpath4=driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement xpath5=driver.findElement(By.xpath("//input[@id='value-b']"));
		
		WebElement xpath_contains=driver.findElement(By.xpath("//button[contains(@id,'on-one')]"));
		WebElement xpath_startwith=driver.findElement(By.xpath("//div[starts-with(@id,'message-o')]"));
		WebElement xpath_text=driver.findElement(By.xpath("//button[text()='Show Message']"));
		
		WebElement xpath_textor=driver.findElement(By.xpath("//button[text()='Show Message' or @id='button-two']"));
		WebElement xpath_textand=driver.findElement(By.xpath("//button[text()='Show Message' and @id='button-one']"));
		
		//WebElement xpath_endswith=driver.findElement(By.xpath(""));
	}

	public static void main(String[] args) {
		WebElementCommands webelementcommants=new WebElementCommands();
		webelementcommants.initalizedBrowser();
		webelementcommants.locators();
		webelementcommants.browserQuit();

	}

}
