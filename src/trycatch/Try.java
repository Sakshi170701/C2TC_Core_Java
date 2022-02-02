package trycatch;

public class Try {

	
		public static void main(String[] args) {
			System.out.println("hi");
	try
	{
		System.out.println(10/0);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
		}

	}
	


