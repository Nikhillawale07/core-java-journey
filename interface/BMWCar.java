class BMWCar implements Car
{
	int MinSpeed=60;
	public void color()
	{
		System.out.println("BMWCar available in blue,white,black grey");
	}
	
	public void type()
	{
		System.out.println("BMWCar available in sedan and XUV");
	}
	public void cc()
	{
		System.out.println("BMWCar available in 2000 to 4000cc");
		System.out.println("MinSpeed="+MinSpeed+" MaxSpeed="+MaxSpeed);
	
	}
}