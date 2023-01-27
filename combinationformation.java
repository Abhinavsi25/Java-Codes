package meetTwoPerson;

public class combinationformation {
	
	public static void  printD(String number,String output) {
		if(number.length()==0) {
			System.out.println(output);
			return;
		}
		String firstc=number.substring(0,1);
		int first=Integer.parseInt(firstc);
		if(first!=0) {
		char ch=(char)('a'+first-1);
		printD(number.substring(1),output+ch);
		}
		if(number.length()<=1) {
			return;
			
		}
		int firstTwo=Integer.parseInt(number.substring(0,2));
		
		
		if(firstTwo<=26) {
			if(firstTwo<=0) {
				printD(number.substring(2),output="");
				return;
			}
		char ch=(char)('a'+firstTwo-1);
		printD(number.substring(2),output+ch);
		}
		
		
	}

	public static void main(String[] args) {
		printD("200","");
	}
}
