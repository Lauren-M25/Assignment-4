
import java.util.ArrayList;

/********************************************************************
 * Programmer: Lauren
 * 
 * Class:  CS30S
 *
 * Assignment: Skater class
 *
 * Description: Skater object with a unique ID and times.
 ***********************************************************************/

// import libraries as needed here

public class Skater {
    //*** Class Variables ***
    
        public static int nextId = 1000; // static variable to get next ID
    
    //*** Instance Constant ***
        
        private final int conversiondivisor = 60; // divisor/multiplier to convert between seconds, minutes and hours
        private final int speedconversiondivisor = 3600; // divisor/multiplier to convert between seconds and hours
        private final int km = 5; // number of km in race
        
    //*** Instance Variables ***
    
        private int Id = 0; // skater's ID number
        private ArrayList<Time> times = new ArrayList(); // array of times
        
    //*** Constructors ***
    
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
            this.Id = nextId++; // set ID
            
            int m = 0; // declare minutes
            int s = 0; // declare seconds
            
            for(int i = 0; i < Skatertimes.length; i++){
                
                m = Integer.parseInt(Skatertimes[i]); // parse m
                s = Integer.parseInt(Skatertimes[++i]); // parse s
                
                this.times.add(new Time (m,s)); // create new time
            } // end parse times
            
        } // end initialized constructor
        
    //*** Getters ***
    
    /*****************************************
    * Description: prints skater's id and times
    * 
    * Interface:
    * 
    * ****************************************/
        
        public void printInfo(){
            System.out.println("ID: " + this.Id); // print ID
            System.out.println("Times:");
            for(int i = 0; i < this.times.size(); i++){
                System.out.println(times.get(i).getTime());
            } // end print times
        } // end printInfo
        
    /*****************************************
    * Description: calculate average time in seconds
    * 
    * Interface:
    * 
    * @return      averageseconds: double, average time in seconds
    * ****************************************/
        public double calcAverageTime(){
            double averageminutes = 0; // declare average minutes
            double averageseconds = 0; // declare average second
            
            for(int i = 0; i < this.times.size(); i++){
                averageminutes += this.times.get(i).getMin();
                averageseconds += this.times.get(i).getSec();
            } // end add up mins and secs
            
            averageseconds += averageminutes * conversiondivisor; // convert minutes to seconds and add to total seconds
            
            averageseconds = averageseconds / this.times.size(); // average the seconds
            
            return averageseconds; // return average seconds
        } // end calcAverageTime
        
        /*****************************************
    * Description: return a formatted string of average time
    * 
    * Interface:
    * 
    * @return      averageTime: String, formatted string of the average time
    * 
    * ****************************************/
        public String getAverageTime(){
            
            int averageseconds = (int)this.calcAverageTime(); // get seconds from method
            int averageminutes = averageseconds / conversiondivisor; // convert seconds to minutes
            int averagesecond = averageseconds % conversiondivisor; // get seconds without minute seconds
            
            String averageTime = String.format("%d%s%02d", averageminutes, ":", (averageseconds - averageminutes * 60));
            
            return averageTime; // return average time
        } // end getAverageTime
        
    /*****************************************
    * Description: return a formatted string of average speed
    * 
    * Interface:
    * 
    * @return      averagespeed: String, formatted string of the average speed
    * 
    * ****************************************/
        public String getAverageSpeed(){
            
            double hours = calcAverageTime() / speedconversiondivisor; // converts average seconds into hours
            
            String averagespeed = String.format("%1.2f %s", (km / hours), "km/h");
            
            return averagespeed; // return average speed
        } // end getAverageSpeed
        
    /*****************************************
    * Description: return a formatted string of speed
    * 
    * Interface:
    * 
    * @param       race: int, number of race
    * 
    * @return      speed: String, formatted string of speed
    * 
    * ****************************************/
        public String getSpeed(int race){
            
            double sec = times.get(race-1).getMin() * conversiondivisor + times.get(race-1).getSec(); // convert mins and secs to secs
            
            double hours = sec / speedconversiondivisor; // convert total seconds to hours
            
            String speed = String.format("%1.2f %s", (km / hours), "km/h");
            
            return speed; // return speed
        } // end getAverageSpeed
        
    /*****************************************
    * Description: return a formatted string of time for a specific race
    * 
    * Interface:
    * 
    * @return      String, formatted string of the time
    * 
    * ****************************************/
        public String getTimeforRace(int race){
            return times.get(race-1).getTime(); // return time
        } // end getTimeforRace
        
    /*****************************************
    * Description:  print skater information
    * 
    * Interface:
    * 
    * @return       s: String, skater info
    * ****************************************/
    @Override
        public String toString(){
            String s = "";
         
          s = String.format("%s %d %s", "ID:", this.Id, "\n");
          s += String.format("%s %s %s", "Average time:", this.getAverageTime(), "\n");
          s += String.format("%s %s %s", "Average speed:", this.getAverageSpeed(), "\n");
          s += String.format("%-10s %s", "Times:", "\n");
          for(int i = 0; i < this.times.size(); i++){
          s += String.format("%-10s %s", this.times.get(i).getTime(), "\n");
          }
          
            return s;
        } // end toString overloaded
        
    //*** Setters ***
    
    /*****************************************
    * Description: add a new time to the time array
    * 
    * Interface:
    * 
    * ****************************************/
        public void addTime(int m, int s){
            this.times.add(new Time (m,s)); // add new time
        } // end getTimeforRace    
        
} // end of public class
