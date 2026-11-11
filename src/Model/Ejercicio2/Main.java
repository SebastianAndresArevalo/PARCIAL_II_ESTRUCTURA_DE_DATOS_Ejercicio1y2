package Model.Ejercicio2;

public class Main {

    public static void main(String[] args) {

        Pila<String> pila = new Pila<String>();

        pila.push("A1");
        pila.push("A2");
        pila.push("A3");
        pila.push("A4");
        pila.push("A5");
        pila.push("A6");

        Pila<String> resultado = Ejercicio2.obtenerSegmento(pila, 2, 4);

        System.out.println("Resultado (tope -> fondo):");
        resultado.imprimir();

        System.out.println("Pila original (tope -> fondo):");
        pila.imprimir();
    }
}