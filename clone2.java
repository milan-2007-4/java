//clone method  
class abc implements Cloneable
{
	int x,y;
	public Object clone() throws CloneNotSupportedException
	{							 
		return super.clone();
	}
}
class clone2
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
			abc a=new abc();//reference
			a.x=200;
			a.y=900;
			abc a1=(abc)a.clone();
			a1.x=800;
			System.out.println("a:"+a.x+" "+a.y);
			System.out.println("a1:"+a1.x+" "+a1.y);
	}
}