package Clases;

public class Sucursal {

    private int id_sucursal;
    private int id_comuna;
    private String nombre_sucursal;
    private String direccion_sucursal;
    private String correo_sucursal;

    public Sucursal() {

    }

    public Sucursal(int id_sucursal, String nombre_sucursal, String direccion_sucursal, String correo_sucursal) {
        this.id_sucursal = id_sucursal;
        this.nombre_sucursal = nombre_sucursal;
        this.direccion_sucursal = direccion_sucursal;
        this.correo_sucursal = correo_sucursal;
    }

    public String getNombre_sucursal() {
        return nombre_sucursal;
    }

    public void setNombre_sucursal(String nombre_sucursal) {
        this.nombre_sucursal = nombre_sucursal;
    }

    public String getCorreo_sucursal() {
        return correo_sucursal;
    }

    public void setCorreo_sucursal(String correo_sucursal) {
        this.correo_sucursal = correo_sucursal;
    }

    public String getDireccion_sucursal() {
        return direccion_sucursal;
    }

    public void setDireccion_sucursal(String direccion_sucursal) {
        this.direccion_sucursal = direccion_sucursal;
    }

    public int getId_sucursal() {
        return id_sucursal;
    }

    public void setId_sucursal(int id_sucursal) {
        this.id_sucursal = id_sucursal;
    }

    public int getId_comuna() {
        return id_comuna;
    }

    public void setId_comuna(int id_comuna) {
        this.id_comuna = id_comuna;
    }

    public String toString() {
        return this.nombre_sucursal;
    }

}
