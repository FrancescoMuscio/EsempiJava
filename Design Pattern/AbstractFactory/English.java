package AbstractFactory;

public class English implements Text { //Product B2
	public void tell() {
		System.out.println("::: The pen is on the table :::");
	}
	public void shout() {
		System.out.println("::: THE CAT IS ON THE TABLE :::");
	}
}
