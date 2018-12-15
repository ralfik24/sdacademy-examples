package pl.sdacademy.downloader;


import java.io.InputStream;
import java.util.Scanner;

public class CommandLineRunner {
	private URLDownloader downloader;

	public CommandLineRunner(URLDownloader downloader) {
		this.downloader = downloader;
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
		Thread thread = new Thread(() -> downloader.download(command));
		thread.start();
	}
}





