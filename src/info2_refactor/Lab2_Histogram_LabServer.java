package info2_refactor;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Lab2_Histogram_LabServer extends LabServer{

	/* In this class, 3 methods are described. 
	 * Method 1 (step1FileReader): collects all letters of a text file, here hardset to "text.txt"
	 * (but could take the argument of any file at any location if desired), and saves them in a String.
	 * Method 2 (step2charCounter) assigns the ASCII values of uppercase letters A-Z to an Array for counting, 
	 * and counts them all. 
	 * Method 3 (step3fileWriter) writes the results, which are saved in the Array, to a new file, frequency.txt
	 */


	/*
	 * CLASS SPECIFIC IMPROVEMENTS (For class generic improvements, see either LabServer_Interface or LabServer_ParentClass
	 * 
	 * - allow user input for text source? step1fileReader method, line 44
	 * 
	 */

	public static final String labTitle = "Lab 2: Histogram";

	public static final String labDescription = "Reads in from a text file and counts the occurences of alphabetical characters. "
			+ "creates a text file called 'frequencies', which holds a histogram of character frequencies.";

	// will be loaded with all (public?) methods of the class
	public Method[] classMethods;

	// will hold the methods as Strings for user console printing
	public ArrayList<String> labMethods = new ArrayList<>();

	private Lab2_Histogram_LabClass lab2;


	public Lab2_Histogram_LabServer(){
		lab2 = new Lab2_Histogram_LabClass();
	}

	public void runMainProgram() {
		try {
			lab2.createHistogram();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}