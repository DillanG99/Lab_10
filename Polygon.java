import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class Polygon extends Shape {
	public Polygon(Color color, boolean filled) {
		super(color, filled);
	}
	
	public void draw(Graphics graphics) {
		int[] Xs = new int[location.length];
		int[] Ys = new int[location.length];
		for(int index = 0; index < location.length; ++index) {
			Xs[index] = location[index].x;
		}
		for(int index = 0; index < location.length; ++index) {
			Ys[index] = location[index].y;
		}
		graphics.drawPolygon(Xs, Ys, location.length);
	}
}
