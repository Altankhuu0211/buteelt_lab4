import java.io.BufferedReader;
import java.io.InputStreamReader;

import sw_buteelt.lab1.GradeManager;

public class Main {
	public static void main(String[]  args) {
		GradeManager gm = new GradeManager();
		try {
		BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Starting the grade manager");
		//
		while (true) {
				String input = cin.readLine();
				if (input.startsWith("add")) {
					
					gm.addGrade(input.substring(4));
					
				} else if (input.equals("print")) {
					
					gm.printHistogram();
					
				}  else if (input.equals("exit")) {
					System.out.println("Program ends.");
					break;
				}
			
		}
		
		}
		catch(Exception ex) {
			System.out.println("Oroltond aldaa garlaa.");
		}
	}
}
