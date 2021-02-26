public class j{
	public void finalize(){System.out.println("garbage knclen");}
	public static void main(String[] args)
	{
		j s1=new j();
		j s2=new j();
		s1=null;
		s2=null;
		System.gc();
	}	
}

		