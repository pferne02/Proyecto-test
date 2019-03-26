package es.unileon.prg.tema10.ejemplo;

public class MainEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola");
		
		Fecha miFecha = new Fecha();
		
		int valor = miFecha.getDay();
		miFecha.setYear(2019);
		
		System.out.println(valor);
		
	}

}
