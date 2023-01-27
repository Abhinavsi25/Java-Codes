package meetTwoPerson;

import java.util.Scanner;

public class meetTwoperson {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p1=sc.nextInt();
		int p2=sc.nextInt();
		int d1=sc.nextInt();
		int d2=sc.nextInt();
		int dist=d1-d2;
		int person=p1-p2;
		if(dist%person==0) {
			System.out.println("They Meet");
		}
		else {
			System.out.println("They never Meet");
		}
	}

}
