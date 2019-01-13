package pl.sdacademy.tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MultipleTest {
	@DisplayName("Mnożenie dwóch liczb")
	@Test()

	 public void test() {
		//given
		int n1 = 4;
		int n2 = 5;

		//when
		int wynik = Multiple.result(n1, n2);
		//then
		Assertions.assertThat(wynik).isEqualTo(20);
	}
	@DisplayName("Mnożenie ")
	@ParameterizedTest(name = "czynnik 1= {1}, czynnik 2 = {3}, iloczyn = {6}")
	@CsvSource({
		"3,2,6",
		"5,4,20"
	})
	void test(int n1, int n2, int wynik){
		//when
		int wynik0= Multiple.result(n1,n2);
		//then
		Assertions.assertThat(wynik0).isEqualTo(wynik);
	}
}


