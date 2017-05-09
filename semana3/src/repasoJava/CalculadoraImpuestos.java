package repasoJava;

public class CalculadoraImpuestos {

	public static void main(String[] args) {
		// Crear calculadora de iva y clacula el iva de 350.00
		System.out.println("el iva de 350.00 es " + calcularIva(350.00));
		//Crer calculadora que sque el ISR
		System.out.println("el isr de 10,000.00 es " + calcularISR(10000.00));
		//Crear claculadora de impuesto hotelero
		System.out.println("el impuesto de hotel que cuesta 1000 es " + calcularImpuestoHotelero(1000.00, 0.03));
		//crear calculadora del impuesto a bebidas etilicas
		System.out.println("el impuesto de del alcohol de una botella de 200.00 es " + calcularImpuestoAlcohol(200.00, 0.53));
		//crear una funcion para un impuesto cualquiera}
		System.out.println("El iva de 123.45 es " + calcularImpuestoCualquiera(123.45, 0.16));
		//Omar:  calcular impuesto de la cheve
		System.out.println("El impuesto de la cheve qu cuesta 120.00 es " + calcularImpuestoCheve(120.00));
		//sumar la edad de Teo y Omar
		System.out.println("la suma de las  edades de teo 36 y omar 42 es " + sumaDeLaEdadOmarTeo(36, 42));
		//restar la edad de teo a la de omar
		System.out.println("la resta de las edades de teo36 y omar 42 es " + restaLaEdadDeOmarTeo(36,42));
		//dividir x num por x num
		System.out.println("la division de los numero 145 y 200 es " + divisionEjem(145, 200));
		//multiplicar un par de numeros
		System.out.println("la multiplocaion de los numero 1000 y 300 es " + multiplicaXnumeros(1000, 300));
		
	
	}
	public static double calcularIva(double valor){
		double tasa = 0.16;
		double impuesto = valor * tasa;
		return impuesto;

	}

	public static double calcularISR(double valor){
		double tasa = 0.3;
		double impuesto = valor * tasa;
		return impuesto;


	}

	public static double calcularImpuestoCheve(double valor) {
		double tasa = 0.53;
		return calcularImpuestoCualquiera(valor, tasa );
	}
	public static double calcularImpuestoCualquiera(double valor, double tasa) {

		return valor * tasa;

	}

	public static double calcularImpuestoHotelero(double valor, double tasa) {
		return valor * tasa;

	}
	
	public static double calcularImpuestoAlcohol(double valor, double tasa){
		return valor * tasa;
		
	}
	public static int sumaDeLaEdadOmarTeo(int edadTeo, int edadOmar){
		return edadTeo + edadOmar;
		
	}
	public static int restaLaEdadDeOmarTeo(int edadTeo, int edadOmar){
		return edadTeo - edadOmar;
		
	}
	public static int divisionEjem(int valorDiv1, int valorDiv2){
		return valorDiv1 / valorDiv2;	
	}
	public static int multiplicaXnumeros(int num1, int num2){
		return num1 * num2;
		
			
	}
	
	
}

