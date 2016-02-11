
class parent
{
public void hello1()
	{
	System.out.println("hello i am your parent");
	}
}
public class inheritance_example extends parent {
	public void hello1()
	{
	System.out.println("hello I am your child");
	}
	public static void main(String a[])
	{
		inheritance_example a1=new inheritance_example();
		a1.hello1();
		System.out.println("break in main");
		parent p=new parent();
		p.hello1();
		System.out.println("hello now refernce variable of parent");
	    parent ref=new inheritance_example();
	    ref.hello1();
	    
	    
	}
}

