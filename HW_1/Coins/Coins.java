public class Coins
{
	public static void main(String[] args)
	{
		int numCents = Integer.parseInt(args[0]);
		int cent = 1;
		int quater = 25;
		int countQuater = 0;
		int countCents = 0;

		while (numCents >= 25)
		{
			numCents = numCents - 25;
			countQuater=countQuater + 1;
		}
		while (numCents > 0)
		{
			numCents = numCents - 1;
			countCents = countCents + 1;
		}
	System.out.println("Use "+ countQuater + " quaters and "+ countCents +" cents");

	}
}