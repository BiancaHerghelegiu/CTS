package clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerSpital {

	List<MementoSpital> mementouri;

	public ManagerSpital() {
		super();
		this.mementouri = new ArrayList<MementoSpital>();
	}
	
	public void adaugareMemento(MementoSpital memento) {
		mementouri.add(memento);
	}
	
	public MementoSpital extragereMemento(int index) {
		return mementouri.get(index);
	}
	
}
