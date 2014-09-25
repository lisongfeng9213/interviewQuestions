
public class Solution47 {

	/**
	 * @param args\
	 * silu:新建一个数组b，b【i】为i+1 ->n之间比b【i】小的数连续个数
	 * b【n-1】 = 1，然后比较。
	 */
	
	static int[] arr = {9 ,8 ,2 ,1 ,7 ,5 ,3 ,4 ,3 ,2 ,1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longDec(arr));
	}
	public static int longDec(int []arr){
		
		int n = arr.length;
		int[]b = new int[n];
		b[n - 1] = 1;
		for(int i = n -2;i >= 0; i--){
			int max = 0;
			for(int j = n - 1;j > i;j--){
				if(arr[i] > arr[j]){					
					if(b[j] > max){
						max = b[j];
					}
				}	
			}
			b[i] = max + 1;
		}		
		
		for(int i:b){
			System.out.print(i+"_");
		}
		System.out.println();
		return b[0];
		
	}

}
