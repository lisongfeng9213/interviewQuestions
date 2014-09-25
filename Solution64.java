public class Solution64 {

	/**
	 * 64. 寻找丑数（运算）。 题目：我们把只包含因子 2、3 和 5 的数称作丑数（Ugly Number）。例如 6、8 都是丑数， 但 14
	 * 不是，因为它包含因子 7。习惯上我们把 1 当做是第一个丑数。 求按从小到大的顺序的第 1500 个丑数。
	 * 分析：这是一道在网络上广为流传的面试题，据说 google 曾经采用过这道题。
	 * 
	 * 只可能从已经运算出来的进行乘积，得到的算出刚大于已知最大的哪一个。
	 * 运算的过程中还存储了乘积的开始节点，这样就不用从第一位开始比较了。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = uglyNum(1300);
		for(int i:a){
			System.out.println(i);
		}
	}

	public static int[] uglyNum(int num) {
		int[] arr = new int[num];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 5;

		int begin2 = 0;//存储乘积开始
		int begin3 = 0;
		int begin5 = 0;

		int end = 3;

		int num2 = 0;//存储乘之后的数
		int num3 = 0;
		int num5 = 0;
		while (arr[end] * 2 <= num) {
			for (int i = begin2; i < num; i++) {
				if (arr[i] * 2 > arr[end]) {
					begin2 = i;
					num2 = arr[i] * 2;
					break;
				}
			}

			for (int i = begin3; i < num; i++) {
				if (arr[i] * 3 > arr[end]) {
					begin3 = i;
					num3 = arr[i] * 3;
					break;
				}
			}

			for (int i = begin5; i < num; i++) {
				if (arr[i] * 5 > arr[end]) {
					begin5 = i;
					num5 = arr[i] * 5;
					break;
				}
			}
			int min = Math.min(Math.min(num2, num3), num5);
			if(num2 == min){
				begin2++;
				end++;
				arr[end] = num2;
			}else if(num3 == min){
				begin3++;
				end++;
				arr[end] = num3;
			}else if(num5 == min){
				begin5++;
				end++;
				arr[end] = num5;
			}
			
		}

		return arr;
	}

}
