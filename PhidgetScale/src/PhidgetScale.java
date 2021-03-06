/*

Program: PhidgetScale.java         Last Date of this Revision: June 1, 2022


Author: Said Rahmani, 
School: CHHS
Course: Computer Programming 30
 

*/
//Add Phidgets Library
import com.phidget22.*;

public class PhidgetScale {
    public static void main(String[] args) throws Exception{
        //Create
        VoltageRatioInput scale = new VoltageRatioInput();
        
        //Open
        scale.open(1000);
        
        //Use your Phidgets
        while(true){
            System.out.println("Offset Value: " + scale.getVoltageRatio());
            Thread.sleep(250);
        }
    }    
}
  
