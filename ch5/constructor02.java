class constructor02	{
	public static void main(String args[])	{


	triangle t1 = new triangle("t1");
	t1.describeTriangle();

	triangle t2 = new triangle(3.0, 4.0, 5.0, "t2");
	t2.describeTriangle();

	triangle t3 = new triangle("t3");
	t3.describeTriangle();

	triangle t4 = new triangle("t4");
	t4.describeTriangle();


	}
}







class triangle	{

	double side1 = 5.0;
	double side2 = 12.0;
	double side3 = 13.0;
	String instanceName;



	double calcPerimeter()	{
		double periMeter = side1 + side2 + side3;
		return periMeter;
	}



	void calcLongest()	{
		if (side1 > side2)	{
			if (side1 > side3)	{
				System.out.println("Side1 is longest.");
			}
			else	{
				System.out.println("Side3 is longest.");
			}
		}
		else if	(side2 > side3)	{
			System.out.println("Side2 is longest.");
		}
		else	{
			System.out.println("Side3 is longest.");
		}

	}



	boolean isRightAngledTriangle()	{

		double sum = (side1 * side1) + (side2 * side2);
		double Square3rdside = side3 * side3;
		boolean isRightAngledTriangle;

		if ( sum == Square3rdside ) isRightAngledTriangle = true;
		else isRightAngledTriangle = false;
		return isRightAngledTriangle;
		
	}



	void describeTriangle()	{

        	double perimeter = calcPerimeter();	
		System.out.println("Perimeter for " + instanceName + " is " + perimeter + ".");
 		calcLongest();
 		boolean isitRightAngledTriangle = isRightAngledTriangle();
 		System.out.println("Is " + instanceName + " an Right Angled Triangle? " + isitRightAngledTriangle + "\n");

	}
		


	triangle(String instance)	{
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
		instanceName = instance;	
	}



	triangle(double first, double second, double third, String instance)	{
		side1 = first;
		side2 = second;
		side3 = third;
		instanceName = instance;
	}



	triangle(double first, double second, String instance)	{
		side1 = first;
		side2 = second;
		side3 = 1.0;
		instanceName = instance;
	}

}						
