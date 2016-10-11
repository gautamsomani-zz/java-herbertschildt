class array_3	{
	public static void main(String args[])	{

		double numbers[] = { 10.6, 32.9, 3.8, 21.3 };
		double sum = 0, average = 0;

		for ( int i = 0 ; i < numbers.length ; i++ )	{
			sum = sum + numbers[i];
		}

		average = sum / numbers.length;

		System.out.println("Average is " + average);

	}
}
		
