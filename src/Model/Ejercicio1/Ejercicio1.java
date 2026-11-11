package Model;

public class Ejercicio1 {

    /**
     * Retorna una pila con las n operaciones confirmadas más recientes.
     * La pila original queda con los mismos elementos en el mismo orden.
     * @param historial pila con el historial (tope = operación más reciente)
     * @param n cantidad de operaciones confirmadas a obtener
     * @return nueva pila con la operación más reciente en el tope
     */
    public static Pila<Operacion> obtenerUltimasConfirmadas(Pila<Operacion> historial, int n) {

        Pila<Operacion> resultado = new Pila<>();

        if (n <= 0) {
            return resultado;
        }

        Pila<Operacion> respaldo = new Pila<>();   // para restaurar el historial
        Pila<Operacion> invertida = new Pila<>();  // confirmadas en orden inverso
        int seleccionadas = 0;

        // 1. Recorrer el historial de tope a fondo
        while (!historial.estaVacia()) {
            Operacion op = historial.pop();
            respaldo.push(op);

            if (seleccionadas < n && op.getEstado() == Estado.CONFIRMADA) {
                invertida.push(op);
                seleccionadas++;
            }
        }

        // 2. Restaurar el historial original
        while (!respaldo.estaVacia()) {
            historial.push(respaldo.pop());
        }

        // 3. Invertir para dejar la más reciente en el tope
        while (!invertida.estaVacia()) {
            resultado.push(invertida.pop());
        }

        return resultado;
    }
}