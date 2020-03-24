package info2_refactor;

import java.util.*;
import java.lang.reflect.*;

/*
 * Interface for all following Lab Server classes: each lab program will get its own implementation,
 * but here outlined are the methods that each lab server must be able to do. 
 */

public interface LabServer_Interface {
	
	// Title of lab program
	public String getLabTitle();
	
	// Description of lab program
	public String getLabDescription();

	// will be loaded with all (public?) methods of the class
	public Method[] classMethods = new Method[2];
	
	// will hold the methods as Strings for user console printing
	public ArrayList<String> labMethods = new ArrayList<>();

	
}
