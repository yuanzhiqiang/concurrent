package executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolTest {

	
	public static void main(String[] args) {
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
		scheduledThreadPool.scheduleWithFixedDelay(new Runnable(){
			@Override
			public void run() {
				System.out.println("aaaaaa");
			}
		}, 5, 1000, TimeUnit.MILLISECONDS);
	}
	
}
