package meetTwoPerson;

public class searchInSortedMatrix {
	
	public static boolean isExist(int[][] arr,int k) {
		
		int i=0;
		int j=arr[0].length-1;
		
		while(i<arr.length&&j>=0) {
			int current=arr[i][j];
			
			if(current==k) {
				return true;
			}
			if(current>k) {
				j--;
			}
			else {
				i++;
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		boolean ans=isExist(arr,10);
		System.out.println(ans);
	}

}
