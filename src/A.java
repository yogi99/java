
public class A {
	int data=10;
	A()
	{
		 B b=new B(this);
		 b.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
         A a=new A();
	}

}
class B
{
	A obj;
	B(A obj)
	{
		this.obj=obj;
	}
	void display()
	{
		System.out.print("yogesh your data of class a is"+obj.data);
	}
}
