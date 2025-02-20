package com.ashford.javachessgame;
public class Rook extends Piece{
	public Rook(PieceColor color, Positin position) {
		super(color,position);
	}
	@Override
	public boolean isValidMove(Position newPosition, Piece[][] board) {
		//Rooks are 5 points and can move vertically or horizontally any number of spaces
		if(position.getRow() == newPosition.getRow()) {
			int columnStart = Math.min(position.getColumn(), newPosition.getColumn()) + 1;
			int columnEnd = Math.max(position.getColumn(), newPosition.getColumn());
			 fo(int column = columnStart; column <columnEnd; column++){
				 if(board[position.getRow()][column]!= null) {
					 return false; //Checking to see if there's a piece blocking the destination
				 }
				 
			 }
		}
		else if(position.getColumn()  == newPosition.getColumn()) {
			int rowStart = Math.min(position.getRow(),newPosition.getRow() + 1 );
			int rowEnd = Math.max(position.getRow(), newPosition.getRow());
			for(int row = rowStart, row < rowEnd; row++) {
				 if(board[row][position.getColumn()]!=null) {
					 return false;  //something blocking the way vertically
				 }
			}
		}else {
			return false;
		}
		//capture possible or not in new destination 
	    Piece destinationPiece = board[newPosition.getRow()][newPosition.getColumn];
	    	if(destinationPiece == null) {
	    		return true; //empty space, go ahead
	    	} else if(destinationPiece.getColor()!= this.getColor()) {
	    		return true; //capture available 
	    	}
	    	return false; //invalid move overall
	   
	}
}