package security;

public class NoVisiabilityTest {
	
	private static class ReadThread extends Thread {
		
		private Boolean ready = new Boolean(false);
		
		public int number;
		
		public void run() {
			while(!this.ready) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				number++;	
				for(int i = 0 ;i < 1000; i++){
					int j =i;
				}
//				Thread.yield();
//				call();
			}
			System.out.println(ready);
			System.out.println(number);
		}
		
		private void call(){
			int i =1;
//			Thread.yield();
//			System.out.println(i);
		}
		
		public void readyOn() {
			this.ready = true;
		}
	}
	
	public static void main(String []args) throws InterruptedException {
		final ReadThread readThread = new ReadThread();
		readThread.start();
		
		Thread.sleep(200);
		new Thread(new Runnable(){
			@Override
			public void run() {
				readThread.readyOn();
				while(true){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(readThread.number);
				}
			}
			
		}).start();
		Thread.sleep(1000);
		System.out.println(readThread.ready);
	}
}
