package assignments;

public class FindAllArmstrongNumber {
	public static void main(String[] args) {
		
		for (int i = 100; i <=999 ; i++) {
			int res=0;
			int copy=i;
			
			while(copy!=0)
			{
				int temp=copy%10;
				 res= res+(temp*temp*temp);
				 copy=copy/10;
			}
			
			if(res==i)
			{
				System.out.println("The Number is Armstrong"+i);
			}else {
//				System.out.println("This is not an Armstrong number"+i);
			}
			
		}
	}

}
