package producto1_FP058_SanchezCervantesAitor;

public class Seguros {

    private String codigo;
    private String descripcion;
    private double precio;
    TipoBasico seguroBasico;
    TipoCompleto seguroCompleto;

    public Seguros(String codigo, String descripcion, double precio, TipoBasico seguroBasico) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.seguroBasico = seguroBasico;

    }

    public Seguros(String codigo, String descripcion, double precio, TipoCompleto seguroCompleto) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.seguroCompleto = seguroCompleto;

    }

    public Seguros() {
    }

}
