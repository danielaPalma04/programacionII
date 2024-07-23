package ejemplo1;

public abstract class Personaje {
    private String nombre;
    private String descripcion;
    private long tamano;
    private int poder;
    private int vida;

    public abstract void desplazarse();
    public abstract void mostrarVida();
    public abstract void mostrarPoder();
}
