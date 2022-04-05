import java.io.*;  // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class Finances{
  public static void main(String[] args) throws IOException{
	Scanner scan= new Scanner(System.in);
	String name,purchase;
	Double pay;
	String Exit;
	FileWriter fw = new FileWriter(new File("expenses.txt"));
	BufferedWriter bw = new BufferedWriter(fw);
	PrintWriter outToFile = new PrintWriter(bw);
	do{
	System.out.print("Input your name: ");
	name=scan.nextLine();
	System.out.print("What did you purchase? :");
	purchase=scan.nextLine();
	System.out.print("How much did you pay? (in USD):");
	pay=scan.nextDouble();
	outToFile.println(name + " " + "purchased" + " " + purchase + " " + "for" + " " + pay + "US Dollars.");
	System.out.print("Would you like to log another purchase? (y/n): ");
	scan.nextLine();
	Exit=scan.nextLine();
	
	} while(Exit.equals("y"));
	outToFile.close();
      // Create FileWriter & Scanner objects & y/n string

      // Start gathering information inside the loop you will start

      // Close ClassWriter & Scanner objects
        
        
      // If you have already have a expenses.txt file, you need to delete it
      // before you compile your code again
  }
}