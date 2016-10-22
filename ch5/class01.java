class class01	{
	public static void main(String args[])	{

		System.out.println("Hello.");

//		# new will give memory. mybox is a reference pointer to memory. new will instantiate.
		Box mybox = new Box();
		Box b2 = new Box();

		mybox.lenght = 10;
		mybox.breadth = 11;
		mybox.height = 12;

		b2.setdata(50, 60, 70);

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

	void setdata(double a, double b, double c)	{
		lenght = a;
		breadth = b;
		height = c;
	} 

}
