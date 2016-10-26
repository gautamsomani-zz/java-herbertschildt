/* 	In this code, I am expecting the constructor to initialize the variables 
	breadth, height, length and weight, and then I also expect the volueme()
	function to be able to access these variables.

	BUT, that is not happening. Why? 
*/



class objects01	{
	public static void main(String args[])	{

	Box b1 = new Box();
	System.out.println("Volueme is : " + b1.volueme());

	}
}



class Box	{

	double breadth, height, length, weight;

	Box()	{

		breadth = 2;
		height = 3;
		length = 4;
		weight = 120;
	}

	int volueme()	{

		int volueme, breadth, height, length;

		volueme = breadth * height * length;
		return volueme;
	}

}	
