package meetTwoPerson;

public class minimumNoOfPlatform {

	public static int minPlatforms(int [] arr,int dep[]){
		
		int result=1;
		int arrival=1;
		int departure=0;
		int platform=1;
		while(arrival<arr.length&&departure<dep.length) {
			int currentArival=arr[arrival];
			int currentdeparture=dep[departure];
			
			if(currentArival<=currentdeparture) {
				platform++;
				arrival++;
			}
			else {
				platform--;
				departure++;
			}
			
			if(platform>result) {
				result=platform;
			}
		}
		
		return result;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {900,915,1100};
		int dep[]= {1000,1105,1200};
		System.out.println(minPlatforms(arr, dep));
	}

}
