package base;
public class Client {
	
	private boolean stop = false;
	
	private int num = 0;
	
	class A implements Runnable {

		public void run() {
			while (!stop) {
				num++;
			}
			System.out.println(Thread.currentThread().getName().concat(" is stoping"));
		}
	}
	
	class B implements Runnable {
		public void run() {
			try {
				System.out.println(Thread.currentThread().getName() + stop);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			stop = true;
			System.out.println(Thread.currentThread().getName() + stop);
		}
	}
	public static void main(String[] args) {
		Client clinet = new Client();
		Thread a = new Thread(clinet.new A());
		Thread b = new Thread(clinet.new B());
		a.start();
		b.start();
	}
}