package producto1_FP058_SanchezCervantesAitor;


public class SociosFederados extends Socios {

    private String nif;
    private Federaciones federaciones;


    // Constructores
    /**
     * Metodo constructor de la clase SociosStandard que recibe como parámetros el nombre, el número, el NIF y la federación a la que pertenece el socio
     * @param nombre es el nombre del socio
     * @param numero es el numero del socio
     * @param nif es el NIF del socio
     * @param federaciones es la federación a la que pertenece el socio
     */
    public SociosFederados(String nombre, int numero, String nif, Federaciones federaciones) {
        super(nombre, numero);
        this.nif = nif;
        this.federaciones = federaciones;

    }

    /**
     * Método constructor por defecto para generar sobrecarga de constructores
     */
    public SociosFederados() {

    }

    // Métodos Getters
    /**
     * Método get() de la clase SociosStandard que nos devuelve el NIF del socio
     * @return El NIF del socio
     */
    public String getNif() {
        return nif;
    }

    /**
     * Método get() de la clase SociosStandard que nos devuelve la federación a la que pertenece el socio
     * @return La federación a la que pertenece el socio
     */
    public Federaciones getFederaciones() {
        return federaciones;
    }

    // Métodos Setters
    /**
     * Método set() de la clase SociosStandard que nos permite definir el NIF del socio
     * @param nif Es el NIF del socio
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * Método set() de la clase SociosStandard que nos permite definir la federación a la que pertenece el socio
     * @param federaciones Es la federación a la que pertenece el socio
     */
    public void setFederaciones(Federaciones federaciones) {
        this.federaciones = federaciones;
    }

    /**
     * Metodo toString() de la clase SociosStandard que nos devuelve un String con los datos del socio
     * @return Un String con los datos del socio, como el nombre, el número, el tipo de socio, el NIF y la federación a la que pertenece
     */
    @Override
    public String toString() {
        return super.toString() + "Tipo de socio: Standard \n"  + "NIF: " + nif + "\n" + "Federación: " + federaciones + "\n";
    }
}

