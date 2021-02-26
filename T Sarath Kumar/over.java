class abc{
public void show(int a,String s)
  {
    System.out.println(a+" "+s);
    }
public void show(String b,String s)
  {
    System.out.println(b+" "+s);
   }
	}

class overload{
	public static void main(String[] args)
	{
	 abc o=new abc();
	 o.show(11,"SARATH");
	 o.show("hello","goodmorning");	   			
	}
  }