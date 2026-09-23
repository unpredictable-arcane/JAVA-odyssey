class Calc
{
		public int add(int n1, int n2)
	{
		return n1+n2;
	}

		public double add(double n1, int n2)
	{
		return n1+n2;
	}

	public int add(int n1, int n2, int n3)
	{
		return n1+n2+n3;
	}
}


class Overload {
	public static void main(String[] args) {
		Calc obj=new Calc();
		int r1=obj.add(6,2);
		System.out.println(r1);
	}
}