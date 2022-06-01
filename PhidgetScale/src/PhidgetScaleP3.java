/*

Program: PhidgetScaleP3.java     Last Date of this Revision:  May 26, 2022



Author: Said Rahmani, 
School: CHHS
Course: Computer Programming 30
 

*/

//Add Phidgets Library
import com.phidget22.*;

public class PhidgetScaleP3 {
    public static void main(String[] args) throws Exception{

        //Create
        VoltageRatioInput scale = new VoltageRatioInput();
        
        //Open
        scale.open(1000);
        
        System.out.println("Calculating Offset");
        
      //Use your Offset Value
        
        double totalOffset = 0;
        
        for (int i =0; i<64; i++) {
        	 totalOffset += scale.getVoltageRatio();
        }
        
        double offsetValue = totalOffset/64;
        Thread.sleep(2000);
        
        //Use your Phidgets
        while(true){

            //Calculate Weight (kg)
            double weight = 4700 * (scale.getVoltageRatio() - offsetValue);
            
            //Display Weight
            System.out.println(String.format("%.3f kg", weight));      
            
            
           
            
            Thread.sleep(250);
        }
    }    
}
  
