class Parent extends GrandParent
{
	int a=100;
	Parent()
	{	
		super();
		System.out.println("default const of parent");
	}
	
	Parent(int a)
	{
		super(10);
		System.out.println("pare const of parent");
	}
	
	void display()
	{
		System.out.println("display method of parent");
		System.out.println("a="+a);
	}
}