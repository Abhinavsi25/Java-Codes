package meetTwoPerson;

public class generateParenthesis {
	
	public static void helper(int left,int right,String output) {
		if(left>right) return;
		if(left==0&&right==0) {
			System.out.println(output);
			return;
		}
		
		if(left>0) {
			helper(left-1,right,output+"(");
		}
		if(right>0) {
			helper(left,right-1,output+")");
		}
	}
	public static void generatePara(int num) {
		helper(num,num,"");
		
	}
	public static void main(String[] args) {
		generatePara(2);
	}

}
