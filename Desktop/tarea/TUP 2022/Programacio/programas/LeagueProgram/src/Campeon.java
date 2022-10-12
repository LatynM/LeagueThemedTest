import java.util.LinkedList;
import java.util.List;

public class Campeon {
    private String nombre;
    private String frase;
    private int precio;
    private int region;
    private int clase;
    private LinkedList<Item> build;

    public Campeon() {
    }

    public Campeon(String nombre, String frase, int precio, int clase, int region) {
        this.nombre = nombre;
        this.frase = frase;
        this.precio = precio;
        this.clase = clase;
        this.region = region;
        this.build = new LinkedList<Item>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getRegion() {
        return region;
    }

    public void setRegion(int region) {
        this.region = region;
    }

    public int getClase() {
        return clase;
    }

    public void setClase(int clase) {
        this.clase = clase;
    }

    public LinkedList<Item> getBuild() {
        return build;
    }

    public void mostrarBuild() {
        System.out.println("OBJETOS DE "+this.nombre);
        for (Item objeto : build) {
            System.out.println("-" + objeto.toString());
        }
    }

    public void agregarItem(Item objeto){
        build.add(objeto);
    }

    @Override
    public String toString() {
        return "Campeon{" +
                "nombre='" + nombre + '\'' +
                ", frase='" + frase + '\'' +
                ", precio=" + precio +
                ", region=" + region +
                ", clase=" + clase +
                ", build=" + build +
                '}';
    }
}
