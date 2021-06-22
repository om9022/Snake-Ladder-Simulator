package SnakeLadderSimulator.java;

public class SnakeLadderSimulator {
public static void main(String[] args) {
	System.out.println("Welcome to Snake Ladder Simulator");
	int START_POSITION = 0;
//	CONSTANTS
	final int NO_PLAY = 0;
	final int LADDER = 1;
	final int SNAKE = 2;
	
//	variable
	int PlayerPosition = 0;
	
//	CALCULATIONS
	int DiceRoll = (int) (Math.floor(Math.random() * 10 ) % 6) +1;
	int PlayerOption = (int) Math.floor(Math.random() * 10 ) % 3;
	
	switch ( PlayerOption) {
	case LADDER :
		PlayerPosition = PlayerPosition + DiceRoll;
		break;
	case SNAKE :
		PlayerPosition = PlayerPosition - DiceRoll;
		break;
		
	default :
		
		break;
	
	}
	}

}
