class FerrariCar implements Car
{
	int MinSpeed=80;
	public void color()	
	{
		System.out.println("FerrariCar available in red,yellow,green,white");
		
	}
	public void type()
	{
		System.out.println("FerrariCar available in sport mode");
	}
	
	public void cc()
	{
		System.out.println("FerrariCar available in 4000 to 6000 cc");
		System.out.println("MinSpeed="+MinSpeed+"MaxSpeed="+MaxSpeed);
	}
}