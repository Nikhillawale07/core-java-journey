import java.util.Arrays;
class Nikhil
{
	public static void main(String args[])
	{
		int a[]={123,234,567,876,47934};
		for(int i=0;i<a.length;i++)
		{
			int max=0;
			int temp=a[i];
			while(temp!=0)
			{
				if(max<temp%10)
				max=temp%10;
				temp/=10;
			}
			
			a[i]=max;	
		}
			System.out.println(Arrays.toString(a));

	}
}