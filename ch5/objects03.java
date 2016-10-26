class objects03	{
	public static void main(String args[])	{

	Box b1 = new Box();
	b1.setDim(4, 5, 6);
	int vol = b1.volume();
	System.out.println("Vol is " + vol);

	}
}

class Box	{

	int breadth, height, width, volume;

	int volume()	{
		return breadth * height * width;
	}

	void setDim( int b, int h, int w)	{
		breadth = b;
		height = h;
		width = w;
	}
}
