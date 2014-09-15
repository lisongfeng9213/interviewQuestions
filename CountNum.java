
public class CountNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int countNums(int []a,int value){
		
		
		int n = 0;
		for(int i = 0;i<a.length;i++){
			if(a[i] ==value){
				n++;
			}
		}
		return n;
		
	}

}
