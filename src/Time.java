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
    
        private int min = 0; // minutes
        private int sec = 0; // seconds
    
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
            this.min = min; // set minutes
            this.sec = sec; // set seconds
        } // end Time
    
    //*** Getters ***
    
    /*****************************************
    * Description: return a formatted string of time
    * 
    * Interface:
    * 
    * @return      time: String, formatted string of the time
    * 
    * ****************************************/
        public String getTime(){
            String time = ""; // declare time
            
            
            time = String.format("%d%s%02d", this.min, ":", this.sec);
            
            
            return time; // return time
        } // end getTime
        
    /*****************************************
    * Description: return the amount of minutes
    * 
    * Interface:
    * 
    * @return      min: int, number of minutes
    * 
    * ****************************************/
        public int getMin(){
            return this.min; // return min
        } // end getMin
        
    /*****************************************
    * Description: return the amount of seconds
    * 
    * Interface:
    * 
    * @return      sec: int, number of seconds
    * ****************************************/
        public int getSec(){
            return this.sec; // return sec
        } // end getSec
        
    //*** Setters ***
    
    /*****************************************
    * Description: change minutes and seconds of time
    * 
    * Interface:
    * 
    * @param      min: int, new amount of minutes
    * @param      sec: int, new amount of seconds
    * ****************************************/
        public void setTime(int min, int sec){
            this.min = min; // set new min
            this.sec = sec; // set new sec
        } // end setTime
        
    /*****************************************
    * Description: change minutes of time
    * 
    * Interface:
    * 
    * @param      min: int, new amount of minutes
    * ****************************************/
        public void setMin(int min){
            this.min = min; // set new min
        } // end setMin
        
    /*****************************************
    * Description: change seconds of time
    * 
    * Interface:
    * 
    * @param      sec: int, new amount of seconds
    * ****************************************/
        public void setSec(int sec){
            this.sec = sec; // set new sec
        } // end setSec
        
} // end of public class
