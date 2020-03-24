package info2_refactor;


import java.io.*;

public class Lab2_Histogram_LabClass
{

    /* In this class, 3 methods are described. 
    * Method 1 (step1FileReader): collects all letters of a text file, here hardset to "text.txt"
    * (but could take the argument of any file at any location if desired), and saves them in a String.
    * Method 2 (step2charCounter) assigns the ASCII values of uppercase letters A-Z to an Array for counting, 
    * and counts them all. 
    * Method 3 (step3fileWriter) writes the results, which are saved in the Array, to a new file, frequency.txt
    */
    
    FileReader fr;
    //char to read single characters of file
    char currChar;

    Writer fileWriter;

    String totString = "";

    int[][] charFreq = new int [26][2];

    public Lab2_Histogram_LabClass(){

    }

    //fileReader function collects all (alphabetical) characters from file, stores them in a String
    //and returns the string as well as a character count. 
    public void step1fileReader() throws IOException{
        String file_name = "C:\\Users\\Konrad\\Documents\\programming_practice\\practice_repo\\info2_refactor\\src\\info2_refactor\\text.txt";
        FileReader fr = new FileReader(file_name);
        System.out.println("Copied from the file to the console:");

        while(fr.ready()){

            int i;    

            /*the fileReader class reads in the content of a file as a stream of characters 
             * (quoted http://tutorials.jenkov.com/java-io/filereader.html, 25.10.2019) 
             * as long as the character read is not -1, which indicates the end of the file, 
             * it keeps reading.*/
            while((i=fr.read())!=-1){
                //if the char value is that of an alphabetical letter, increase charCount and add
                // the character to our total character string, totString
                if((i > 64 && i < 91) || (i > 96 && i < 123)){
                    //accumulate all single characters in a string for later reading
                    totString += (char)i;
                }

            }

        }
        System.out.println(totString);
        System.out.println("Total amount of characters: " + totString.length());
        fr.close();
        //return totString;
    }

    //function that counts all instances of each character, and saves them with their respective ASCII value to 
    //a 2d array, charFreq
    public void step2charCounter(){
        for(int b = 0; b < charFreq.length;b++){
            charFreq[b][0] = 65+b;
        }

        for(int c = 0; c < totString.length(); c++){
            int charInt = (int) totString.charAt(c);
            //counting and displaying will happen with uppercase characters, so if lowercase, subtract 32
            if(charInt > 96){
                charInt -= 32;}
            for(int d = 0; d < charFreq.length;d++){
                if(charFreq[d][0] == charInt){
                    charFreq[d][1]++;
                } 
            }
        }
        for(int e = 0;e <charFreq.length;e++){
            System.out.println("Letter " + (char) charFreq[e][0] + " occurs " + charFreq[e][1] + " times.");
            //System.out.println(charFreq[e][0]);
        }
    }

    //fileWriter function creates a new text file if necessary, and saves all our read info to it
    public void step3fileWriter() throws IOException{
        //makes a new frequencies text file, as requested
        Writer fileWriter = new FileWriter("frequencies.txt");
        //go through whole charFreq array to print to console as well as save to the new file
        for(int e = 0;e <charFreq.length;e++){
            System.out.println("Letter " + (char) charFreq[e][0] + " occurs " + charFreq[e][1] + " times.");
            String starCounter = "";
            for(int f = 0; f < charFreq[e][1]; f++){
                starCounter += "*";   
            }

            fileWriter.write((char) charFreq[e][0] + ": " + starCounter + (char) 10);
        }
        fileWriter.close();
    }

    
    public void createHistogram() throws IOException{
    	step1fileReader();
    	step2charCounter();
    	step3fileWriter();
    }
}
