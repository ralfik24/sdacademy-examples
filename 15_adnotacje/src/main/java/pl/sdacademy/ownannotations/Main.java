package pl.sdacademy.ownannotations;

import java.lang.reflect.InvocationTargetException;

public class Main {
	public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
		TestClass test = new TestClass();
		BenchmarkProcessor benchmarkProcessor = new BenchmarkProcessor();
		benchmarkProcessor.benchmark(test);

	}
}
