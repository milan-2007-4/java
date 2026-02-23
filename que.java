import java.util.PriorityQueue;
import java.util.Queue;
class que
{
	public static void main(String[] args)
	{
		Queue<Integer>pq=new PriorityQueue<>();
		pq.add(50);
		pq.add(30);
		pq.add(20);
		pq.add(210);
		pq.add(210);
		
		System.out.println("PriorityQueue elements:"+pq);
	}
}
