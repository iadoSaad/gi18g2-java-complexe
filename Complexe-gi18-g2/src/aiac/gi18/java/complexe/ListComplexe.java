package aiac.gi18.java.complexe;

import java.util.ArrayList;

public class ListComplexe extends ArrayList<Complexe> {
	
	@Override
	public boolean add(Complexe e) {
		if(this.contains(e)) return false;
		return super.add(e);
	}
	
	public  Complexe somme() {
		Complexe c=new Complexe();
		
		for (int i = 0; i < this.size(); i++) {
			c=c.add(this.get(i));
		}
		
		return c;
		
	}

}
