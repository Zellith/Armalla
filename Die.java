import java.util.*;

public class Die {

	//fields
	private int faceValue;
	private int sides;
	
	public Die(){
		// default to six-sided die
		faceValue = 1;
		sides = 6;
	}           
	
	public Die(int sides){
		// variable number of sides
		faceValue = 1;
		this.sides = sides;
	}  
		    
	public int rollDice(){
		// randomly picks a face value
		Random r = new Random();
		
		faceValue = r.nextInt(sides) + 1;
        return faceValue;

	}     
	
	public int getValue(){
		// returns the face value
		return faceValue;
	} 
}
