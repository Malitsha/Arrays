class MultArray{
	public static void main(String[]args)
	{
		int [][]table=new int[5][10];
		
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<10;j++)
				{
					table[i][j] = i * 10 + j;
					
				}
			}
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print(table[i][j]+"  ");
			}
			System.out.println();
		}
	}
}