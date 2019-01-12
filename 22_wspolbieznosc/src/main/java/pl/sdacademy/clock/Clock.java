package pl.sdacademy.clock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Clock {
	public Clock(DateTimeFormatter ofPattern) {

	}

	private void work() {
		while (isWorking()) {
			try {
				Thread.sleep(1000);
				System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm" + ":ss")));
			}
			catch (InterruptedException e) {
				throw new RuntimeException(e.getMessage(), e);
			}

		}


	}

	void startClock() {
		new Thread(this::work).start();


	}

	private boolean isWorking() {
		return working;
	}

	private boolean working = true;

	void stopClock() {
		working = false;

	}
}
