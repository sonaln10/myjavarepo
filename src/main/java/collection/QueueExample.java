package collection;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class QueueExample {

	public static void main(String[] args) throws InterruptedException
	{

/*		DelayQueue d = new DelayQueue();
		Delayed e = null;
		d.put(e);
		System.out.println(d);*/
		BlockingQueue<String> q=new ArrayBlockingQueue<String>(2);
		
		q.add("A");
		q.add("N");
		System.out.println(q.offer("S"));
		q.offer("O");
		q.offer("L");
		q.offer("O");
//		q.poll();
		System.out.println(q);
	//	System.out.println(q.remove());
		//System.out.println(q);
	//	System.out.println(q.add(null));
		//System.out.println(q);
		BlockingQueue<String> q1=new ArrayBlockingQueue<String>(2);
		q1.put("Hello");
		//q1.take();
		System.out.println("q1.take(): "+q1.take()+" q1: "+ q1);
	}

}
