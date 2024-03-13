package producto1_FP058_SanchezCervantesAitor;

public class SociosStandard extends Socios {

    private String nif;
    private Seguros seguro;

    //Métodos constructores

    /**
     * Método constructor de la clase SociosFederados que recibe como parámetros el nombre, el número, el NIF y el seguro del socio
     * @param nombre es el nombre del socio
     * @param numero es el número del socio
     * @param nif es el NIF del socio
     * @param Seguro es el seguro del socio
     */
    public SociosStandard(String nombre, int numero, String nif, Seguros Seguro) {
        super(nombre, numero);
    }

    /**
     * Método constructor por defecto para generar sobrecarga de constructores
     */
    public SociosStandard() {
        super();

    }

    //Métodos Getters
    public String getNif(){
        return nif;
    }

    public Seguros getSeguro(){
        return seguro;
    }

    //Métodos Setters
    public void setNif(String nif){
        this.nif = nif;
    }

    public void setSeguro(Seguros seguro){
        this.seguro = seguro;
    }

    /**
     * Método toString() de la clase SociosFederados que nos devuelve un String con los datos del socio
     * @return El nombre, el número del socio, el tipo de socio y el seguro que tiene contratado
     *
     */
    @Override
    public String toString(){
        return super.toString() + "Tipo de socio: Federado\n" + "NIF: " + nif + "\n" + "Seguro: " + seguro + "\n";
    }
}