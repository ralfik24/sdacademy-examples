package pl.sdacademy.downloader;

import sun.tools.jar.CommandLine;

public class Main {
	public static void main(String[] args) {
		CommandLineRunner commandLine = new CommandLineRunner(url -> System.out.printf("Downloading file %s\n"
			,url));
		commandLine.run(System.in);
	}
}
