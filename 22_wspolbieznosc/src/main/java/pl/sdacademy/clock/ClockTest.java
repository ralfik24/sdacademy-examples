package pl.sdacademy.clock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ClockTest {
	public static void main(String[] args) throws InterruptedException {
		Clock clock = new Clock(DateTimeFormatter.ofPattern("hh:mm:ss"));
		Clock clock1 = new Clock(DateTimeFormatter.ofPattern("hh"));
		Clock clock2 = new Clock(DateTimeFormatter.ofPattern("mm:ss"));
		clock.startClock();
		clock1.startClock();
		clock2.startClock();
		Thread.sleep(3000);
		clock.stopClock();
	}
}











