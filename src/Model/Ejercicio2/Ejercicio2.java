package Model.Ejercicio2;

public class Ejercicio2 {

    public static <T> Pila<T> obtenerSegmento(Pila<T> pila, int inicio, int fin) {

        Pila<T> resultado = new Pila<>();

        if (inicio < 1 || inicio > fin) {
            return resultado;
        }

        Pila<T> respaldo = new Pila<>();
        Pila<T> invertida = new Pila<>();
        int posicion = 0;

        while (!pila.estaVacia()) {
            T elemento = pila.pop();
            posicion++;
            respaldo.push(elemento);

            if (posicion >= inicio && posicion <= fin) {
                invertida.push(elemento);
            }
        }

        int total = posicion;

        while (!respaldo.estaVacia()) {
            pila.push(respaldo.pop());
        }

        if (fin > total) {
            return resultado;
        }

        while (!invertida.estaVacia()) {
            resultado.push(invertida.pop());
        }

        return resultado;
    }
}