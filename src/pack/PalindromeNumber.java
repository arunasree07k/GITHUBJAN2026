package pack;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println("write the code.....");
		int num=12321;
		int temp=num;
		int p=0;
		while(num!=0) {
			int rev=num%10;
		    p=(p*10)+rev;
		    num/=10;
		}
		if(temp==p)
		System.out.println("Number  Palindrome");
		else
		System.out.println("Number is Not a Palindrome");
	}

}
