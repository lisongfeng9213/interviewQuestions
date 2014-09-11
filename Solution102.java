public class Solution102 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(toInt("-4324"));

	}

	public static int toInt(String str) {

		int len = 0;
		int tag = 1;
		int i = 0;
		int n = 0;
		if (str.charAt(0) == '-') {
			tag = -1;
			i = 1;
		}
		for (; i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9'; n = n
				* 10 + str.charAt(i++) - '0') {
		}
		if (i != str.length()) {
			return 0;
		} else {
			return n * tag;
		}
	}

}
