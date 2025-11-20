// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
		// Tests some of the operations
		System.out.println(plus(2, 3)); // 2 + 3
		System.out.println(minus(7, 2)); // 7 - 2
		System.out.println(minus(2, 7)); // 2 - 7
		System.out.println(times(3, 4)); // 3 * 4
		System.out.println(plus(2, times(4, 2))); // 2 + 4 * 2
		System.out.println(pow(5, 3)); // 5^3
		System.out.println(pow(3, 5)); // 3^5
		System.out.println(div(12, 3)); // 12 / 3
		System.out.println(div(5, 5)); // 5 / 5
		System.out.println(div(25, 7)); // 25 / 7
		System.out.println(mod(25, 7)); // 25 % 7
		System.out.println(mod(120, 6)); // 120 % 6
		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
		System.out.println(sqrt(76123));
	}

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		// Replace the following statement with your code
		int n = x1;
		if (x2 > 0) {
			for (int stepes = 0; stepes < x2; stepes++) {
				n++;
			}
		} else if (x2 < 0) {
			for (int stepes = 0; stepes > x2; stepes--) {
				n--;
			}
		}
		return n;
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		// Replace the following statement with your code
		int n = x1;
		if (x2 > 0) {
			for (int stepes = 0; stepes < x2; stepes++) {
				n--;
			}
		} else if (x2 < 0) {
			for (int stepes = 0; stepes > x2; stepes--) {
				n++;
			}
		}
		return n;
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		// Replace the following statement with your code
		int g = 0;
		if (x2 > 0) {
			for (int stepes = 0; stepes < x2; stepes++) {
				g = plus(g, x1);
			}
		} else if (x2 < 0) {
			for (int stepes = 0; stepes > x2; stepes--) {
				g = minus(g, x1);
			}
		}
		return g;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		// Replace the following statement with your code
		if (n == 0) {
			return 1;
		}
		int g = 1;
		for (int y = 1; y < n; y++) {
			g = times(g, x);
		}

		return g;
	}

	// Returns the integer part of x1 / x2
	public static int div(int x1, int x2) {
		// Replace the following statement with your code
		int absx1 = x1;
		int absx2 = x2;
		if ( x1 < 0 ) {
			absx1 = minus(0, x1);
		}
		if (x2 <0 ) {
			absx2 = minus(0, x2);

		}

		int res = 0;
		int absSum = 0;
		while (plus(absSum, absx2) <= absx1) {
			absSum = plus(absSum, absx2);
			res++;
		}
		if ((x1 < 0 && x2 > 0) || (x1 > 0 && x2 < 0)) {
			return minus(0, res);
		}
		return res;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		// Replace the following statement with your code
		int Quotient = div(x1, x2);
		int Multiply = times(Quotient, x2);
		int Remainder = minus(x1, Multiply);
		return Remainder;
	}

	// Returns the integer part of sqrt(x)
	public static int sqrt(int x) {
		// Replace the following statement with your code
		if ( x < 0){
			return 0 ;
		}
		int count = 0;
		while (times(count, count)<= x) {
			count++;
			
		}
		return minus(count,1);
	}
}