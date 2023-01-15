import java.util.Scanner;

// 8. Write a program to swap the two numbers.




public class Question8 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		System.out.println("Enter Two Numbers that you want to Swap");
		
		Scanner sd = new Scanner(System.in);
		
		int a = sd.nextInt();
		int b = sd.nextInt();
		System.out.println("your First Number :" + a);
		
		System.out.println("Your Second Number :" + b);
		
		System.out.println("Result after Swapping");
		
		int temp;
		
		temp = a;
		a=b;
		b=temp;
		
		
		System.out.println("First Swap with Second :" + a);
		System.out.println("Second Swap with First :" + b);
				
		
		
	}

}
