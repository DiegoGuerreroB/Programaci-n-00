package models;

import java.util.Scanner;

public class Game{
	
	private String position;
	private String level;
	private Scanner scanner;
	public static final char HOLE = ' ';
	public static final char ROOF = '*';
	public static final char FLOOR = '_';
	public static final char JUMP = 'w';
	public static final char WALK = 'd';
	public static final char GO_DOWN = 's';

	public Game(String level){
		scanner = new Scanner(System.in); 
		this.level = level;
	}

	public void printLevel(){
		System.out.println(level);
	}

	public void analizeChar(){
		String position = scanner.nextLine();
		int counter = 3;
		for (int i = 0; i < level.length(); i++) {
			if (level.charAt(i) == FLOOR) {
				if (position.charAt(i) != WALK) {
					counter--;
				}
			}else if (level.charAt(i) == ROOF) {
				if (position.charAt(i) != GO_DOWN) {
					counter--;
				}
			}else {
				if (position.charAt(i) != JUMP) {
					counter--;
				}
			}
			if (counter == 0) {
				System.out.println("Has perdido :/");
				break;
			}else {
				System.out.println("Felicitaciones");
				break;
			}
		}
	}

	public static void main(String[] args) {
		Game ss = new Game("_* _*_***_");
		ss.printLevel();
		ss.analizeChar();
	}
}
