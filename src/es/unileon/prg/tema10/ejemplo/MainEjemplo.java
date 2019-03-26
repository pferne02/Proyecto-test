package es.unileon.prg.tema10.ejemplo;

public class MainEjemplo {

	public static void main(String[] args) {
		System.out.println("¡Hola!");
		
		Fecha miFecha = new Fecha();
		
		int dia = miFecha.getDay();
		int mes = miFecha.getMonth();
		int anyo = miFecha.getYear();
		
		
		System.out.println("La fecha de hoy es " + dia + "/" + mes + "/" + anyo + ".");
		
	}

}
