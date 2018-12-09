import pl.sdacademy.MathConstans;

public class MathConstansExample {
	public static void main(String[] args) {
		MathConstans pi = MathConstans.PI;
		MathConstans e = MathConstans.E;
		MathConstans g = MathConstans.G;

		System.out.println(pi.getValue());
		System.out.println(MathConstans.E.getValue());
		System.out.println(MathConstans.G.getValue());

	}
}
