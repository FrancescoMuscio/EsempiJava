package State;

import java.util.List;

public class SingolaParola implements Display { //ConcreteState

	private int maxLung;
	
	@Override
	public void scrivi(List<String> testo) {
		System.out.println();
		trovaMaxLung(testo);
		for (String p : testo) {
			int numSpazi = (maxLung - p.length()) / 2;
			mettiSpazi(numSpazi);
			System.out.print(p);
			if (p.length() % 2 == 1) numSpazi++;
			mettiSpazi(numSpazi);
			aspetta();
			cancellaRiga();
		}
	System.out.println();
	}
	
	private void mettiSpazi(int n) {
		System.out.print(" ".repeat(n));
	}
	private void cancellaRiga() {
		System.out.print("\b".repeat(maxLung));
	}
	private void trovaMaxLung(List<String> testo) {
		for (String p : testo) if (maxLung < p.length()) maxLung = p.length();
	}
	private static void aspetta() {
		try {
			Thread.sleep(300);
	} catch (InterruptedException e) { }
	}
}
