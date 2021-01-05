package Clases;

public class Comuna {

    private int id_comuna;
    private int id_ciudad;
    private String nombre;

    public Comuna(int id_comuna, String nombre) {
        this.id_comuna = id_comuna;
        this.nombre = nombre;
    }

    public Comuna() {
    }

    public int getId_comuna() {
        return id_comuna;
    }

    public void setId_comuna(int id_comuna) {
        this.id_comuna = id_comuna;
    }

    public int getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(int id_ciudad) {
        this.id_ciudad = id_ciudad;
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
