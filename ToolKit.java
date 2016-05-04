package models;

public class ToolKit{

	public static final int NUMBER_CHAR = 48;
	private int distanceTotal;

	public void getBestStudent(String student){
		int nameStudent = 0;
		for (int i = 0; i < student.length(); i++ ) {
			if (Character.isLetter(student.charAt(i)) && student.charAt(i) != 44) {
				nameStudent = student.length(i);
			}else if (Character.isNumber(student.charAt(i))) {
				System.out.println(0);
			}
		}
		System.out.println(nameStudent);
	}

	public void street(String hole){
		int maxHole = 0;
		int counter = 0;	
		for (int i = 0; i < hole.length(); i++) {
			int totalHole = 0;
			if (hole.charAt(i) == 46) {
				counter ++;
				totalHole += counter;
			}else{
				counter = 0;
			}
			if (maxHole < totalHole) {
				maxHole = totalHole;
			}
		}
		System.out.println("Maximo de huecos seguidos es: " + maxHole);
	}

	public int getSumNumber(String number){
		int totalScore = 0;
		for (int i = 0; i < number.length(); i += 2 ) {
			int partialScore = 0;
			if (number.charAt(i) >= 48 && number.charAt(i) <= 57){
				partialScore += number.charAt(i) - 48;
			}else if (number.charAt(i) == 46) {
				partialScore = 0;
			}
			totalScore += partialScore;
		}
		return totalScore;
	}

	public static void main(String[] args) {
		ToolKit ss = new ToolKit();
		ss.street("_._...._.-_..-...:-...");
		ss.getBestStudent("hola123");
		System.out.println(ss.getSumNumber("2,1,5"));

	}
}
