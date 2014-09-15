
public class Solution109 {

	/**
	 * 实现两个正整数的除法，不能用除法操作符
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(div(91,6));
	}
	
	public static int div(int x,int y){
		
		int res = x%y;
		x = x-res;
		System.out.println("yushu："+res);
		int interRight = x;
		
		while(y*interRight > x){
			interRight = interRight >> 1;
		}
		int interLegt = interRight<<1;
		for(int i = interRight;i <= interLegt;i++){
			if(i * y == x){
				return i;
			}
		}
		
		return 0;
	}
 
}
