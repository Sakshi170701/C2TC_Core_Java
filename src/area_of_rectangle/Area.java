package area_of_rectangle;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter a length of rectangle");
		Integer a = Obj.nextInt();
		System.out.println("Enter a breath of rectangle");
		Integer b = Obj.nextInt();
		int c;
		c=a * b;
		System.out.println("Area of rectangle is : " +c);
		
		
//		int a = 2;
//		int b= 3;
//		int c;
//		c= a* b;
//		System.out.println("Area of rectangle is : " +c);

	}

}


