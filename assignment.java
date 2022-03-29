package Projects;
import javax.swing.JOptionPane;

public class JavaProj1 
{
	public static void main(String args[])
	{
		
		int classes;      // The number of class
		String input;     // To hold the user's input
		double totalCredit;     // Accumulator
		double credit;    //The number of credits
		double gpa;       // The number for gpa

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
	        //Does the math to find the usrs gpa
	        gpa = totalCredit / classes;
		//Displays users gpa
	        JOptionPane.showMessageDialog(null,
	        		String.format("Your current GPA is: %,.2f", gpa));
	        
	  if (gpa >= 3.5 && gpa <= 4.0) { /* if the gpa is greater than or equal
	   						to 3.5 and less than or equal to 4.0 you are awarded the Presidential Scholarship.*/
		  JOptionPane.showMessageDialog(null,
	        		String.format("You have been awarded the " + 
	        					"Presidental Scholarship worth: $20,000"));
	  } else if (gpa >= 3.0 && gpa <= 3.49) { /* if the gpa is greater than or equal
	   						to 3.0 and less than or equal to 3.49 you are awarded the ITS Scholarship.*/
		  JOptionPane.showMessageDialog(null,
	        		String.format("You have been awarded the " +
	        					"ITS Scholarship worth: $12,000"));
	  } else if (gpa >= 2.5 && gpa <= 2.99) { /* if the gpa is greater than or equal
	   						to 2.5 and less than or equal to 2.99 you are awarded the Academic Scholarship.*/
		  JOptionPane.showMessageDialog(null,
	        		String.format("You have been awarded the " +
	        					"Academic Scholarship worth: $7.000"));
	  } else if (gpa >= 2.0 && gpa <= 2.49) { /* if the gpa is greater than or equal 
	  						to 2.0 and less than or equal to 2.49 you are awarded the Faith Scholarship.*/
		  JOptionPane.showMessageDialog(null,
	        		String.format("You have been awarded the " +
	        					"Faith Sholarship worth: $3,000"));
	  } else if (gpa < 1.99) { // if the gpa is less than 1.99 then you will not qualify for a scholarship.
		  JOptionPane.showMessageDialog(null,
	        		String.format("You do not qualify for any " +
	        					"of the Scholarship Programs."));
	  }
	        
	      System.exit(0);
	  }		
}
//Sources: Dr. Munoz ITS 275 powerpoints and Dr. Munoz Github - https://github.com/DrGMC/JAVA