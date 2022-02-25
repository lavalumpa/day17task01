package domain;

import java.util.List;
import java.util.Random;

public class ShuffleableList<E> implements Shuffleable {
	private final List<E> list;
	
	public ShuffleableList(List<E> list) {
		super();
		this.list = list;
	}

	public List<E> getList() {
		return list;
	}




	@Override
	public void shuffle() {
		Random random= new Random();
		for (int i=0; i<list.size(); i++) {
			E temp = list.remove(random.nextInt(list.size()-i) +i);
			list.add(i, temp);		
		}
	}

}
