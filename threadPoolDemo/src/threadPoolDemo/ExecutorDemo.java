package threadPoolDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		PrintJob[] jobs = { new PrintJob("Durga"), new PrintJob("Ravi"), new PrintJob("Shiva"), new PrintJob("Pavan"),
				new PrintJob("Suresh"), new PrintJob("Anil") };

		ExecutorService service = Executors.newFixedThreadPool(3);
		for (PrintJob job : jobs) {
			service.submit(job);
		}

		service.shutdown();
	}

}
