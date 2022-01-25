package normalprog;

public class singleton
{
	static singleton a;
	private singleton()
	{
		
	}
	public static singleton object()
	{
		if(a==null)
		{
			a=new singleton();
		System.out.println("king");	
		}
		System.out.println(System.identityHashCode(a));
		return a;
		
		
	}
	void meth()
	{
		System.out.println("queen");
	}
	public static void main(String[] args) 
	{
		singleton a1= object();
		a.meth();
		System.out.println(System.identityHashCode(a1));
	}

}
