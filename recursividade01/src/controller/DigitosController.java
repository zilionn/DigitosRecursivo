package controller;

public class DigitosController {

	public DigitosController() {
		super();
	}

	public int ContaDigitos (int N) {
		if (N < 10) {
			return 1;
		}else
			return 1 + ContaDigitos(N / 10);
	}
}
