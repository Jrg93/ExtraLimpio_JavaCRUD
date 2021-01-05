package Clases;

public class Region {

    private int id_region;
    private String nombre;

    public Region(int id_region, String nombre) {
        this.id_region = id_region;
        this.nombre = nombre;
    }

    public Region() {
    }

    public int getId_region() {
        return id_region;
    }

    public void setId_region(int id_region) {
        this.id_region = id_region;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return this.nombre;
    }

}
