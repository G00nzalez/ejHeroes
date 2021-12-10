package models;

public class Heroe {

    //ATRIBUTOS
    private String nombre;
    private String aspecto;
    private int vida;
    private int fuerza;
    private int defensa;
    private int velocidad;
    Complemento Complemento;
    private int vidaTotal;
    private int fuerzaTotal;
    private int defensaTotal;
    private int velocidadTotal;

    //CONSTRUCTOR
    public Heroe(String nombre, String aspecto, int vida, int fuerza, int defensa, int velocidad) {
        this.nombre = nombre;
        this.aspecto = aspecto;
        this.vida = vida;
        this.fuerza = fuerza;
        this.defensa = defensa;
        this.velocidad = velocidad;
    }

    //GET Y SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAspecto() {
        return aspecto;
    }

    public void setAspecto(String aspecto) {
        this.aspecto = aspecto;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public models.Complemento getComplemento() {
        return Complemento;
    }

    public void setComplemento(models.Complemento complemento) {
        Complemento = complemento;
    }

    public int getVidaTotal() {
        return vidaTotal;
    }

    public int getFuerzaTotal() {
        return fuerzaTotal;
    }

    public int getDefensaTotal() {
        return defensaTotal;
    }

    public int getVelocidadTotal() {
        return velocidadTotal;
    }
//OTROS METODOS

    public void calcularVidaTotal (){
        if (Complemento != null) {
            vidaTotal = vida + Complemento.getVida();
            return;
        }
        vidaTotal = vida;
    }

    public void calcularFuerzaTotal (){
        if (Complemento != null) {
            fuerzaTotal = fuerza + Complemento.getFuerza();
            return;
        }
        fuerzaTotal = fuerza;
    }

    public void calcularDefensaTotal (){
        if (Complemento != null) {
            defensaTotal = defensa + Complemento.getDefensa();
            return;
        }
        defensaTotal = defensa;
    }

    public void calcularVelocidadTotal (){
        if (Complemento != null) {
            velocidadTotal = velocidad + Complemento.getVelocidad();
            return;
        }
        velocidadTotal = velocidad;
    }

    public boolean estaVivo (){
        if (vidaTotal >0) return true;
        return false;
    }






    @Override
    public String toString() {
        return "Heroe "+ nombre + "\n" +
                "aspecto: " + aspecto + "\n" +
                "vida: " + vida +"\n" +
                "fuerza: " + fuerza +"\n" +
                "defensa: " + defensa +"\n" +
                "velocidad: " + velocidad +"\n" +
                "fuerzaTotal: " + fuerzaTotal +"\n" +
                "defensaTotal: " + defensaTotal +"\n" +
                "velocidadTotal: " + velocidadTotal +"\n" +
                "vidaTotal: " + vidaTotal;
    }

}
