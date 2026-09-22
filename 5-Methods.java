class Computer
{
	public void playMusic()
	{
		System.out.println("Music is Playing...");
	}
	public String getMeAPen(int cost)
	{
		if(cost>=60)
			return "Pen";
		else
			return "Nope";
	}
}

class Methods {
	public static void main(String[] args) {
		Computer obj=new Computer();
		obj.playMusic();
		String src=obj.getMeAPen(600);
		System.out.println(src);
	}
}
