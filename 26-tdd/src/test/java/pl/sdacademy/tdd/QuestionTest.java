package pl.sdacademy.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class QuestionTest {
	//@formatter: off
	@DisplayName("given question with initial score 0," +
		     "when upvote the question, " +
		     "then score is 1"
	)
	//@formatter: on
	@Test
	void test() throws Exception {
		//given
		Question question = new Question(0, "goobar");
		//when

		//then
	}

}
