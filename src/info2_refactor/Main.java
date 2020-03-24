package info2_refactor;

import java.util.ArrayList;

/*
 * Program which contains programs made in the HTW Berlin IMI Info 2 course. 
 * @konrad-u
 * 
 * The following individual lab sessions (and resulting programs) made up the practical work: 
 * - Lab 01: Chatterbox (Server-Client network communication) [OMITTED AS NEEDS TWO COMPUTERS TO FULLY FUNCTION]
 * - Lab 02: Alphabet character counter, visualization with Histogram
 * - Lab 03: Algorithm execution times
 * - Lab 04: Julian Date calendar to learn about abstract data types
 * - Lab 05: Fun with Calculators 1: extending calculator program with functionality
 * - Lab 06: Reverse Polish Notation using new data types: stacks, linked lists
 * - Lab 07: Fun with Calculators 2: String of infix notation to RPN and calculation
 * - Lab 08: Fun with Calculators 3: Calculation using other data types, e.g. with calendar input
 * - Lab 09: Recursive Triangles visual representation of Skapinsky triangles
 * - Lab 10: Getting from A to B in a weighted Graph with search algorithms
 * - Lab 11: Scrabble Cheater, basic edition which stores words in a hash table
 * - Lab 12: Scrabble Cheater, deluxe edition which returns all legal permutations of a word input
 * 
 * 
 * 
 * Content so far: 
 * 1. Histogram program 
 * Test to see if repository is properly set up
 */

public class Main {

	Lab2_Histogram_LabServer lab2;
	
	ArrayList<LabServer> allLabServers = new ArrayList<>();
	
	
	public Main() {
		lab2 = new Lab2_Histogram_LabServer();
		allLabServers.add(lab2);
	}
	
	public void printAllLabServers() {
		System.out.println("The following lab programs are available: ");
		for(LabServer LabServer : allLabServers) {
			System.out.println(LabServer.getLabTitle());
		}
		allLabServers.forEach(LabServer -> System.out.println(LabServer.getLabTitle()));
		
	}
	

}
