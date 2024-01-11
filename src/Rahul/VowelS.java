package Rahul;
public class VowelS {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='w';
		if(ch>='a' && ch<='z' ||ch>='A'&&ch<='Z')
		{
			switch(ch)
			{
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
			{
				System.out.println("It is Vowel");
				break;
			}
			default :
			{
				System.out.println("It is a Consant");
			}
			}
		}
		else
		{
			System.out.println("It is not an alphabets");
		}
	}
}