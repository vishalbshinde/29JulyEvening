package Rahul;

public class checkChar {
	public static void main(String[] args) {
		char ch='8';
		if(ch>='a'&&ch<='z')
		{
			System.out.println("Lower Case");
		}
		else if(ch>='A'&& ch<='Z')
		{
			System.out.println("Upper Case");
		}
		else if(ch>=0&& ch<=9)
		{
			System.out.println("It is digit");
		}
		else
		{
			System.out.println("It is special Charchter");
		}
	}

}
