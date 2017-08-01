package assignment;

import java.util.Arrays;

public class Tests {
	
	public static void main(String[] args) {
		Piece piece = TetrisPiece.getPiece("0 0  0 1  0 2  0 3");
		System.out.println(Arrays.toString(piece.getSkirt()));
		System.out.println(piece.getWidth() + " " + piece.getHeight());
		System.out.println(Arrays.toString(piece.getBody()));
	}
	
}
