package trycatchfinally;

public class Trycatchfinally {

	public static void main(String[] args) {
		int[] arr =new int[4];
		try
		{
			System.out.println(arr[4]);
			System.out.println("Inside try block");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Exception caught in catch block ");
		}
		finally
		{
			System.out.println("finally block executed");
		}
System.out.println("outside try-catch-finally clause ");
	}

}
