package grades;

import java.util.HashMap;

/** 
 * A GradeManager will create a command-line prompt that will let someone add grades
 * and display grades in histogram format.
 * 
 */

public class GradeManager {
	
	// Keeps track of the number of each grade this has
	private HashMap<LetterGrade,Integer> allGrades;

	/**
	 * Creates a new GradeManager.
	 */
	public GradeManager() {
		// Create a new HashMap of the grades
		this.allGrades = new HashMap<LetterGrade,Integer>();
		
		// Add in all grades and set the occurance to 0
		for (LetterGrade gl : LetterGrade.values()) {
			allGrades.put(gl, 0);
		}
	}
		
	/**
	 * Adds grade to this GradeManager.
	 * @param grade - grade to add to this grad manager
	 */
	public void addGrade(String grade) throws InvalidGradeException {
		if (grade.equals("a")) {
			
			int count = allGrades.get(LetterGrade.A);
			allGrades.put(LetterGrade.A, count++);
			
		} else if (grade.equals("b")) {
			
			int count = allGrades.get(LetterGrade.B);
			allGrades.put(LetterGrade.B, count++);
			
		} else if (grade.equals("c")) {
			
			int count = allGrades.get(LetterGrade.C);
			allGrades.put(LetterGrade.C, count++);
			
		} else if (grade.equals("d")) {
			
			int count = allGrades.get(LetterGrade.D);
			allGrades.put(LetterGrade.D, count++);
			
			
		} else if (grade.equals("f")) {
			
			int count = allGrades.get(LetterGrade.F);
			allGrades.put(LetterGrade.F, count++);
			
			
		} else {
			throw InvalidGradeException;
		} 	
	
	}

	/**
	 * Prints out a histogram of the grades to the console.
	 *
	 */
	public void printHistogram() {
		// TODO: YOUR CODE HERE
		//throw new RuntimeException("GradeManager.printHistogram() not yet implemented!");
		System.out.println(this.getHistString()); 
	}
	
	/**
	 * Returns a string representation of the histogram of the grades.
	 * @return a string representation of the histogram of the grades.
	 */
	public String getHistString() {
		StringBuffer sb = new StringBuffer();
		for (LetterGrade gl : LetterGrade.values()) {
			sb.append( gl+":");
			for (int i = 0; i < this.allGrades.get(gl); i++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	/**
	 * Simple loop that accepts 3 commands from System.in:
	 *    add <some grade> : for example, "add a" or "add b"
	 *                       adds the given grade to the GradeManager
	 *    print            : prints out all the grades in this GradeManager
	 *                       in a histogram format
	 *    exit             : exits the program
	 * @param args
	 */

	
}