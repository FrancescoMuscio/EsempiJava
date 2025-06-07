package ObserverStandard2;

import java.util.ArrayList;
import java.util.List;

import ObserverStandard.Observer;

public abstract class Subject {
	protected List<Observer2> obs = new ArrayList<>();
	protected boolean changed = false;
	
	public void attach(Observer2 o) {
		obs.add(o);
	}
	
	public void remove(Observer2 o) {
		obs.remove(o);
	}
	
	public void setChanged() {
		changed = true;
	}
	
	public void notify(Object oggetto) {
		if(!changed) return;
		for(Observer2 o : obs) o.update(this, oggetto);
		changed = false;
	}
}
