public class Solution65 {

	/**
	 * ��Ŀ����������n����˳�������1����nλ10����������������3�������1��2��3һֱ������3λ����999��
	 * ˼·��http://zhedahht.blog.163.com/blog/static/2541117420094279426862/
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
		 * ÿ������һλ�������λΪ9������һλ��һʱ�����ʾ�������FALSE��ѭ����ֹ
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
				//ÿ��Ҫ�ǵø���incre�ʹ�λ����һλ����֮��
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
		 * �������õݹ��˼��
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
