package phidgetRover;


//Add Phidgets Library
import com.phidget22.*;

public class challengeRover {
public static void main(String[] args) throws Exception {

    //Connect to wireless rover
    Net.addServer("", "192.168.100.1", 5661, "", 0);

    //Create
    DCMotor leftMotors = new DCMotor();
    DCMotor rightMotors = new DCMotor();

    //Address
    leftMotors.setChannel(0);
    rightMotors.setChannel(1);

    //Open
    leftMotors.open(5000);
    rightMotors.open(5000);
   

    for(int i=0; i<4; i++ ) {
    //Move forward at full speed
    leftMotors.setTargetVelocity(-1);
    rightMotors.setTargetVelocity(-1);
 
    //Wait for 2 second
    Thread.sleep(1500);
   
    leftMotors.setTargetVelocity(0);
    rightMotors.setTargetVelocity(0);
    Thread.sleep(800);

  ///Turn in one direction
    leftMotors.setTargetVelocity(1);
    rightMotors.setTargetVelocity(-1);


    //Wait for 1 second
    Thread.sleep(620);
    leftMotors.setTargetVelocity(0);
    rightMotors.setTargetVelocity(0);
    Thread.sleep(800);

    }
   
   
}
}
