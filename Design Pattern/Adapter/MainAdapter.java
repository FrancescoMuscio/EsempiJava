package Adapter;

public class MainAdapter {

	public static void main(String[] args) {

		ILabel s = new Label("LAB");
		//ILabel s = new ClassLabel("LAB");
		String l = s.getNextLabel();
		if (l.equals("LAB1"))
		System.out.println("Test 1:Passed");
		else
		System.out.println("Test1:Failed");
	}
}
