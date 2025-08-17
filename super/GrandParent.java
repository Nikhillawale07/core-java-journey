class GrandParent 
{
	int a=10;
	GrandParent()
	{
		super();
		System.out.println("default const of GrandParent");
		
	}
	GrandParent(int a)
	{	
		System.out.println("para const of GrandParent");
	}
	
	void displaay()
	{
		System.out.println("display method of grandparent");
		System.out.println("a="+a);
	}
}