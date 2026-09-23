class MultArray {
	public static void main(String[] args) {
		int nums[][]=new int [6][7];
		
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<7;j++)
			{
				nums[i][j]=(int)Math.random()*100;
				System.out.println(nums[i][j]);
			}
			System.out.println();
		}
		
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<7;j++)
			{
				System.out.println(nums[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int n[]:nums)
		{
			for(int m:n)
			{
				System.out.println(m+" ");
			}
			System.out.println();
		}
	}
}