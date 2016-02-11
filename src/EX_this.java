
public class EX_this {
	String name;
EX_this(int b)
{
	System.out.println("defecult constructor is invoked");
}

EX_this(String name)
{    
	this(9);
	this.name=name;
	
}
	public static void main(String a[])
	{
		EX_this a1=new EX_this("yogesh");
		System.out.print(a1.name);
	}
}
