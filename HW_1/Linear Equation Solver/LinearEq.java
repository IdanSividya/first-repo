// The following program solves linear equations of the form 𝑎 ⋅ 𝑥 + 𝑏 = c

public class LinearEq
{
	public static void main(String[] args)
	{
		double a = Integer.parseInt(args[0]);
		double b = Integer.parseInt(args[1]);
		double c = Integer.parseInt(args[2]);		
		double x;
		x = (c-b)/a;
	//print the equation and its solution
	System.out.println(a + " * x + " + b + " = " + c);
	System.out.println("x = " + x);


	}
}