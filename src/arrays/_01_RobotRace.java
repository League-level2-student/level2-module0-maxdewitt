package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;


public class _01_RobotRace {
	//1. make a main method
 public static void main(String[] args) {
	 Robot[] rob = new Robot[5];
	 for (int i = 0; i < 4 ; i++) {
		 rob[i] = new Robot("june");
		 rob[i].moveTo(100*i+ 100, 500);
		 
	 }
	
	 for (int w = 0; w < 2; w++) {
		
	
		
		 Random rand = new Random();
		 int rand1 = rand.nextInt(500);
		 rob[0].move(rand1); 
		  rand1 = rand.nextInt(500);
		 rob[1].move(rand1); 
		  rand1 = rand.nextInt(500);
		 rob[2].move(rand1); 
		  rand1 = rand.nextInt(500);
		 rob[3].move(rand1); 
		  rand1 = rand.nextInt(500);
		 rob[4].move(rand1); 
		 rob[0].setSpeed(100);
		 rob[1].setSpeed(100);
		 rob[2].setSpeed(100);
		 rob[3].setSpeed(100);
		 rob[4].setSpeed(100);
		int rob1x = rob[0].getX();
		int rob2x = rob[1].getX();
		int rob3x = rob[2].getX();
		int rob4x =	 rob[3].getX();
		int rob5x =	 rob[4].getX();
		 
		 
		 if (rob1x > 0 || rob2x > 0 || rob3x > 0 || rob4x > 0 || rob5x > 0) {
			 w = 3;
		 }
		 else {
			 w = 1;
		 }
		 
	 }

} 
	//2. create an array of 5 robots.
 
	//3. use a for loop to initialize the robots.
    
		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
