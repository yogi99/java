class Over
{
	static
	{
		System.out.println("sttaic invoked of over");
	}
}

class Over1 
{
	public static void hello()
	{
	 System.out.println("over1 method");	
	}
	static
	{
		System.out.println("sttaic invoked");
	}
}
public class Override extends Over1 {
	public static void  hello()
	{
	 System.out.println("override has this one");	
	}
	static
	{
		System.out.println("hello static two is invoked");
	}
	public static void main(String a[])
	{
	Over1 p1=new Override();
	Over1 p2=new Over1();
	p2.hello();
	p1.hello();
	}
}
