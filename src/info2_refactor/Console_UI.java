package info2_refactor;

/*
 * Class which instantiates a Main object. 
 */


public class Console_UI {
	
	Main main;

	public Console_UI() {
	
		main = new Main();
	
	}
	
	
	public static void main(String args[]) {
		
	Console_UI thisUI = new Console_UI();
	thisUI.printLabs();
	}
	
	public void printLabs() {
		main.printAllLabServers();
	}
	
	
}