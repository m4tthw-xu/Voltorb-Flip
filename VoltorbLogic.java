
// the central method
public class VoltorbLogic {
	
	private static int[][] board;
	private int level;
	private static int currentPoints;
	
	
	public VoltorbLogic() {
		
		level = 1;
		board = new int[5][5];
		currentPoints = 0;
		reset(level);
		
		System.out.println(boardToString());
	}
	
	public void reset(int lvl) {
		for (int i = 0; i < 5; i++) {
			for (int o = 0; o < 5; o++) {
				board[i][o] = randValBasedOnLevel(lvl);
			}
		}
	}
	
	public static boolean checkDone() {
		
		for (int[] arr : board) {
			for (int i : arr) {
				if (i == 2 || i == 3) {
					return false;
				}
			}
		}
		FlipGUI.setMarkButtonText(">");
		return true;
	}
	
	public static void modifyCurrentPoints(int add, int r, int c) {
		
		if (add == 0) {
			currentPoints = 0;
			FlipGUI.setMarkButtonText(">");
		} else if (add != 0 && currentPoints == 0) {
			currentPoints += add;
		} else {
			currentPoints *= add;
		}
		
		FlipGUI.updateCurrentPoints();
		board[r][c] = -1;
		System.out.println(checkDone());
		
		if (checkDone() == true) {
			modifyTotalPoints();
		}
	}
	
	public static void modifyTotalPoints() {
		FlipGUI.setTotalPoints(currentPoints);
		currentPoints = 0;
		FlipGUI.updateCurrentPoints();
	}
	
	// version 1.1 of this algorithm
	private int randValBasedOnLevel(int lvl) {
		
		int num = 0;
		
		double oneBaseChoose = 0.5 - (lvl / 10.0);
		double levelFactor = 0.2 + (lvl / 10.0);

		if (Math.random() > oneBaseChoose) { // the higher the level, the more this is false
			num = 1;
			
			if (Math.random() < levelFactor) { // the higher the level, the more this is true
				num = 2 + ((int) (Math.random() * 2));
			}
		}
		
		return num;
	}
	
	public String getRowVals(int row) {
		int sum = 0;
		int zeroes = 0;
		
		for (int i : board[row]) {
			sum += i;
			
			if (i == 0) {
				zeroes++;
			}
		}
		
		return sum + " : " + zeroes;
	}
	
	public String getColVals(int col) {
		int sum = 0;
		int zeroes = 0;
		
		for (int i = 0; i < 5; i++) {
			sum += board[i][col];
			
			if (board[i][col] == 0) {
				zeroes++;
			}
		}
		
		return sum + " : " + zeroes;
	}
	
	public int getSquareVal(int r, int c) {
		return board[r][c];
	}
	
	public int getCurrentPoints() {
		return currentPoints;
	}
	
	public String boardToString() {
		String str = "";
		int row = 0;
		int col = 0;
		
		for (int[] i : board) {
			for (int o : i) {
				str += o + " ";
			}
			
			str += " " + getRowVals(row);
			str += ", " + getColVals(row);
			
			row++;
			str += "\n";
		}
		
		return str;
	}
	
}
