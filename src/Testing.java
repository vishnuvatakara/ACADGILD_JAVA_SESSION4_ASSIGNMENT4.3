final class Demo
{
	
}
class Subclass extends Demo //can not inherit final class,cause compilation error
{
	
}
class Student{
	final String clgname="fisat";
	public void modify()
	{
		clgname="scms";//final variable can not update,create compile time error
	}
	public final void display() //definig final method
	{
		System.out.println("final method");
	}
}
public class Testing extends Student {
	public void display()
	{
		System.out.println("try to override final method");//can not over ride final method,cause compile time error
	}
public static void main(String args[])
{
	Testing obj=new Testing();
}
}
