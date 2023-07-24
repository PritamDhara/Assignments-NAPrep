package objectorientedprogrammingconceptassignment.drawallshapes;

public class Cube extends Shape{
	
	int length;
	public Cube(int length)
	{
		this.length=length;
	}
	
	@Override
	public void draw()
	{
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
