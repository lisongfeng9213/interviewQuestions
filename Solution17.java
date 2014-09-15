
class Solution17{
	public static void main(String[]args){
		System.out.println(findFirstChar("abaccdeff".toCharArray()));
	}
	public static char findFirstChar(char[] charArr){
		int []count = new int[26];
		for(int i = 0;i < charArr.length;i++){
			count[charArr[i] - '0' - 49] += 1; 
		}
		for(int i = 0;i < charArr.length;i++){
			if(count[charArr[i] - '0' - 49] == 1){
				return charArr[i];
			}
		}
		return '_';
	}
}