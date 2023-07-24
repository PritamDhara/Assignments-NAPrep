package objectorientedprogrammingconceptassignment.drawallshapes;

public class Rectangle extends Shape{
	int length;
	int breath;
	
	public Rectangle(int length, int breath) {
		this.length = length;
		this.breath = breath;
	}
	
	@Override
	public void draw()
	{
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<breath;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
	

}
