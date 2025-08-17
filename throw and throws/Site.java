class Site
{
	private void home()
	{
		System.out.println("welcome to our second home");
	}
	public void login(int age) 
	{
		System.out.println("welcome to this site");
		if(age>=70)
			home();
		else
			throw new InvalidAgeException 
			("age should be atleast 70 or above");
		System.out.println("thank you for visit");
	}
		
}