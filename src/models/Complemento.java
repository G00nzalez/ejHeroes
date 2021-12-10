package models;

public class Complemento {

    //ATRIBUTOS
    private String nombre;
    private String aspecto;
    private int vida;
    private int fuerza;
    private int defensa;
    private int velocidad;


    //CONSTRUCTOR
    public Complemento(String nombre, String aspecto, int vida, int fuerza, int defensa, int velocidad) {
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


    //OTROS METODOS


    @Override
    public String toString() {
        return "Complemento " + nombre + '\n' +
                "aspecto: " + aspecto + '\n' +
                "vida: " + vida + '\n' +
                "fuerza: " + fuerza + '\n' +
                "defensa: " + defensa + '\n' +
                "velocidad: " + velocidad;
    }
}



