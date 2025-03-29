package com.ashford.javachessgame;

import com.sun.tools.javac.util.Position;

public class Knight extends Piece {
	public Knight(PieceColor color, Position position) {
		super(color, position);
	}
	
	
	public boolean isValidMove(Position newPosition, Piece[][]board) {
		if(newPosition.equals(this.position)) {
			return false;
		}
		
		int rowDiff = Math.abs(this.position.getRow()- newPosition.getRow());
		int colDiff = Math.abs(this.position.getColumn()- newPosition.getColumn());
		
		//Check for the L shaped pattern 
		
		boolean isValidL = (rowDiff == 2 && oolDiff ==1) || (rowDiff == 1&& colDiff == 2);
		
		if(!isValidL) {
			return false;
		}
		
		Piece targetPiece = board[newPosition.getRow()][newPosition.getColumn()];
		if(targetPiece == null) {
			return true;
		}else {
			return targetPiece.getColor() != this.getColor();
			
		}
		
	}
}