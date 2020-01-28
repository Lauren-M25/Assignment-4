/********************************************************************
 * Programmer: Lauren
 * 
 * Class:  CS30S
 *
 * Assignment: A4 Q1
 *
 * Description: Prints info and does calculations based on stats of skater objects.
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 //import java.text.DecimalFormat;
 import java.io.*;
import java.util.ArrayList;

public class ClientTemplate {  // begin class
    
    public static void main(String[] args)throws IOException {  // begin main
    
    // ********* declaration of constants **********
    
    // ********** declaration of variables **********

        String strin;		// string data input from keyboard
        String strout;		// processed info string to be output
        String bannerOut;        // string to print banner to message dialogs

        String prompt;		// prompt for use in input dialogs

        String delim = "[ :]+";	// delimiter string for splitting input string
        String[] tokens;        // string array for gathering input
        
        String nl = System.lineSeparator();    // new line character for file writing
    	
    // ***** create objects *******
    
        //DecimalFormat df1 = new DecimalFormat("##.###");
    
        ProgramInfo programInfo = new ProgramInfo("A4 Q1"); // create program info object
        
        BufferedReader fin = new BufferedReader(new FileReader("skaterData.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
        
        ArrayList<Skater> skaters = new ArrayList(); // create array of skaters
    	
    // ********** Print output Banner **********

        programInfo.printBanner();
	    	
    // ************************ get input **********************

        strin = fin.readLine(); // priming statement
        
        while(strin != null){

            tokens = strin.split(delim); // split times into tokens array
            skaters.add(new Skater(tokens)); // add a skater with times in tokens
            
            strin = fin.readLine(); // loop update statement
        } // end of loading array
        
    // ************************ processing ***************************
        
        for(int i = 0; i < skaters.size(); i++){
            skaters.get(i).printInfo(); // print info for skater
        } // end print info
        
        skaters.get(0).addTime(7, 8); // add a new time to skater
        
        for(int j = 0; j < skaters.size(); j++){
            System.out.println(skaters.get(j).toString()); // print to string
        } // end to string 
        
        System.out.println(skaters.get(0).getTimeforRace(1)); // print first race time
        System.out.println(skaters.get(0).getSpeed(1)); // print first speed
        
    // ************************ print output ****************************
    
    // ******** closing message *********
        
        programInfo.printClosing(); // print closing message
        
    // ***** close streams *****
        
        fin.close();                // close input buffer stream
        fout.close();               // close output stream
        
    }  // end main
}  // end class
