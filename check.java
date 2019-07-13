import java.util.Scanner;

class veg
{
	int quantity=10;
	Scanner sc=new Scanner(System.in);
	//int qua;
	int qua = sc.nextInt();
	
	public void availability()
	{
		if(quantity>=qua)
		{
			System.out.println("It is available and quantity is "+ quantity);
		}
	}
	
	public void buy()
	{
		if(qua>quantity)
		{
			System.out.println("This much of items not available");
		}
		else
			System.out.println("You have purchased "+qua+ "item and the item left is "+(quantity-qua));
	}
	
}

class check
{
	public static void main(String args[])
	{
		veg v1=new veg();
		v1.availability();
		v1.buy();
	}
}