import java.util.concurrent.Executor;

public class RepeatedExecutor implements Executor {
	
	public void execute(Runnable runnable) {
		new Thread(runnable).start();
	}
	
	public void execute(Runnable runnable, int times) {
		System.out.printf("Calling Task.run() thro' Executor.execute() for %d times %n", times);
		for(int i = 1; i <= times; i++) {
			execute(runnable);
		}
	}
}