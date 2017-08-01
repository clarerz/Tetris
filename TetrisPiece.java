package assignment;

import java.awt.*;

/**
 * An immutable representation of a tetris piece in a particular rotation.
 * Each piece is defined by the blocks that make up its body.
 */
public final class TetrisPiece extends Piece {
	private Point[] points;
	private int[] skirt;
//	private boolean[][] shape;
	private int width;
	private int height;
	
	private TetrisPiece(String pieceString) {
		points = parsePoints(pieceString);
		
		width = 0; //is this allowed......
		height = 0;
		
		//count width and height
		for (int i = 0; i < points.length; i++) {
			if (points[i].getX() >= width)
				width = (int) points[i].getX() + 1;
			if (points[i].getY() >= height)
				height = (int) points[i].getY() + 1;
			
//			System.out.println("current width: " + width + ", current height: " + height);
		}
		
		countSkirt();
	}
	
	private void countSkirt() {
//		shape = new boolean[height][width];
//		for (int i = 0; i < points.length; i++) {
//			shape[(int) points[i].getX()][(int) points[i].getY()] = true;
//		}
		
		skirt = new int[width];
		for (int i = 0; i < skirt.length; i++)
			skirt[i] = 10;
		
		for (int i = 0; i < points.length; i++) {
			Point pt = points[i];
			if (pt.getY() < skirt[(int) pt.getX()]) {
				System.out.println("hit");
				skirt[(int) pt.getX()] = (int) pt.getY();
			}
		}
	}
	
    /**
     * Return a Piece class from a String representation of the points
     * in the piece's body
     */
	//static factory constructor waow
	public static Piece getPiece(String pieceString) { 
		return new TetrisPiece(pieceString);
	}

    public int getWidth() {
    	return width;
    }

    public int getHeight() {
    	return height;
    }

    public Point[] getBody() {
    	return points;
	}

    public int[] getSkirt() {
    	return skirt;
	}

    public boolean equals(Object other) {
    	return false;
    }
}
