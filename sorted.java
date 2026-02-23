import java.util.SortedSet;
import java.util.TreeSet;
class sorted
{
	public static void main(String[] args)
	{
		SortedSet<Integer>set=new TreeSet<>();
		set.add(50);
		set.add(30);
		set.add(20);
		set.add(210);
		set.add(210);
		System.out.println(set);
		System.out.println("first element:"+set.first());
		System.out.println("last element:"+set.last());
	}
}
