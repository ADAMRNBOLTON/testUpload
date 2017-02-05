package Task1;

public class convertBoard {

	public static void main(String[] args) {
		char[][] gameBoard = {{'X','O','X'},{'B','B','B'},{'B','B','B'}};
		System.out.println(stringValueBoard(gameBoard));
	}

	public static String stringValueBoard(char[][] board){
		String value = "";
		int row,column;

		for(row = 0; row < board.length; row++){
			for(column = 0; column < board.length; column++){
				if(board[row][column] == 'X'){
					value = value.concat("1");
				} else if (board[row][column] == 'O'){
					value = value.concat("2");
				} else {
					value = value.concat("0");
				}
			}
		}
		return value;
	}
}
