package euler.prblem1;

public class Problem1 {

	public static void main(String[] args) {

		long target = 999;
		System.err.println(devidedBy(3, target) + devidedBy(5, target)
				- devidedBy(15, target));

	}

	public static long devidedBy(int n, long target) {
		long p = target / n;
		return (long) (n * (p*p + p))/2;
	}

}
