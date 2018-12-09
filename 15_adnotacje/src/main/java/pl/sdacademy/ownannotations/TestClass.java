package pl.sdacademy.ownannotations;
@FirstAnnotation(number = 5)
public class TestClass {
	@FirstAnnotation(value ="Test", number = 5)
	int test;
@BenchmarkTime
void test1() throws InterruptedException{
	Thread.sleep(1500);
}
@BenchmarkTime
	void test2() throws InterruptedException{
	Thread.sleep(2000);
}
@BenchmarkTime
void test3()throws InterruptedException{
	Thread.sleep(500);
}
}
