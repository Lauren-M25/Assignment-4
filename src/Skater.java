
import java.util.ArrayList;

/********************************************************************
 * Programmer: Lauren
 * 
 * Class:  CS30S
 *
 * Assignment: Skater class
 *
 * Description: Skater object with a unique ID and stats.
 ***********************************************************************/

// import libraries as needed here

public class Skater {
    //*** Class Variables ***
    
        public static int nextId = 1000; // static variable to get next ID
    
    //*** Instance Variables ***
    
        private int Id = 0;
        private ArrayList<Time> times = new ArrayList();
        
    //*** Constructors ***
    
    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
    
    /*****************************************
    * Description: Initialized constructor. Create a skater 
    * object with an id and an array of times.
    * 
    * Interface:
    * 
    * @param       Skatertimes: String[], array of times from the text file
    * 
    * ****************************************/
        public Skater(String[] Skatertimes){
            this.Id = nextId++;
            
            int m = 0;
            int s = 0;
            
            for(int i = 0; i < Skatertimes.length; i++){
                
                m = Integer.parseInt(Skatertimes[i]);
                s = Integer.parseInt(Skatertimes[++i]);
                
                this.times.add(new Time (m,s));
            } // end parse coordinates
            
        } // end initialized constructor
        
    //*** Getters ***
    
    /*****************************************
    * Description: prints skater's id and times
    * 
    * Interface:
    * 
    * ****************************************/
        
        public void printInfo(){
            System.out.println("ID: " + this.Id);
            System.out.println("Times:");
            for(int i = 0; i < this.times.size(); i++){
                System.out.println(times.get(i).getTime());
            }
        }
        
    //*** Setters ***
    
} // end of public class
