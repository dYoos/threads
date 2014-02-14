package tp;

public class Demo {

	public static void main(String[] arg){
	
		Thread t1 = new Thread(){
			public void run() {
				System.out.println("Je suis executé par le thread 1");
			};
		};
		
		Thread t2 = new Thread(){
			public void run() {
				System.out.println("Je suis executé par le thread 2");
			};
		};

		MyRunnable r1 = new MyRunnable(1);
		MyRunnable r2 = new MyRunnable(2);
		
		Thread t3 = new Thread(r1);
		t1.start();
		t2.start();
		r1.run();
		r2.run();
		
		System.out.println("je suis le thread principal");
		
	}
}

class MyRunnable implements Runnable {

	int max;

	@Override
	public void run() {
		System.out.println("Je suis executé avec un Runnubale : " + max);
	}

	public MyRunnable(int max) {
		super();
		this.max = max;
	}

}