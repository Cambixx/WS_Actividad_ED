
public class Calculadora {

	public static void main(String[] args) {
		System.out.println("-----------------------------------SUMA-----------------------------------");
		Suma sum1 = new Suma();
		System.out.println(sum1.sumaDosReales(5.14, 4));
		System.out.println(sum1.sumaDosEnteros(7, -2));
		System.out.println(sum1.sumaTresReales(-3, -20, -5.5));
		Suma sum2 = new Suma();
		sum2.guardarValorAcumulado(5);
		sum2.guardarValorAcumulado(55);
		sum2.guardarValorAcumulado(-5);
		System.out.println(sum2.getValorAcumulado());
		
		System.out.println("-----------------------------------RESTA-----------------------------------");
		
		
		System.out.println("-----------------------------------PRODUCTO-----------------------------------");
		Producto p1 = new Producto();
		System.out.println(p1.ProductoReales(73.1, 84));
		System.out.println(p1.ProductoEnteros(2, 7));
		System.out.println(p1.ProductoTresReales(7.2315, 3.64, 8.64));
		System.out.println(p1.Potencia(2.54, 9.4));
		
		System.out.println("-----------------------------------COCIENTE-----------------------------------");
		Cociente c = new Cociente();
		System.out.println(c.divisionReales(8.5, 4.3));
		System.out.println(c.divisionEnteros(4, 5));
		System.out.println(c.inverso(18));
		System.out.println(c.raiz(25));
		
	}

}
