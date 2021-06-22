package SnakeLadderSimulator.java;

public class SnakeLadderSimulator {
public static void main(String[] args) {
	System.out.println( "WelCome To Snake Ladder Simulator" );
//	CONSTANTS
	int START_POSITION = 0;
	final int NO_PLAY = 0 ;
	final int LADDER = 1 ;	
	final int SNAKE = 2 ;
	final int GOAL = 100 ;

//	variable
	int PlayerPosition = 0 ;
	int DicePlayedTimes = 0;
	
//	EXPRESIONS
	while( PlayerPosition < GOAL ) 
	{
		DicePlayedTimes ++;
	
		int DiceRoll = (int) (Math.floor(Math.random() * 10 ) % 6) + 1 ;
		int PlayerOption = (int) Math.floor(Math.random() * 10 ) % 3 ;
		
		System.out.println("Dice value " + DiceRoll);
		System.out.println( "Player option " + PlayerOption);
		
		switch ( PlayerOption )
		{
		
		case LADDER :
			System.out.println("Player choose Ladder");
			

			if (( PlayerPosition + DiceRoll ) <= GOAL)
			{
			PlayerPosition = PlayerPosition + DiceRoll;
			}
			break;
			
		case SNAKE :		
			System.out.println("Player choose Snake");
			
			if ( ( PlayerPosition - DiceRoll ) <= START_POSITION )
			{
				PlayerPosition = START_POSITION ;
			}
			else
			{				
				PlayerPosition = PlayerPosition - DiceRoll ;
			}
			break;
	
		default:
			System.out.println("Player choose no play");
			
			break;
		}
		System.out.println("Player Position " + PlayerPosition + "\n --------");
	}
	System.out.println("The number of times Played "+ DicePlayedTimes);
 }
}
