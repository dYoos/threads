package tp;

public class Demo {

	public static void main(String[] arg){
	
		Thread t1 = new Thread(){
			public void run() {
				System.out.println("Je suis execut� par le thread 1");
			};
		};
		
		Thread t2 = new Thread(){
			public void run() {
				System.out.println("Je suis execut� par le thread 2");
			};
		};

		MyRunnable r1 = new MyRunnable(2);
		MyRunnable r2 = new MyRunnable(4);
		Thread t3 = new Thread(r1);
		Thread t4 = new Thread(r2);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		System.out.println("Je suis le thread principal ");
		
		
		
	}
	
}



class MyRunnable implements Runnable{

	int max;
	
	public MyRunnable(int max) {
		super();
		this.max = max;
	}

	@Override
	public void run() {
			System.out.println("Je suis ex�cut� par un Runnable "+max);		
	}
	
}

class SuperRunnable extends MyRunnable{

	public SuperRunnable(int max, int superVariable) {
		super(max);
>>>>>>> 85ee5b3c49cde0b1d55925b02bd66d2cf370903e
		
		// TODO Auto-generated constructor stub
	}
}

class MyRunnable implements Runnable {

	int max;

	@Override
	public void run() {
		System.out.println("Je suis execut� avec un Runnubale : " + max);
	}

	public MyRunnable(int max) {
		super();
		this.max = max;
	}

}
