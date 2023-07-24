package objectorientedprogrammingconceptassignment.drawallshapes;

public class Line extends Shape{
	
	 int length;
	 
	 public Line(int length)
	 {
		 this.length=length;
	 }
	 
	 @Override
	 public void draw()
	 {
		 for(int i=0;i<length;i++)
		 {
			 System.out.print("__");
		 }
	 }

}
