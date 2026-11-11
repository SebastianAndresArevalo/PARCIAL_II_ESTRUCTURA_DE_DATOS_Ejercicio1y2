package Model;

public class Operacion {

    private String codigo;
    private Estado estado;

    public Operacion() {
        this.codigo = "";
        this.estado = Estado.ANULADA;
    }

    public Operacion(String codigo, Estado estado) {
        this.codigo = codigo;
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return codigo + " (" + estado + ")";
    }
}