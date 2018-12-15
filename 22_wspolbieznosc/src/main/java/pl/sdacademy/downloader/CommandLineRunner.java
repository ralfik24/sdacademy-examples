package pl.sdacademy.downloader;


import java.io.InputStream;
import java.util.Scanner;



public class CommandLineRunner {
	private URLDownloader downloader;
	private Executor executor;

	public CommandLineRunner(URLDownloader downloader, Executor executor) {
		this.downloader = downloader;
		this.executor = executor;
	}

	void run(InputStream inputStream) {
		Scanner scanner = new Scanner(inputStream);
		scanner.useDelimiter("\n");
		while (scanner.hasNext()) {
			String command = scanner.next();
			if ("exit".equals(command)) {
				return;
			}
			else if (!command.isEmpty()) {
				dowloadURL(command);

			}
			else {

			}

		}
	}

	private void dowloadURL(String command) {
		executor.execute(() -> downloader.download(command), () -> {
			System.out.println("File downloaded");


		});
	}
}






