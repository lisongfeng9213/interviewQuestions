
public class Solution30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String string = "111111";
		int len = string.length();
		
		System.out.println("sum1Ofsom9:"+sum1Ofsom9(2));
		int sumOfOne = 0;
		for(int i = len - 1;i > 0;i--){
			sumOfOne = sumOfOne + (string.charAt(i) - '0') * sum1Ofsom9(i);
			if(string.charAt(i) - '0' >=1){				
				sumOfOne += lastN(i, string);
			}
		}
		
		if(string.charAt(0) - '0' >= 1){
			sumOfOne += 1;
		}
		System.out.println("sumOfOne:"+sumOfOne);

	}
	
	public static int sum1(){
		
		return 0;
		
	}
	
	public static int sum1Ofsom9(int n){//计算：当n=1，计算0-9，n=2，计算0-99，n=3，计算0-999中1个数
		if(n == 1){
			return 1;
		}else{
			return (sum1Ofsom9(n-1)*10 + (int)Math.pow(10,n - 1));
		}
	}
	public static int lastN(int n,String str){//计算倒数n位长度
		int sum = 0;
		int len = str.length();
		for(int i = len - 1;i > len - 1 - n;i--){
			if(i == len - 1){
			sum += (str.charAt(i) - '0');
			}else{
			sum += (str.charAt(i) - '0') * (int)Math.pow(10, len -1 - i);
			}
		}
		return sum + 1;
	}

}
