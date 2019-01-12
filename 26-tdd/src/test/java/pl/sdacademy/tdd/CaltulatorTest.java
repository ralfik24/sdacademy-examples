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


	@Test
	public void test0() {
		//given
		String text = "1";
		//when
		int wynik = Calculator.add(text);
		//then
		Assertions.assertThat(wynik).isEqualTo(1);
	}

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
}
