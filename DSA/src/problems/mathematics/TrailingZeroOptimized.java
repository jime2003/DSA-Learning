package problems.mathematics;

public class TrailingZeroOptimized {
	/* in factorial number, number of 5's represents the number of trailing zeros
	 * but consider situation where 25 has two five's so there is a series 25,125,625....
	 * 
	 * 
	 * */
	
	static int trailingZerosOpt(int n) {
		int powOfFive = 5;
		int res = 0;
		while(n>=powOfFive) {
			res = res + (n/powOfFive);
			powOfFive*=5;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(trailingZerosOpt(200));

	}

}
