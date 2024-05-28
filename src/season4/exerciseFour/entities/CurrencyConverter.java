package season4.exerciseFour.entities;

public class CurrencyConverter {
	private static final double IOF_TAX = 0.06;
	private static double countin;

	public static double convert(double value) {
		return value * countin - countin * IOF_TAX;
	}

	public static double getCountin() {
		return countin;
	}

	public static void setCountin(double countin) {
		CurrencyConverter.countin = countin;
	}
}
