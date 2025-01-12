package testscript;

public class NavigationCommands extends Base{
	public void navigation() {
		driver.navigate().to("https://www.google.com");	
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public static void main(String[] args) {
		NavigationCommands navigationCommands=new NavigationCommands();
		navigationCommands.initalizedBrowser();
		navigationCommands.navigation();
		navigationCommands.browserQuit();
	}

}
