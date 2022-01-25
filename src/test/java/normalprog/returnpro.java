package normalprog;

public class returnpro 
{
	public int sample(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static void main(String[] args)
	{
		returnpro r=new returnpro();
		int d=r.sample(2, 5);
		int e=d*29/66;
		System.out.println(e);
		
	}

}
