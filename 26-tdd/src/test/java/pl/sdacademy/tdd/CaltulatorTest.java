package pl.sdacademy.tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class CaltulatorTest {
	@DisplayName("given empty String")
	@Test()

	public void test() {
		//given
		String text = "";
		//when
		int wynik = Calculator.add(text);
		//then
		Assertions.assertThat(wynik).isEqualTo(0);
	}

	@DisplayName("given number 1")
	@Test
	public void test0() {
		//given
		String text = "1";
		//when
		int wynik = Calculator.add(text);
		//then
		Assertions.assertThat(wynik).isEqualTo(1);
	}

	@DisplayName("given number 2 ")
	@Test
	public void test1() {
		//given
		String text = "2";
		//when
		int wynik = Calculator.add(text);
		//then
		Assertions.assertThat(wynik).isEqualTo(2);
	}

	@DisplayName("given string with two elements then sum this element is returned it")
	@Test
	public void testTwoElements() {
		//given
		String text = "2,5";
		//when
		int wynik = Calculator.add(text);
		//then
		Assertions.assertThat(wynik).isEqualTo(7);
	}

	@Test
	public void testMoreElements() {
		//given
		String text = "2,5,1,7,9";
		//when
		int wynik = Calculator.add(text);
		//then
		Assertions.assertThat(wynik).isEqualTo(24);
	}

	@Test
	public void testDelimeter() {
		//given
		String text = "1\n2,3";
		//when
		int wynik = Calculator.add(text);
		//then
		Assertions.assertThat(wynik).isEqualTo(6);
	}



	@Test
	public void testDelimeter1() {
		//given
		String text = "//;\\n1;2";
		//when
		int wynik = Calculator.add(text);
		//then
		Assertions.assertThat(wynik).isEqualTo(3);

	}
}




