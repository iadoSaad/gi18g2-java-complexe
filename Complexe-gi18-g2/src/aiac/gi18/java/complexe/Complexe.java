package aiac.gi18.java.complexe;

public class Complexe implements Comparable<Complexe> {

	private double reel;
	private double img;
	
	private static int compteur=0;
	
	{
		compteur++;
	}
	
	public double getImg() {
		return img;
	}
	
	public double getReel() {
		return reel;
	}


	public Complexe() {
		this(0, 0);
	}

	public Complexe(double reel) {
		this(reel, 0);
	}

	public Complexe(double reel, double img) {
		this.reel = reel;
		this.img = img;
	}

	public Complexe multiply(double scalar) {
		Complexe ret = new Complexe();
		ret.reel = this.reel * scalar;
		ret.img = this.img * scalar;
		return ret;
		// return new Complexe(this.reel*scalar,this.img*scalar);
	}

	public Complexe add(Complexe c) {
		return add(c.reel, c.img);
	}

	public Complexe add(double reel, double img) {
		return new Complexe(this.reel + reel, this.img + img);
	}

	public Complexe sub(Complexe c) {
		return add(-c.reel, -c.img);
	}

	public Complexe mul(Complexe c) {
		Complexe ret = new Complexe();
		ret.reel = this.reel * c.reel - this.img * c.img;
		ret.img = this.reel * c.img + this.img * c.reel;
		return ret; 
		
	}

	public static Complexe add(Complexe c1,Complexe c2) {
			return c1.add(c2);
	}
	
	public static int createdComplexe() {
		return compteur;
	}
	
	
	public String toString()
	{
		return this.reel+ " + i"+this.img;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (! (obj instanceof Complexe) ){
			return false;
		}
	return	((Complexe)obj).img==this.img && ((Complexe)obj).reel==this.reel;
	}

	@Override
	public int compareTo(Complexe o) {
		
		if(this.reel==o.reel) return 0;
		if(this.reel>o.reel) return 1;
		return -1;
	}
	
}
