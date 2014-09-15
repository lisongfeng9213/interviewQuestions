import java.util.Arrays;


public class SolutionN02 {

	/**
	 * 一个整数数列，元素取值可能是 1~N （N 是一个较大的正整数）中的任意一个数，相同数值不会重复出现。
设计一个算法，找出数列中符合条件的数对的个数，满足数对中两数的和等于 N+1。
复杂度最好是 O(n)，如果是 O(n2)则不得分
	 * Another methods:
	 * 可以把他们按照n/2 进行划分。小于的存于一个集合，大于的存于另一个集合。这样的话就可以进行判断
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,3,4,7,8,9,10}; 
		int n = 11;
		System.out.println(solutionN02(a,n));
	}
	
	public static int solutionN02(int []a,int sum){
		Arrays.sort(a);
		int[]b = new int[a.length];		
		for(int i = 0;i< a.length;i++){
			b[i] = sum - a[i];
		}
		
		int num = 0;
		
		int begin = 0,end = a.length - 1;
		
		while(begin < end){
			if(a[begin] == b[end]){
				num ++;
				begin++;
				end--;
				}
			else if(a[begin] > b[end]){
				end--;
			}else{
				begin++;
			}
		}
		return num;
	}

}
