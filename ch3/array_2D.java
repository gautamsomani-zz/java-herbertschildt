class array_2D	{
	public static void main(String args[])	{

		int array_2d[][] = new int[10][10];

		for ( int i = 0 ; i < 10 ; i++ )	{
			for ( int j = 0 ; j < 10 ; j++ )	{

				int k = i * j + 34;
				array_2d[i][j] = k;

				System.out.print(array_2d[i][j] + "   ");
			}
		System.out.print("\n");
		}
	}
}
