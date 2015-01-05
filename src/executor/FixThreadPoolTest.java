package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixThreadPoolTest {

	public static void main(String[] args){
		
		ExecutorService fixdThreadPool = Executors.newFixedThreadPool(10);
		fixdThreadPool.execute(new Runnable(){
			@Override
			public void run() {
				System.out.println("aaaaa");
			}
		});
//	    int COUNT_BITS = Integer.SIZE - 3;
//	    int CAPACITY   = (1 << COUNT_BITS) - 1;
//	    System.out.println(CAPACITY);
	}
}
