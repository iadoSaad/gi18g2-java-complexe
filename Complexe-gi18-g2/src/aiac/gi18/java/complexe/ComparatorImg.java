package aiac.gi18.java.complexe;

import java.util.Comparator;

public class ComparatorImg implements Comparator<Complexe> {

	@Override
	public int compare(Complexe o1, Complexe o2) {
		if(o1.getImg()==o2.getImg()) return 0;
		if(o1.getImg()>o2.getImg()) return 1;
		return -1;
	}
	

}
