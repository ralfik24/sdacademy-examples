package pl.sdacademy.downloader;

import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class FileDowloader implements URLDownloader {

	@Override
	public void download(String url) {
		try {
			System.out.println(String.format("Downloading file %s",url));
			Thread.sleep(10_000);
			URL urlObiect = new URL(url);
			InputStream input =  urlObiect.openConnection().getInputStream();

			Path file = Paths.get("C:\\Users\\ralfi\\Documents",filname(url));
			Files.copy(input,file);

			System.out.println(String.format("Saved Url %s to file %s",url,file ));
		}
		catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}

	private String filname(String url) {
		return String.format("file-%s.png",new Random().nextInt(1000));
	}
}

