class C
{
	int a=10;
	C()
	{
		this(50);
		System.out.println("default const called");
	}
	
	C(int a)
	{
		System.out.println("para const called");
	}
	
	void display()
	{
		int a=100;
		System.out.println("display method of c "+this);
		System.out.println(this.a);
	}
}