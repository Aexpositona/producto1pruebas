package producto1_FP058_SanchezCervantesAitor;

public class SociosInfantiles extends Socios{

    private String nifPadre;

    //Métodos constructores
    /**
     * Método constructor de la clase SociosInfantiles que recibe por parámetros el nombre, el número y el NIF del padre
     * @param nombre es el nombre del socio
     * @param numero es el número del socio
     * @param nifPadre es el NIF del padre
     */
    public SociosInfantiles(String nombre, int numero, String nifPadre){
        super(nombre, numero);
        this.nifPadre = nifPadre;
    }

    /**
     * Método constructor por defecto para generar sobrecarga de constructores
     */
    public SociosInfantiles(){

    }

    /**
     * Método get() de la clase SociosInfantiles que nos devuelve el NIF del padre
     * @return El NIF del padre
     */
    //Métodos Getters
    public String getnifPadre(){
        return nifPadre;
    }

    //Métodos Setters

    /**
     * Método set() de la clase SociosInfantiles que nos permite definir el NIF del padre
     * @param nifPadre Es el NIF del padre
     */
    public void setNifPadre(String nifPadre){
        this.nifPadre = nifPadre;
    }

    /**
     * Método toString() de la clase SociosInfantiles que nos devuelve un String los datos del socio
     * @return El nombre, el número del socio, el tipò de socio y el NIF del padre
     */
    @Override
    public String toString(){
        return super.toString() + "Tipo de socio: Infantil\n" + "NIF del padre: " + nifPadre + "}";
    }
}
