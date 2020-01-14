/********************************************************************
 * Programmer:	Lauren
 * 
 * Class:  CS30S
 *
 * Assignment: Time class
 *
 * Description: time object
 ***********************************************************************/

// import libraries as needed here

public class Time {
    //*** Class Variables ***
    
        private int min = 0;
        private int sec = 0;
    
    //*** Instance Variables ***
    
    //*** Constructors ***
    
    /*****************************************
    * Description: Initialized constructor. Create a time 
    * object with minutes and seconds.
    * 
    * Interface:
    * 
    * @param        min: int, number of minutes
    * @param        sec: int, number of seconds
    * 
    * ****************************************/
    
        public Time(int min, int sec){
            this.min = min;
            this.sec = sec;
        } // end Time
    
    //*** Getters ***
    
    /*****************************************
    * Description: return a formatted string of time
    * 
    * Interface:
    * 
    * ****************************************/
        public String getTime(){
            String time = (this.min + ":" + this.sec);
            return time;
        } // end getTime
        
    //*** Setters ***
    
} // end of public class
