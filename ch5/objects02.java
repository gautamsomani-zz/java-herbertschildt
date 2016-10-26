class objects02	{
	public static void main(String args[])	{

	Box b1 = new Box();
	System.out.println("A is " + b1.a + " and b is " + b1.b);

	Box b2 = b1;
	System.out.println("A is " + b2.a + " and b is " + b2.b);
	
//	b1 = null;
//	System.out.println("A is " + b2.a + " and b is " + b2.b);

	System.out.println(b1);
	System.out.println(b2);

	Box b3 = new Box();
	System.out.println(b3);

	}
}

class Box{

	int a = 10;
	int b = 20;

}
