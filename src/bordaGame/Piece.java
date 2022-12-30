package bordaGame;

public abstract class Piece {
	
	protected posicao position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position=null;
	}

	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(posicao position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereanyPossibleMove() {
		boolean[][] mat = possibleMoves();
			for (int i=0; i<mat.length; i++) {
				for (int j=0; j<mat.length; j++) {
					if(mat[i][j]) {
						return true;
					}
				}
			}
		return false;
	}
	
	
}
