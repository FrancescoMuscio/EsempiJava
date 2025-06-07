package Adapter;

public class ClassLabel extends LabelServer implements ILabel { // Adapter (Soluzione Class)
	public ClassLabel(String prefix) {
		super(prefix);
	}
	public String getNextLabel() {
		return serveNextLabel();
	}
}
