
class Solution14{
	/**
	*��Ŀ������һ���Ѿ��������Ź���������֣�
	*�������в���������ʹ�����ǵĺ��������������֡�
	*Ҫ��ʱ�临�Ӷ��� O(n)O(n)O(n)O(n)��
	*����ж�����ֵĺ͵������룬������һ����
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
