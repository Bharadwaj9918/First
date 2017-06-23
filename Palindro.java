import java.util.*;
public class Palindro {
	public static void main(String[] args) {
		int i;
		System.out.println("enter the value of i");
		Scanner input=new Scanner(System.in);
		i=input.nextInt();
		Palindro p  =new Palindro();
		boolean value=p.palindrome(i);
		System.out.println(value);

	}
	public boolean palindrome(int num)
	{
		int i=num,t,rem,rev=0;
		System.out.println();
		while(i>0 )
		{
		t=i/10;
		rem=i%10;
		rev=rev*10+rem;
		i=t;
		}
		
		if(num==rev) return true;
		
		return false;
}
}