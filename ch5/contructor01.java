class contructor01	{
	public static void main(String args[])	{

		System.out.println("Hello.");

		Box b2 = new Box();
		Box b3 = new Box(15, 25, 35);

		b2.display;
		b3.display;
	}
}

class Box	{

	double	lenght, breadth, height;

//	# Contructor Below. Will Instantiate.	
	Box()	{
		System.out.println("Happy Diwali. ");
		lenght = 5;
		breadth = 6;
		height = 8;
	}

	Box(double a, double b, double c)	{
		lenght = a;
		breadth = b;
		height = c;
	} 

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
