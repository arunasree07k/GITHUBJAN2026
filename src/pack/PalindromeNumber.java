package pack;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=535,temp=num,rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev) {
			System.out.println(num+"is a palindrome number");

		}
		else {
			System.out.println(num+"is not a palindrome");
		}
	}

}
