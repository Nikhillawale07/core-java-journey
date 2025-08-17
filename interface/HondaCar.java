class HondaCar implements Car
{
	int MinSpeed=40;
	public void color()
	{
		System.out.println("HondaCar available in all color");
	}
	
	public void type()
	{
		System.out.println("HondaCar available in all segment");
	}
	public void cc()
	{
		System.out.println("HondaCar available in 1000cc to 2000cc");
		System.out.println("MinSpeed="+MinSpeed+"MaxSpeed"+MaxSpeed);
	}
}