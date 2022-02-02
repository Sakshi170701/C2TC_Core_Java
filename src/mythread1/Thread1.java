package mythread1;
class Mythread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++) {
			System.out.println("child Tread");
		}
	}
}
public class Thread1 {

	public static void main(String[] args) {
		Mythread m=new Mythread();
		m.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main Thread");
		}
	}

}