package meetTwoPerson;

public class TrapingRainwater {
	
	public static int water(int [] arr) {
		int units=0;
		int [] left= new int[arr.length];
		int [] right= new int[arr.length];
		int n=arr.length;
		left[0]=arr[0];
		for(int i=1;i<left.length;i++) {
			left[i]=Math.max(left[i-1],arr[i]);
			
		}
		right[arr.length-1]=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--){
			right[i]=Math.max(right[i+1],arr[i]);
			
		}
		for(int i=0;i<arr.length;i++) {
			units=units+(Math.min(left[i],right[i])-arr[i]);
		}
		return units;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,0,5,3,2,1,4};
		System.out.println(water(a));
	}

}
