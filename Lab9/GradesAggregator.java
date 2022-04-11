import java.util.*;
public class GradesAggregator{
	public static void main(String[]args){
	Scanner scan=new Scanner(System.in);
	int [] a=new int[5];
	int b,c,count=0;
	for(int i=1;i<6;i++){
	System.out.print("Input the grade of assignment  " + i + ":");
	a[i-1]=scan.nextInt();
	}
	System.out.print("Input the number of attended labs:");
	b=scan.nextInt();
	System.out.print("Input the midterm grade:");
	c=scan.nextInt();
	for(int i=0;i<5;i++){
	count+=a[i];
	}
	System.out.println("Assignments (30%): " + ((count/5)*0.3));
	System.out.println("Attendance (5%): " + ((b*100*0.05)/7));
	System.out.println("Midterm (30%): " + (c*0.3));	





	}
}