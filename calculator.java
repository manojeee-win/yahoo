package calculation;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		
		Scanner scaninput = new Scanner(System.in);
		                                                                   System.out.println("for addition enter 1  ");
		                                                                   System.out.println("for subtraction enter 2 ");
		                                                                   System.out.println("for multiplication enter 3 ");
		int number1,number2,number3,i;
		i=scaninput.nextInt();
		System.out.println("the number you have entered is "+i);
		                                                                  System.out.println("enter the first number one");
		number1=scaninput.nextInt();
		                                                                  System.out.println("enter the second number two ");
		number2=scaninput.nextInt();
		if (i==1) {
			                                                              System.out.println(number3=number1+number2);

			
		}
		else if (i==2) {
			                                                              System.out.println(number3=number1-number2);
		}
		else if (i==3) {
			                                                              System.out.println(number3=number1*number2);
		}
	}
		
	
};
	
hi dude division

