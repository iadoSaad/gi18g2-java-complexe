package aiac.gi18.java.complexe;

import java.util.ArrayList;

public class ListComplexe extends ArrayList<Complexe> {
	
	@Override
	public boolean add(Complexe e) {
		if(this.contains(e)) return false;
		return super.add(e);
	}

}
