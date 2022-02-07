
public class Calculadora {

	public static void main(String[] args) {
		System.out.println("-----------------------------------SUMA-----------------------------------");
		
		
		System.out.println("-----------------------------------RESTA-----------------------------------");
		
		
		System.out.println("-----------------------------------PRODUCTO-----------------------------------");
		Producto p1 = new Producto();
		System.out.println(p1.ProductoReales(73.1, 84));
		System.out.println(p1.ProductoEnteros(2, 7));
		System.out.println(p1.ProductoTresReales(7.2315, 3.64, 8.64));
		System.out.println(p1.Potencia(25578, 995));
		
		System.out.println("-----------------------------------COCIENTE-----------------------------------");
	}

}
