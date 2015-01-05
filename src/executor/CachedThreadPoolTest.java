package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolTest {

	
	
	public static void main(String[] args){
		
		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		cachedThreadPool.execute(new Runnable(){
			@Override
			public void run() {
				System.out.println("aaaaa");
			}
		});
		
		cachedThreadPool.execute(new Runnable(){
			@Override
			public void run() {
				System.out.println("aaaaa");
			}
		});
	}
}
