package aiac.gi18.java.complexe;

public class Main {

	public static void main(String[] args) {
		Complexe c1,c2,c3;
		c1=new Complexe(1, 2);
		c2=new Complexe(10);
		c3=new Complexe(-1, 4);
		
		System.out.println(c1);
		System.out.println(c2);
		
		Complexe c4=c1.multiply(5).add(c2.mul(c3).add(c1).mul(c3)) ;
		
		System.out.println(c4);
		System.out.println(Complexe.createdComplexe());
	}

}
