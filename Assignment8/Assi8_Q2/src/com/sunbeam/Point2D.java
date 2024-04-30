package com.sunbeam;

public class Point2D {
	private int x;
	private int y;

	public Point2D() {
		x = 0;
		y = 0;
	}

	public void setX(int x) throws NonNegative {
		if (x < 0) {
			throw new NonNegative("keep x coordinate only positive");
		} else {
			this.x = x;
		}
	}

	public void setY(int y)throws NonNegative {
		if(y<0) {
			throw new NonNegative("keep y coordinate only positive");
		}
		else {
		this.y = y;
		}
	}
}
