
public class TicTacToePlayer {

	public int getMove(TicTacToe ttt) {
		int move = getRule1Move(ttt);
		if (move != 0)
			return move;

		for (int i = 1; i < 10; i++) {
			if (ttt.canMove(i)) {
				return i;
			}
		}

		return 0;
	}

	int getRule1Move(TicTacToe ttt) {

		if (ttt.get(1) == ttt.get(4) && ttt.get(1) != ttt.OPEN && ttt.get(7) == ttt.OPEN)
			return 7;
		if (ttt.get(2) == ttt.get(5) && ttt.get(2) != ttt.OPEN && ttt.get(8) == ttt.OPEN)
			return 7;
		if (ttt.get(1) == ttt.get(2) && ttt.get(1) != ttt.OPEN && ttt.get(3) == ttt.OPEN)
			return 7;
		return 0;
	}
}
