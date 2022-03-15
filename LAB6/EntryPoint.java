import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {
        /**
         * Enjoy <3
         */
	Scanner scan=new Scanner(System.in);
	int option;
	String y,n;

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

	


    }
}