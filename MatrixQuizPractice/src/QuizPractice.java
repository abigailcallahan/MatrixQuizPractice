
public class QuizPractice
	{

		public static void main(String[] args)
			{
				//instantiate 6x6 2-D array of ints
				//populate with random 2 digit values
				//display grid
				//print largest value
				
				int[][] matrix = new int[6][6];
				
				for(int row = 0; row < 6; row++)
					{
						for(int col = 0; col < 6; col++)
							{
								matrix[row][col] = (int)(Math.random() * 90) + 10;
							}
					}
				
				
				for(int row = 0; row < 6; row++)
					{
						for(int col = 0; col < 6; col++)
							{
								System.out.print(matrix[row][col] + "   ");
							}
						System.out.println();
					}
				
				
				int highestNum = 0;
				for(int row = 0; row < matrix.length; row++) 
					{
					for(int col = 0; col < matrix[0].length; col++)
						{
							if (matrix[row][col] > highestNum)
								{
									highestNum = matrix[row][col];
								}
						}				
					}
				System.out.println("\nThe highest number is " + highestNum);	
				
				
				
				
				

			}

	}
