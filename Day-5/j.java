lass j{
	public void finalize(){Syste.out.println("jyhdqb");}
	public static void main(String[] args)
	{
		j s1=new j();
		j s2=new j();
		s1=null;
		s2=null;
		finalize();
	}	
}

		