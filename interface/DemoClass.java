class DemoClass implements IndianMother,BritishMother
{
	public void food()
	{
		IndianMother.super.food();
		BritishMother.super.food();
	}
}