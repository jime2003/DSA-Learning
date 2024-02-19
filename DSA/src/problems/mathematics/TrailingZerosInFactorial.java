package problems.mathematics;

public class TrailingZerosInFactorial {
	/* This is naive approach.
	 * First find the factorial of given number.
	 * iterate through the number until there is no trailing zeros and count the trailing zeros
	 * */
	
	static int countTrailingZerosInFact(int n) {
		int result = 1;
		for(int i=2;i<=n;i++) {
			result = result*i;
			
		}
		int lz=0;
		while(result%10==0) {
			lz++;
			result = result/10;
		}
		
		
		
		return lz;
		
	}

	public static void main(String[] args) {
		System.out.println(countTrailingZerosInFact(10));
		//countTrailingZerosInFact(5);

	}

}
