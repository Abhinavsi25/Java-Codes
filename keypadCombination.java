package meetTwoPerson;

public class keypadCombination {

	public static boolean isExist(int [][] matrix,int k) {
		int i=0;
		int j=matrix[0].length-1;
		
		while(i<matrix.length&&j>=0) {
		int current=matrix[i][j];
		if(current==k) {
			return true;
		}
		if(current>k) {
			j--;
		}
		else {
			j++;
		}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		boolean ans=isExist(arr,2);
		System.out.println(ans);
		ans=isExist(arr,-1);
		System.out.println(ans);
	}

}
