package objectorientedprogrammingconceptassignment;

public final class SingletonClass {
	
	private static SingletonClass singletonClass=null;
	
	public String messege;
	
	private SingletonClass()
	{
		messege="This is a Singleton Class";
	}
	
	public static SingletonClass singleton()
	{
		if(singletonClass==null)
		{
			singletonClass= new SingletonClass();
		}
		return singletonClass;
	}

}
