class bool_1	{
	public static void main(String args[])	{
		
		int a = 5, b = 6;
		boolean f = ( a > b ), t = ( a < b );

		if(t) {
			System.out.println("f is " + f + " and t is " + t);
		}

		if(!f)	{
			System.out.println("False.");
		}
	}
}
