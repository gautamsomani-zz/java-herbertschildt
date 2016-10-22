class contructor01	{
	public static void main(String args[])	{

		System.out.println("Hello.");

//		# new will give memory. mybox is a reference pointer to memory. new will instantiate.
		Box b2 = new Box();

	}
}

class Box	{

	double	lenght, breadth, height;
	
	void display()	{
		System.out.println("mybox.lenght is " + lenght);
		System.out.println("mybox.breadth is " + breadth);
		System.out.println("mybox.height is " + height);
	}

	void setData(double a, double b, double c)	{
		lenght = a;
		breadth = b;
		height = c;
	} 

}
