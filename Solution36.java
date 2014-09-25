import java.util.Vector;


public class Solution36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int[] rank(int[][] matrix,Integer[] order){
		Vector<Integer> rank = new Vector<Integer>();
		
		Vector<Integer> winer = new Vector<Integer>();
		Vector<Integer> loser = new Vector<Integer>();
		while(order.length != 1){
			for(int i = 0;i < order.length;i += 2){
				if(i + 1 == order.length){
					winer.add(order[i]);
				}else {
					if(matrix[order[i]][order[i+1]] ==i){
						winer.add(order[i]);
					}else {
						loser.add(order[i+1]);
						rank.add(order[i+1]);
					}
				}
			}
			order = (Integer[])winer.toArray();
			winer.clear();
		}
		
		return null;
	}

}
