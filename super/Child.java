class Child extends Parent
{
	int a=1000;		
	Child()
	{
		super(10);
		System.out.println("defalt const of child");	
	}
	
	Child(int a)
	{
		System.out.println("para const of child");
	}
	
	void display()
	{
		System.out.println("dispaly method of child");
		System.out.println("a="+super.a);
		super.display();
	}
	
}