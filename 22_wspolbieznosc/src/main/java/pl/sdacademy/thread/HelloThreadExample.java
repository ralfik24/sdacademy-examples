package pl.sdacademy.thread;

public class HelloThreadExample {
	public static void main(String[] args) throws InterruptedException {
		NumberHolder number = new NumberHolder(0);
		Thread thread = new Thread(() -> System.out.println("hello from thread"));
		thread.start();
		thread.sleep(5000);
		System.out.println("hello");
	}

	public static class NumberHolder {
		private int number;

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public NumberHolder(int number) {
			this.number = number;

		}

		public void increment() {
			if (number < 3) {
				number++;
			}
		}
	}
}
