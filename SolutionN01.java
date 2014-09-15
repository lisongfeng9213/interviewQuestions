
import java.util.Arrays;

public class SolutionN01 {

	/*
	 * 一个整数数列，元素取值可能是 0~65535 中的任意一个数，相同数值不会重复出现。0 是例外，可以反复出现。
	 * 请设计一个算法，当你从该数列中随意选取5个数值，判断这5个数值是否连续相邻。 注意： - 5 个数值允许是乱序的。比如：8 7 5 0 6 - 0
	 * 可以通配任意数值。比如：8 7 5 0 6 中的 0 可以通配成 9 或者 4 - 0 可以多次出现。 - 复杂度如果是 O(n2)则不得分
	 */

	public static void main(String[] args) {
		int []a = {0,1,2,5};
		System.out.println(solution(a));

	}

	public static int solution(int[] a) {

		Arrays.sort(a);
		int numZero = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				numZero++;
			}
		}

		int len = a[a.length - 1] - a[numZero] - 1;
		int len2 = a.length - numZero - 2;

		if (len == numZero + len2) {
			return 1;
		} else {
			return 0;
		}

	}

}
