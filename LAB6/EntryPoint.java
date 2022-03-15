/* For the first bonus exercise i think the code worked but not when i put 
number 3 as an operator (maybe it is not the correct code) and as for the 
second bonus exercise i was a bit lost on what to use ("if" or another "while"
or "do while" if it works/ if i use "if" i didn't know how to re=execute the code) */
import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {
        /**
         * Enjoy <3
         */
	Scanner scan=new Scanner(System.in);
	int option;
	
	String Exit;
	do{

	System.out.println("Which service would you like to use?" 
				+ "\n" + "[1]: Basic week visualizer" 
				+ "\n" + "[2]: Advanced week visualizer"
				+ "\n" + "[3]: Basic calculator"
				+ "\n" + "[4]: Employee repertoire");
	
	option=scan.nextInt();



switch (option){
	case 1:
		BasicWeek bas=new BasicWeek();
		bas.printDays();
		break;
	case 2:
		AdvancedWeek ada=new AdvancedWeek();
		ada.printDays();
		break;
	case 3:
		Calculator adv=new Calculator();
		break;
	case 4:
		Employee emp= new Employee();
		System.out.print(emp.toString());
		break;
	}
	
	

System.out.print("Would you like to perform another operation? (y/n)");
scan.nextLine();
Exit=scan.nextLine();


} while(Exit.charAt(0) != 'n');






	}
}