package pl.sdacademy.tdd;

import java.lang.reflect.Array;
import java.util.List;

public class Calculator {
	public static int add(String numbers) {
		if(numbers.isEmpty()) return 0;
		String[]data = numbers.split(",");
		if(data.length==2)
		return Integer.parseInt(data[0]) + Integer.parseInt(data[1]);
		return Integer.parseInt(numbers);

	}
}




