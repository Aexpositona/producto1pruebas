package producto1_FP058_SanchezCervantesAitor;

import java.time.LocalDate;

public class Excursiones {

    private String codigo;
    private String descripcion;
    private LocalDate fecha;
    private int duracion;
    private double precio;

    //Métodos constructores
    /**
     * Método constructor de la clase Excursiones que recibe por parámetros el código, la descripción, la fecha, la duración y el precio de la excursión
     * @param codigo es el código de la excursión
     * @param descripcion es la descripción de la excursión
     * @param fecha es la fecha de la excursión
     * @param duracion es la duración de la excursión
     * @param precio es el precio de la excursión
     */
    public Excursiones (String codigo, String descripcion, LocalDate fecha, int duracion, double precio){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.duracion = duracion;
        this.precio = precio;
    }

    /**
     * Método constructor por defecto para generar sobrecarga de constructores
     */
    public Excursiones (){

    }

    //Métodos Getters
    /**
     * Método get() de la clase Excursiones que nos devuelve el código de la excursión
     * @return El código de la excursión
     */
    public String getCodigo(){
        return codigo;
    }

    /**
     * Método get() de la clase Excursiones que nos devuelve la descripción de la excursión
     * @return La descripción de la excursión
     */
    public String getDescripcion(){
        return descripcion;
    }

    /**
     * Método get() de la clase Excursiones que nos devuelve la fecha de la excursión
     * @return La fecha de la excursión
     */
    public LocalDate getFecha(){
        return fecha;
    }

    /**
     * Método get() de la clase Excursiones que nos devuelve la duración de la excursión
     * @return La duración de la excursión
     */
    public int getDuracion(){
        return duracion;
    }

    /**
     * Método get() de la clase Excursiones que nos devuelve el precio de la excursión
     * @return El precio de la excursión
     */
    public double getPrecio(){
        return precio;
    }

    //Métodos Setters
    /**
     * Método set() de la clase Excursiones que nos permite definir el código de la excursión
     * @param codigo Es el código de la excursión
     */
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    /**
     * Método set() de la clase Excursiones que nos permite definir la descripción de la excursión
     * @param descripcion Es la descripción de la excursión
     */
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    /**
     * Método set() de la clase Excursiones que nos permite definir la fecha de la excursión
     * @param fecha Es la fecha de la excursión
     */
    public void setFecha(LocalDate fecha){
        this.fecha = fecha;
    }

    /**
     * Método set() de la clase Excursiones que nos permite definir la duración de la excursión
     * @param duracion Es la duración de la excursión
     */
    public void setDuracion(int duracion){
        this.duracion = duracion;
    }

    /**
     * Método set() de la clase Excursiones que nos permite definir el precio de la excursión
     * @param precio Es el precio de la excursión
     */
    public void setPrecio(double precio){
        this.precio = precio;
    }

    //Método toString
    /**
     * Método toString de la clase Excursiones que nos devuelve los datos de la excursión
     * @return El código, la descripción, la fecha, la duración y el precio de la excursión
     */
    @Override
    public String toString(){
        return "Código: " + codigo + "\nDescripción: " + descripcion + "\nFecha: " + fecha + "\nDuración: " + duracion + "\nPrecio: " + precio;
    }
}
