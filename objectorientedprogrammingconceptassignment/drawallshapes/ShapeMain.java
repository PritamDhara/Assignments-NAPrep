package objectorientedprogrammingconceptassignment.drawallshapes;

public class ShapeMain {
	public static void main(String[] args) {
		
		Shape line = new Line(10);
		Shape rectangle = new Rectangle(5, 10);
		Shape cube = new Cube(8);
		
		line.draw();
		rectangle.draw();
		cube.draw();
	}

}
