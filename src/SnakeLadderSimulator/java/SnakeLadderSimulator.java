package SnakeLadderSimulator.java;

public class SnakeLadderSimulator {
public static void main(String[] args) {
	System.out.println("Welcome to Snake Ladder Simulator");
	int START_POSITION = 0;
	
	int DiceRoll = (int) (Math.floor(Math.random() * 10 ) % 6) +1;
	System.out.println(DiceRoll );

}
}