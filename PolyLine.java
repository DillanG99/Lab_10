import java.awt.Color;
import java.awt.Point;

public class PolyLine extends Polygon {
	public PolyLine(Point pointUL, Point pointUR, int thickness, Color color, boolean filled) {
		super(color, filled);
		
		location = new Point[2];
		
		location[0] = pointUL;
		location[1] = pointUR;
	}
}
