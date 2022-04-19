package Projects;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class JavaProj1 
{
	public void disp(String Scholarship) {
		System.out.println(Scholarship);
	}
	public void disp(int Scholarship) {
		System.out.println(Scholarship);
	}
		
	public static void main(String args[])
	{
		
		int classes;      // The number of class
		String input;     // To hold the user's input
		double totalCredit;     // Accumulator
		double credit;    //The number of credits
		double gpa;       // The number for gpa
		
		Scanner YesNo = new Scanner(System.in);//Scanner for user to enter Y or N

		//This line will display a dialog box and ask the question of how many classes the user have.
		input = JOptionPane.showInputDialog("How many classes " + 
									"do you have this semester? ");    
		
		// This makes the users inputs become the classes integer
		classes = Integer.parseInt(input);
		
		totalCredit = 0.0;
		
		//Causes line 23 to repeat a certain amount of times
		for (int count = 1; count <= classes; count++)
	      {
			//Displays a dialog box asking the user to input their credits.
	         input = JOptionPane.showInputDialog("Enter the credit " +
	                                       "for the class " + count + ": ");
	         credit = Double.parseDouble(input);
	         totalCredit += credit;
	      }
			//Displays the total amount of credits the user has
	        JOptionPane.showMessageDialog(null, 
	                String.format("The total credits are %,.2f", totalCredit));
	        //Does the math to find the users gpa
	        gpa = totalCredit / classes;
	        //Displays users gpa
	        JOptionPane.showMessageDialog(null,
	        		String.format("Your current GPA is: %,.2f", gpa)); 
	 
	   if (gpa >= 3.5 && gpa <= 4.0) { /* if the gpa is greater than or equal
	   									to 3.5 and less than or equal to 4.0 you are awarded the Presidential Scholarship.*/
		  JOptionPane.showMessageDialog(null,
	        		String.format("You have been awarded the " + 
	        					"Presidental Scholarship worth: $20,000"));
		  JavaProj1 obj = new JavaProj1();
		  obj.disp("Presidential Scholarship");
		  obj.disp(20000);
	  } else if (gpa >= 3.0 && gpa <= 3.49) { /* if the gpa is greater than or equal
	   						to 3.0 and less than or equal to 3.49 you are awarded the ITS Scholarship.*/
		  JOptionPane.showMessageDialog(null,
	        		String.format("You have been awarded the " +
	        					"ITS Scholarship worth: $12,000"));
		  JavaProj1 obj = new JavaProj1();
		  obj.disp("ITS Scholarship");
		  obj.disp(12000);
	  } else if (gpa >= 2.5 && gpa <= 2.99) { /* if the gpa is greater than or equal
	   						to 2.5 and less than or equal to 2.99 you are awarded the Academic Scholarship.*/
		  JOptionPane.showMessageDialog(null,
	        		String.format("You have been awarded the " +
	        					"Academic Scholarship worth: $7.000"));
		  JavaProj1 obj = new JavaProj1();
		  obj.disp("Academic Scholarship");
		  obj.disp(7000);
	  } else if (gpa >= 2.0 && gpa <= 2.49) { /* if the gpa is greater than or equal 
	  						to 2.0 and less than or equal to 2.49 you are awarded the Faith Scholarship.*/
		  JOptionPane.showMessageDialog(null,
	        		String.format("You have been awarded the " +
	        					"Faith Sholarship worth: $3,000"));
		  JavaProj1 obj = new JavaProj1();
		  obj.disp("Faith Scholarship");
		  obj.disp(3000);
	  } else if (gpa < 1.99) { // if the gpa is less than 1.99 then you will not qualify for a scholarship.
		  JOptionPane.showMessageDialog(null,
	        		String.format("You do not qualify for any " +
	        					"of the Scholarship Programs."));
	  }
	  
		  
		
	   
	   System.out.println("Do you want to determine if you will keep your scholarship " +
				  				"next semester? Y/N");
		String yesno = YesNo.next();
		if (yesno.equals("Y")) {
			
			followedSemester();
		}
			else if(yesno.equals("N")) {
				
				System.exit(0);
		}
	}
	
	public static void followedSemester()/*This function will calculate if the user
														still has their scholarship the following semester*/
	{
		//Still trying to determine how to calculate through semester
		String input;     // To hold the user's input
		double NewGPA;     // Accumulator
		double gpaDifference;    //The number of credits
		double gpa;       // The number for gpa
		
		Scanner YesNo = new Scanner(System.in);//Scanner for the user to enter Y or N
		
		input = JOptionPane.showInputDialog("What was your starting GPA last semester? ");
		
		gpa = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("What is your new GPA after last semester?");
		
		NewGPA = Double.parseDouble(input);
		
		gpaDifference = NewGPA - gpa;
		
		if (NewGPA > gpa) {
		JOptionPane.showMessageDialog(null,
				String.format("Your GPA raised by %,.2f", gpaDifference));
		}
			else if(NewGPA < gpa) {
				JOptionPane.showMessageDialog(null,
						String.format("Your GPA dropped by %,.2f", gpaDifference));
		}
		
		
		if (NewGPA >= 2.0) {
		JOptionPane.showMessageDialog(null,//Lets user know that they will keep the scholarship
        		String.format("You will keep your scholarship " +
        						"next semester."));
		} else if(NewGPA <= 1.99){
			followed obj = new followedSemester2();
				obj.display();
		}
		
		
		System.out.println("Would you like to calculate how much you " + 
							"still owe the university? Y/N");/*Will ask the user if they want to know how much they
																	will still owe the university*/
		String yesno = YesNo.next();
		if (yesno.equals("Y")) {//Allows the user to enter Y for Yes
			
			moneyOwed();
		}
			else if(yesno.equals("N")) {//Allows the user to enter N for No
				
			System.exit(0);
		
		}
	}


	public static void moneyOwed()/*This function will calculate how much money is owed
												to the university after scholarship*/
	{
		Scanner keyboard = new Scanner(System.in);
		
		//List of scholarship awards from before as an array 
		int [] AwardedScholarship = {20000, 12000, 7000, 3000};

		double MoneyOwed; //This is the variable used for final cost out of pocket
		int TuitionCost; //Cost of tuition without Scholarship
		String input;     // To hold the user's input
		int ScholarshipWorth;
		
		input = JOptionPane.showInputDialog("How much does your tuition cost " +
											"without scholarships? ");
		TuitionCost = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("How much was the scholarship you were awarded? ");
		
		ScholarshipWorth = Integer.parseInt(input);
			if (ScholarshipWorth == 20000) {
				MoneyOwed = TuitionCost - AwardedScholarship[0];
				JOptionPane.showMessageDialog(null,
		        		String.format("You still owe the university: $%,.2f", MoneyOwed));
			} else if (ScholarshipWorth == 12000) {
				MoneyOwed = TuitionCost - AwardedScholarship[1];
				JOptionPane.showMessageDialog(null,
		        		String.format("You still owe the university: $%,.2f", MoneyOwed));
			} else if (ScholarshipWorth == 7000) {
				MoneyOwed = TuitionCost - AwardedScholarship[2];
				JOptionPane.showMessageDialog(null,
		        		String.format("You still owe the university: $%,.2f", MoneyOwed));
			} else if (ScholarshipWorth == 3000) {
				MoneyOwed = TuitionCost - AwardedScholarship[3];
				JOptionPane.showMessageDialog(null,
		        		String.format("You still owe the university: $%,.2f", MoneyOwed));
			}
				
			int resource = 2; {
			switch (resource) {
			case 1:
				System.out.println("Oops wrong number!");
				break;
			case 2:
				System.out.println("Sources: Dr. Munoz ITS 275 powerpoints and Dr. Munoz Github - https://github.com/DrGMC/JAVA");
				break;
			}
		}
				
	      main(null);

	}	
}
//Sources: Dr. Munoz ITS 275 powerpoints and Dr. Munoz Github - https://github.com/DrGMC/JAVA
