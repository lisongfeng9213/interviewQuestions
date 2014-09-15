public class FindLongChar {

	/**
	 * 由26 个小写字母组成的字符串str，在str 中查找最长不含相同字符的连续子串。如 abcacfrar，为acfr
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(fingLong("lisongfenl"));

	}

	public  static String fingLong(String str) {
		int[] tag = new int[26];
		int len = str.length();
		int beginOld = 0;
		int endOld = 0;
		int charLenOld = 0;
		for (int i = 0; i < len; i++) {
			int beginNew = i;
			int endNew;
			int charLennew = 0;
			for (int j = i; j < len; j++) {
				endNew = j;
				int tagNum = tag[(str.charAt(j) - '0') - 49];
				if (tagNum == 0) {
					tag[(str.charAt(j) - '0') - 49] = j;
					charLennew++;
				}else{					
					i = tagNum + 1;
					if(charLennew > charLenOld){
						beginOld=beginNew;
						endOld = endNew;
						charLenOld = charLennew;
					}
					
					for(int s = 0;s<26;s++){
						tag[s] = 0; 
					}
					break;
				}
			}
		}
		return str.substring(beginOld, endOld);
	}

}
