import models.Caja;
import models.Par;

public class App {
    public static void main(String[] args)  {
        System.out.println("=== PRÁCTICA DE CLASES GENÉRICAS ===");
       

        final Caja<String> cajaTexto = new Caja<>();
        final Caja<Integer> cajaEntero = new Caja<>();
        final Caja<Double> cajaDecimal = new Caja<>();
        System.out.println("\n--- Uso de Caja <T> ---");
        cajaTexto.guardar("Hola mundo");
        cajaEntero.guardar(100);
        cajaDecimal.guardar(9.75);

        System.out.println("Caja de texto: " + cajaTexto.obtener());
        System.out.println("Caja de entero: " + cajaEntero.obtener());
        System.out.println("Caja de decimal: " + cajaDecimal.obtener());
        System.out.println("¿ La caja de texto esta vacia? : " + cajaTexto.estaVacio());

        System.out.println("\n--- Uso de Par<K, V> ---");

        Par<Integer, String> par1 = new Par<>(1, "Juan Pérez");
        Par<String, Integer> par2 = new Par<>("Edad", 20);
        Par<String, Double> par3 = new Par<>("Promedio", 8.75);

        System.out.println("Clave: " + par1.getClave()+ " | Valor: " + par1.getValor());
        System.out.println("Clave " + par2.getClave()+ " | Valor: " + par2.getValor());
        System.out.println("Clave " + par3.getClave()+ " | Valor: " + par3.getValor());
    }
}

