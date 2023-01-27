package meetTwoPerson;

public class Nqueen {
	
	public static boolean placeQueens(int [][] board,int row) {
		
		if(row==board.length) {
			printBoard(board);
			return true;
		}
		for(int i=0;i<board.length;i++) {
				
			if(isSafe(board,row,i)) {
				board[row][i]=1;
				boolean canPlace=placeQueens(board, row+1);
				if(canPlace) {
					return true;
				}
				board[row][i]=0;
			}
		}
		return false;
	}
	private static void printBoard(int[][] board) {
		// TODO Auto-generated method stub
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				System.out.println(board[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static boolean isSafe(int[][] board,int current,int currentCell) {
		for(int i=0;i<current;i++) {
			if(board[i][currentCell]==1) {
				return false;
			}
		}
		
		int x=current;
		int y=currentCell;
		while(x>=0&&y>=0) {
			if(board[x][y]==1) {
				return false;
			}
			x--;
			y--;
		}
		x=current;
		y=currentCell;
		while(x>=0&&y<board.length) {
			if(board[x][y]==1) {
				return false;
			}
			x--;
			y--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		int[][] board=new int[8][8];
		placeQueens(board,0);

	}

}
