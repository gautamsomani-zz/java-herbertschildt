class pre_post	{
	public static void main(String args[])	{
		int a = 41, b;
		System.out.println("a is " + a);
		b = a++;
		System.out.println("b is " + b);
		a = 41 ; b = ++a;
		System.out.println("b is " + b);
	}
}
