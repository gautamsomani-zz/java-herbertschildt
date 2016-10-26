class contructor01	{
	public static void main(String args[])	{

		System.out.println("Hello.");

		Box b2 = new Box();
		Box b3 = new Box(15, 25, 35);
		Box b4 = new Box(1, 2);

//		b2.display();
//		b3.display();
//		b4.display();

		double vol = b3.volume(2,2,2);	
		System.out.println("Volueme : " + vol);
	}
}



class Box	{

	double	lenght, breadth, height;

//	# Default Contructor Below. Will Instantiate.	
	Box()	{
		System.out.println("Happy Diwali. ");
		lenght = 5;
		breadth = 6;
		height = 8;
	}
//	# Constructor. Will assign passed variables at run time to the variables.
	Box(double a, double b, double c)	{
		lenght = a;
		breadth = b;
		height = c;
	} 

//	# 2 Argument Constructor :)
	Box(double a, double b)	{
		lenght = a;
		breadth = b;
		height = 8;
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

	double volume(double a, double b, double c)	{
		lenght = a;
		breadth = b;
		height = c;

		double volueme = lenght * breadth * height;	
		return volueme;
	}
}
