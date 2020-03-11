package info2_refactor;

/*
 * Class which instantiates a Main object. 
 */


public class Console_UI {
	
	Main mainP;

	public Console_UI() {
	
		mainP = new Main();
	
	}
	
	
	public static void main(String args[]) {
		
	Console_UI thisUI = new Console_UI();
	
	thisUI.mainP.returnTestString();
	
	}
}