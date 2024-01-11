package Rahul;

public class Calculatator {
	public static void main(String[] args) {
		int a=4,b=2,c=3;
		switch(c)
		{
		case 1:
		{
			System.out.println(a+b);
			break;
		}	
		case 2:
		{
			System.out.println(a-b);
			break;
			
		}
		case 3:
		{
			System.out.println(a*b);
			break;
		}
		case 4:
		{
			System.out.println(a/b);
			break;
		}
		case 5:
		{
			System.out.println(a%b);
			break;
		}
		default :
		{
			System.out.println("Choice int valid no");
		}
		}
	}

}
