public class Div4{
	public static void main(String args[]){

		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		int r = 0;
	
		System.out.println("Begin of div");
		try{
			r = div(m,n);
		}catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("End of div");
		System.out.println(m+"/"+n+"="+r);
	}

	public static int div(int m, int n) throws ArithmeticException
	{
		int r = 0;
		
		r = m/n;
		
		return r;
	}
}
