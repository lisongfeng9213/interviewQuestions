import java.util.Vector;


public class Solution21 {

	/**
	 * @param args
	 * 思路：用递归思想。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vector = new Vector<Integer>();
		sumM(10, 10, vector);
	}
	
	public static void sumM(int n,int m,Vector<Integer> vector){
		if( m == 0 && n >= 0){
			for(int i:vector){
				System.out.print("_"+i+"_");
			}
			System.out.println();
			return;
		}
		if(n <= 0){
			return;
		}
		

		sumM(n - 1, m, vector);
		vector.add(n);
		sumM(n - 1, m - n, vector);
		vector.removeElement(n);		
	}

}
