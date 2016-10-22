class class01	{
	public static void main(String args[])	{

		System.out.println("Hello.");

//		# new will give memory. mybox is a reference pointer to memory. new will instantiate.
		Box mybox = new Box();
		mybox.lenght = 10;
		System.out.println("mybox.lenght is " + mybox.lenght);
	}
}

class Box	{

	double	lenght, breadth, height;
	
	void display()	{
		System.out.println("mybox.lenght is " + mybox.lenght);
		System.out.println("mybox.breadth is " + mybox.breadth);
		System.out.println("mybox.height is " + mybox.height);
	}
}
