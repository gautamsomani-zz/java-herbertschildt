class array_3D	{
	public static void main(String args[])	{

		int array_3d[][][] = new int[2][3][4];

		for ( int a = 0 ; a < 4 ; a++ )	{
			for ( int b = 0 ; b < 3 ; b++ )	{
				for ( int c = 0 ; c < 2 ; c++ )	{

					int d = a + b + c + 2;
					System.out.print(d + "  ");
				}
			System.out.println();
			}
		System.out.println();
		}
	}
} 
