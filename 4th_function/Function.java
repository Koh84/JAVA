public class Function{

	public static void main(String args[])
	{
		System.out.println(add(1,2));
		System.out.println(add(1,2,3));
		System.out.println(add(1.1f,2.2f));
	}

	public static int add(int x, int y)
	{
		return x+y;
	}
	
	//java allow overrides
	public static float add(float x, float y)
	{
		return x+y;
	}

	//java allow overrides
	public static int add(int x, int y, int z)
	{
		return x+y+z;
	}
}
