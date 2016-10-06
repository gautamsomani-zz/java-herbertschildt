class scope	{
	public static void main(String args[])	{

		int a;
		a = 10;

		if (true)	{

			System.out.println("a is : " + a );
			a = 20;
			System.out.println("a is : " + a );
			int b = 20;
			System.out.println("b is : " + b );

		}

		System.out.println("a is : " + a );
		//System.out.println("b is : " + b );

	}
}
