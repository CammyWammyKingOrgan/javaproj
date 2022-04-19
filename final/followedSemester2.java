package Projects;
import javax.swing.JOptionPane;

public class followedSemester2 extends followed { // this is for the next semester

		//override previous system output
		public void display() {
			JOptionPane.showMessageDialog(null,//Lets the user know that they could be at risk of losing the scholarship
				String.format("You may be at risk of losing your scholarship "));
		}
}
