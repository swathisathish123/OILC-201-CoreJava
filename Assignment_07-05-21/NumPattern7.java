/*7)   1
       2 3
       3 4 5
       4 5 6 7
       5 6 7 8 9*/

public class NumPattern7 {

	public static void main(String[] args) 
	{
		int k;
		for (int i = 1; i <= 5; i++) 
		{
			k=i;
			for (int j = 1;j<=i;j++)
			{
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
	}

}
