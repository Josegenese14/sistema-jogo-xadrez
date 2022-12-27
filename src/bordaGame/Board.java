package bordaGame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		if(rows < 1 || columns < 1) {
			throw new BoardException("Erro na criação do tabuleiro: é necessário que haja pelo menos 1 linha e 1 coluna!");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece [rows][columns];
		
	}

	public int getRows() {
		return rows;
	}


	public int getColumns() {
		return columns;
	}

	
	public Piece piece (int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Posição fora do tabuleiro");
		}
		return pieces [row][column];
	}
	
	public Piece piece (posicao position) {
		if (!positionExists(position)) {
			throw new BoardException("Posição fora do tabuleiro");
		}
		return pieces [position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, posicao position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("Já existe uma peça na posição" + position);
		}
		pieces[position.getRow()][position.getColumn()]=piece;
		piece.position=position;
	}
	
	public boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	public boolean positionExists(posicao position) {
		return positionExists (position.getRow(),position.getColumn());
	}
	
	public boolean thereIsAPiece(posicao position) {
		if (!positionExists(position)) {
			throw new BoardException("Posição fora do tabuleiro");
		}
		return piece(position) != null;
	}
	
}
