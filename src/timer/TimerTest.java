package timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {

	
	
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new TimerTask(){
			@Override
			public void run() {
				System.out.println("aaaaa");
			}
		}, 0);
		timer.scheduleAtFixedRate(new TimerTask(){
			@Override
			public void run() {
				System.out.println("aaaaa");
			}
		}, new Date(), 1);
	}
}
