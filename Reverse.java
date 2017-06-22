public class Reverse {
	public static void main(String[] args) {
		int n=6789, t, rev=0, rem;
		while(n>0){
			t=n/10;
			rem=n%10;
			rev=rev*10+rem;
			n=t;
		}
		System.out.println(""+rev);
	}
}

