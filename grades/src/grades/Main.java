package grades;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[]  args) {
		GradeManager gm = new GradeManager();
		try {
		BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Starting the grade manager;");
		
		while (true) {
			System.out.println("-----------------------\nadd\nprint\nexit");
			System.out.println("\nCommand:");
				String input = cin.readLine();
				if (input.startsWith("add")) {
					if(input.length()!=5 || input.charAt(3)!=' ') {
						System.out.println("Command is wrong! Please check it.");
					}
					else {
					System.out.println("Enter a GPA:");
					double point = Double.parseDouble(cin.readLine());
					
					if(point>=3.2 && point<=4) {
						if(input.substring(4).equals("a")) {
							gm.addGrade(input.substring(4));
						}
						else {
							System.out.println("GPA is not matched!");
						}
					}
					else if(point>=2.4 && point<3.2) {
						if(input.substring(4).equals("b")) {
							gm.addGrade(input.substring(4));
						}
						else {
							System.out.println("GPA is not matched!");
						}
					}
					else if(point>=1.6 && point<2.4) {
						if(input.substring(4).equals("c")) {
							gm.addGrade(input.substring(4));
						}
						else {
							System.out.println("GPA is not matched!");
						}
					}
					else if(point>=0.8 && point<1.6) {
						if(input.substring(4).equals("d")) {
							gm.addGrade(input.substring(4));
						}
						else {
							System.out.println("GPA is not matched!");
						}
					}
					else if(point>=0 && point<0.8) {
						if(input.substring(4).equals("f")) {
							gm.addGrade(input.substring(4));
						}
						else {
							System.out.println("GPA is not matched!");
						}
					}
					else {
						System.out.println("GPA is wrong!");
					}
					
					
					}
				} else if (input.equals("print")) {
					
					gm.printHistogram();
					
				}  else if (input.equals("exit")) {
					System.out.println("Program ends.");
					break;
				}
				else {
					System.out.println("Command is wrong!");
				}
				
		}
		
		}
		catch(Exception ex) {
			System.out.println("Oroltond aldaa garlaa.");
		}
	}
}
