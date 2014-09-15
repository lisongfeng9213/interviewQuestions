
class Solution14{
	/**
	*题目：输入一个已经按升序排过的数组和字，
	*在数组中查找两个，使得它们的和正好是输入那字。
	*要求时间复杂度是 O(n)O(n)O(n)O(n)。
	*如果有多对数字的和等于输入，出任意一即可
	*
	*/
	public static void main(String []args){
		int []a = {1,2,3,4,5,6,7,8,9};
		findSumNum(a,4);
	}
	public static void findSumNum(int []arr,int num){
		int len = arr.length;
		int[]brr = new int[len];

		for(int i = 0;i < len;i++){
			brr[i] = num - arr[i];			
		}

		int begin = 0;
		int end = len - 1;

		while(begin < end){
			if(arr[begin] == brr[end]){
				System.out.println(arr[begin]+"__+__"+arr[end]+"="+num);
				break;
			}else if(arr[begin] > brr[end]){
				end--;
			}else{
				begin++;
			}
		}
	}
}
