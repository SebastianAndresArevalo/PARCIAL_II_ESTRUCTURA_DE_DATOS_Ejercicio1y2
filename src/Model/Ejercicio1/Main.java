package Model;

public class Main {

    public static void main(String[] args) {

        Pila<Operacion> historial = new Pila<Operacion>();

        historial.push(new Operacion("O1", Estado.ANULADA));
        historial.push(new Operacion("O2", Estado.CONFIRMADA));
        historial.push(new Operacion("O3", Estado.CONFIRMADA));
        historial.push(new Operacion("O4", Estado.ANULADA));
        historial.push(new Operacion("O5", Estado.CONFIRMADA));

        Pila<Operacion> resultado = Ejercicio1.obtenerUltimasConfirmadas(historial, 2);

        System.out.println("Resultado (tope -> fondo):");
        resultado.imprimir();

        System.out.println("Historial original (tope -> fondo):");
        historial.imprimir();
    }
}