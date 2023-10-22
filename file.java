import java.util.*;
import javax.swing.JOptionPane;
public class Practice3{
	public static void main(String args[]){
String menuData = " --:Dollar to Ruppes Converter :-- \n";
		menuData += "1. Dollars to Rupess\n";
		menuData += "2. Rupess to Dollars\n";
		menuData += "3. Exit\n";
		menuData += "Enter Your Choice ";
		while(true){
			int choice = Integer.parseInt(JOptionPane.showInputDialog(menuData));
				switch(choice){
					
					case 1 : 
						
						int dollar = Integer.parseInt(JOptionPane.showInputDialog("Enter Number of Dollars(1 Dollar = 80 Rupess)"));
						int result = dollar *80 ;
						JOptionPane.showMessageDialog(null,"Total rupess"+result);
						break;
					case 2 :
						int rup = Integer.parseInt(JOptionPane.showInputDialog("Enter number of ruppess(80 rupess = 1Dollar )"));
						float res = rup/80f; 
						JOptionPane.showMessageDialog(null,"Dollars you have"+res);
						break;
					
				}if(choice == 3) System.exit(0);	
  }
}
