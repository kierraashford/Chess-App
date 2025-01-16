package com.ashford.javachessgame;

public abstract class Piece{
	protected Position position;
	protected PieceColor color;
	
	public Piece(PieceColor color, Position position) {
		
		this.color = color;
		this.position = position;
	}
	
	public PieceColor getColor() {
		
	}
}