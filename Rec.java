
public class Rec {

	/**
	 * = number of the digits in the decimal representation of n. e.g.
	 * numDigits(0) = 1, numDigits(3) = 1, numDigits(34) = 2. numDigits(1356) =
	 * 4. Precondition: n >= 0.
	 */
	public static int numDigits(int n) {

	}

	/**
	 * = sum of the digits in the decimal representation of n. e.g. sumDigits(0)
	 * = 0, sumDigits(3) = 3, sumDigits(34) = 7, sumDigits(345) = 12.
	 * Precondition: n >= 0.
	 */
	public static int sumDigits(int n) {
		int sum = 0;

		if (n == 0) {
			return sum;
		} else {
			sum = n % 10 + sumDigits(n / 10);
			return sum;

		}	}


	/** = a copy of s with to_remove_char removed.
		Example: removeChar("abeabe", 'e') = "abab". */
	public static String removeChar(String s , char to_remove_char) {
		String newString = "";
		newString = s.substring( 0, s.indexOf(to_remove_char) ) + "" + 
				s.substring( s.indexOf( to_remove_char ) +1 );
		if( newString.indexOf( to_remove_char ) != -1 ) {
			newString = removeChar( newString , to_remove_char );
		}
		return newString;
	}


	/** = a copy of s with characters in reverse order.
		Example: reverse("abcdefg") = "gfedcba". */
	public static String reverse(String s) {

		if ((s == null) || (s.length() <= 1)) {
			return s;
		}
		return reverse(s.substring(1)) + s.charAt(0);

	}

	public static void main(String[] args) {
		System.out.println(numDigits(123));
		System.out.println(numDigits(123456));
		System.out.println(numDigits(1));
		System.out.println(numDigits(0));
		System.out.println("-----------------");
		System.out.println(sumDigits(123));
		System.out.println(sumDigits(123456));
		System.out.println(sumDigits(1));
		System.out.println(sumDigits(0));
		System.out.println("-----------------");
		System.out.println(removeChar("eawabbcceccddeeaaeeeee", 'e'));
		System.out.println(removeChar("acacacacac", 'a'));
		System.out.println("-----------------");
		System.out.println(reverse("aaabbbaccabda"));
		System.out.println(reverse("abbcccdeaaa"));
		System.out.println(reverse("AMANAPLANACANALPANAMA"));
	}

}
