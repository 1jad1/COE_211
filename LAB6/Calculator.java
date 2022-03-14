import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

    // Constructor to initialize the calculator
    public Calculator() {
        // Get user input
        Scanner scanCalc = new Scanner(System.in);

        /**
         * Continue code here to ask for the first number, the operator, and the second number, IN THAT ORDER
         */
System.out.print("Input the first number: ");
int num1 = scanCalc.nextInt();
System.out.print("Input the operator: ");
scanCalc.nextLine();
operator= scanCalc.nextLine();

System.out.print("Input the second number: ");
int num2 = scanCalc.nextInt();
scanCalc.close();

        // Decide on the operation to perform 
        /**
         * Insert code to decide on which function to call, based on the operator the user chose
         * Hint: Switch statement
         */

switch (operator){
	case "+":
		
		System.out.print( add(num1,num2));
		break;
	case "-": 
		System.out.print(substract(num1,num2));
		break;
	case "*":
		System.out.print( multiply(num1,num2));
		break;
	case "/": 
		System.out.print(divide(num1,num2));
		break;
}
}
    
    public String add(int num1,int num2) {
        /**
         * Enter logic
         */
int result= num1+num2;
return num1 + "+" + num2 + "=" +result;
    }



    public String substract(int num1,int num2) {
        /**
         * Enter logic
         */
int result= num1-num2;
return num1 + "-" + num2 + "=" +result;
    
}

    public String multiply(int num1, int num2) {
        /**
         * Enter logic
         */
int result= num1*num2;
return num1 +  "*" + num2 + "=" +result;

    }

    public String divide(int num1, int num2) {
        /**
         * Enter logic
         */
int result= num1/num2;
return num1 +  "/" + num2 + "=" +result;
   
}

}
