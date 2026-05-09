package pack;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		System.out.println("write the code.....");
		
		int n = 121;
		int temp = n;
		int reverse = 0;

		while(n != 0) {
			int rem = n % 10;
			reverse = reverse * 10 + rem;
			n = n / 10;
		}

		if(temp == reverse) {
			System.out.println(temp + " is a palindrome number");
		}
		else {
			System.out.println(temp + " is not a palindrome number");
		}
	}
}
