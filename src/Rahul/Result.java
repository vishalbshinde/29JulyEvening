package Rahul;

public class Result {
	public static void main(String[] args) {
		double per=-1;
		if(per>=0&&per<35)
		{
			System.out.println("fail! donot die");
		}
		else if(per==35) {
			System.out.println("Just Pass celebrate !");
		}
		else if(per>35&&per<60)
		{
			System.out.println("Second Class! join Rahul classes");
		}
		else if(per>60&&per<75)
		{
			System.out.println("first class! you will get a job");
		}
		else if(per>75&&per<=100)
		{
			System.out.println("fcd! tell your parent to not spoil peace");
		}
		else {
			System.out.println("It is invalid input");
		}
	}

}
