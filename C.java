



public class C {
	int add()
	{
	int a=10;
	int b=20;
	int c=a+b;
	return c;
	
	}
	int mul()
	{
	int a=10;
	int b=20;
	int c=a*b;
	return c;
	
	}
	public static void main(String[] args)
	{
		C obj=new C();
		obj.add();
		obj.mul();
		int result=obj.add();
		int result1=obj.mul();
		System.out.println(result1);
		System.out.println(result);
	}
}