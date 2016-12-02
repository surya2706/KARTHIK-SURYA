package threadPoolDemo;

public class PrintJob implements Runnable {

	String name;

	PrintJob(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println(name + " .... Job started by Thread: " + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}

		System.out.println(name + " Job completed by Thread" + Thread.currentThread().getName());
	}

}
