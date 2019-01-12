package pl.sdacademy.tdd;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


import static org.assertj.core.api.Assertions.*;

 public class SumTest {
	@DisplayName("sum two numbers")
	 @Test

	 public void test(){
		//given
		int number =8;
		//when
		String msg = Sum.msg(number);
		//then
		assertThat(msg).isEqualTo("8");

	}


	}



