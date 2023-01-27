package meetTwoPerson;

import java.util.Scanner;

public class YoutubeVideoUpload {
	
	public static int[] youtube(int[] arr, int k) {
		
		for(int i=k;i<arr.length;i++) {
			int currentElment=arr[k];
			int max=arr[k-1];
			int maxPosition=k-1;
			for(int j=k-2;j>=0;j--) {
				if(arr[j]>max) {
					max=arr[j];
					maxPosition=j;
				}
			}
			if(currentElment<max) {
				while(maxPosition<k-1) {
				arr[maxPosition]=arr[maxPosition+1];
				}
				arr[k-1]=currentElment;
			}
		}
		for(int i=0;i<k;i++) {
			System.out.println(arr[i]+" ");
		}
		
		return arr;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {50,25,100,200,30};
		youtube(arr, 2);
	}

}
