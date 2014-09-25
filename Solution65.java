public class Solution65 {

	/**
	 * 题目：输入数字n，按顺序输出从1最大的n位10进制数。比如输入3，则输出1、2、3一直到最大的3位数即999。
	 * 思路：http://zhedahht.blog.163.com/blog/static/2541117420094279426862/
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printIncreasementNumber3(4);
	}

	public static void printIncreasementNumber1(int n) {
		if (n <= 0)
			return;
		int num = 1;
		for (int i = 0; i < n; i++) {
			num *= 10;
		}
		System.out.println("SOLUTION:1");
		for (int i = 0; i < num; i++) {
			System.out.println(i);
		}
	}

	public static void printIncreasementNumber2(int n) {

		int[] number = new int[n];
//		splitPrint(number);
		System.out.print("________\n");
		while (increase(number)) {
			splitPrint(number);
		}
		Print(number);
		splitPrint(number);


	}
	private static void Print(int[] number) {
		number[1] = 1;
		number[2] = 3;
	}

	private static void splitPrint(int[] number) {
		int i = 0;
		while (number[i] == 0) {
			i++;
			if(i == number.length){
				System.out.println(0);
				return;
			}
		}
		for (; i < number.length; i++) {

			System.out.print(number[i]);
		}
		System.out.println();

	}

	private static boolean increase(int[] number) {
		/**
		 * 每次增加一位，当最高位为9，且下一位进一时，则表示溢出返回FALSE，循环终止
		 * 
		 */
		boolean tag = true;
		int incre = 0;
		for (int i = number.length - 1; i >= 0; i--) {
			int arrAtI = number[i];
			if (i == number.length - 1) {
				arrAtI++;
				number[i] = arrAtI %10;
				if (arrAtI % 10 == 0) {
					incre = 1;					
				}else {
					incre = 0;
				}
				//每次要记得更改incre和此位和下一位进的之和
			} else {
				if(arrAtI + incre == 0){				
					return true;
				}
				arrAtI += incre;
				number[i] = arrAtI % 10;
				incre = 0;
				if (arrAtI % 10 == 0) {
					incre = 1;
				}
				if (i == 0 && incre == 1) {
					tag = false;
				}
			}
		}
		return tag;
	}
	
	public static void printIncreasementNumber3(int n){
		/**
		 * 方法三用递归的思想
		 */
		int []num = new int[n];
		Print1ToMaxOfNDigitsRecursively(num,0);		
		
	}
	public static void Print1ToMaxOfNDigitsRecursively(int[]num,int len){
		if(len == num.length - 1){
			for(int i = 0;i<= 9;i++){
				num[len] = i;
				splitPrint(num);
			}			
		}else {
			for(int i = 0;i<= 9;i++){
				num[len] = i;
				Print1ToMaxOfNDigitsRecursively(num, len + 1);
			}
		}
	}
	
}
