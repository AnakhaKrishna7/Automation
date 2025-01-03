package testscript;

public class BrowserCommands extends Basic{
	
	public void browserCommands(){
		String title=driver.getTitle();
		
	}

	public static void main(String[] args) {
		BrowserCommands browsercommands=new BrowserCommands();
		browsercommands.initalizedBrowser();
		browsercommands.browserCommands();
		browsercommands.browserQuit();
	}

}
