public class Solution28 {

	/**
	 *题目：输入一个整数，求该整数的二进制表达中有多少个 1。
         *例如输入 10，由于其二进制表示为 1010，有两个 1，因此输出
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberOfInt(3));
	}

	public static int numberOfInt(int n) {
		int num = 0;
		while (n != 0){
			if(n%2 == 1){
				num++;
			}
			n = n/2;			
			
		}
		return num;

	}

}
