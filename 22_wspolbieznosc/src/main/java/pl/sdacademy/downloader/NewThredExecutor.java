package pl.sdacademy.downloader;

public class NewThredExecutor implements Executor {
	@Override
	public void execute(Runnable codeToExecute, TaskFinishedListener listener) {
		Thread thread = new Thread(()-> {
			codeToExecute.run();
			listener.taskFinished();
		});
		thread.start();
	}
}
