package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
	public WebDriver driver;
	public void initalizedBrowser() {
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
	}
	public void browserQuit() {
		//driver.quit();//full window closing
		driver.close();//tab closing
	}

	public static void main(String[] args) {
		Basic base=new Basic();
		base.initalizedBrowser();
		base.browserQuit();

	}

}
