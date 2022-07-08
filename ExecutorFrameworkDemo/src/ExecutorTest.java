
public class ExecutorTest {
	public static void main(String []args) {
		Runnable runnable = new Task();
		System.out.println("Calling Task.run() by directly creating a Thread object");
		Thread thread = new Thread(runnable);
		thread.start();//This is old way
		RepeatedExecutor executor = new RepeatedExecutor();
		executor.execute(runnable, 3);//New concurrency API
	}
}
