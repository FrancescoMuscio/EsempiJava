package Facade;

import java.util.Arrays;
import java.util.List;

public class Italian {
	private String text = " ";
	private List<String> d = Arrays.asList("Va bene", "Ciao", "Capito", "Si");
	
	public void add(int i) {
		text = text + d.get(i);
	}
	
	public void printText() {
		System.out.println(text);
	}
}
