package com.ashford.javachessgame;

public class Pawn extends Piece {
	public Pawn(PieceColor color, Position position) {
			super(color, position);
	}
	
	@Override
	
	public boolean isValidMove(Position newPosition, Piece[][]board) {
		
		
		// if the piece is white, forward direction is -1 otherwise, pos 1
		int forwardDirection  = color == PieceColor.WHITE ? - 1:1; 
		
		//
		int rowDiff = (newPosition.getRow()- position.getRow() *forwardDirection);
		int colDiff = newPositin.getColumn() - position.getColumn();
		
		if(colDiff == 0 && rowDiff == 1 && board[newPosition.getRow()][newPosition.getColumn(]==null){
			return true;
			//pawn is allowed to move 
		}
		
		
	}
}
