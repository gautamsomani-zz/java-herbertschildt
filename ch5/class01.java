class class01	{
	public static void main(String args[])	{

		System.out.println("Hello.");

//		# new will give memory. mybox is a reference pointer to memory. new will instantiate.
		Box mybox = new Box();

		mybox.lenght = 10;
		mybox.breadth = 11;
		mybox.height = 12;

		mybox.display();
	}
}

class Box	{

	double	lenght, breadth, height;
	
	void display()	{
		System.out.println("mybox.lenght is " + lenght);
		System.out.println("mybox.breadth is " + breadth);
		System.out.println("mybox.height is " + height);
	}
}
