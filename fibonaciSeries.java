import java.util.Scanner;

public class fibonaciSeries
{
	public static void main(String args[])
	{
		int n1=0,n2=1,n3;
		System.out.println("Enter he Number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println(+n1);
		System.out.println(+n2);
		for(int i =2;i<10;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(+n3);

		}
	}
}
