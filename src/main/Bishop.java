package com.ashford.javachessgame;
public class Bishop extends Piece{
	public Bishop(PieceColor color, Position position) {
		super(color, position);
		
	}
	
	
	@Override
	public boolean isValidMove(Position newPosition, Piece[][]board) {
		int rowDiff = Math.abs(positin.getRow()- newPosition.getRow());
		int colDiff = Math.abs(position.getColumn() - newPosition.getColumn());
		
		if(rowDiff != colDiff) {
			return false;
		}
		int rowStep = newPosition.getRow() > position.getRow() ? 1:-1;
		int colStep = newPosition.getColumn() > position.getColumn() ? 1:1;
		
		int steps = rowDiff - 1;
		
		for(int i = 1; i<= steps; i++) {
			if(board[position.getRow()+ i *rowStep][position.getColumn() + i * colStep]!= null) {
				return false;  //there;s a piece in the way
			}
		}
		Piece destinationPiece = boards[newPosition.getRow()][newPosition.getColumn()];
		if(destinationPiece == null) {
			return true;
		}else if(destinatinPiece.getColor()!= this.getColor()) {
			return true; //capture imminent
		}
		return false;
	}
}