package Clases;

/**
 *
 * @author Jorge
 */
public class Cliente {
    
    private int id_cliente;
    private int id_comuna;
    private String rut_cliente;
    private String nombre_cliente;
    private String app_cliente;
    private String apm_cliente;
    private String direccion_cliente;
    private String correo_cliente;

    public Cliente() {
    }

    public Cliente(int id_cliente, String rut_cliente, String nombre_cliente, String app_cliente, String apm_cliente, String direccion_cliente, String correo_cliente) {
        this.id_cliente = id_cliente;
        this.rut_cliente = rut_cliente;
        this.nombre_cliente = nombre_cliente;
        this.app_cliente = app_cliente;
        this.apm_cliente = apm_cliente;
        this.direccion_cliente = direccion_cliente;
        this.correo_cliente = correo_cliente;
    }

    public String getCorreo_cliente() {
        return correo_cliente;
    }

    public void setCorreo_cliente(String correo_cliente) {
        this.correo_cliente = correo_cliente;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_comuna() {
        return id_comuna;
    }

    public void setId_comuna(int id_comuna) {
        this.id_comuna = id_comuna;
    }

    public String getRut_cliente() {
        return rut_cliente;
    }

    public void setRut_cliente(String rut_cliente) {
        this.rut_cliente = rut_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getApp_cliente() {
        return app_cliente;
    }

    public void setApp_cliente(String app_cliente) {
        this.app_cliente = app_cliente;
    }

    public String getApm_cliente() {
        return apm_cliente;
    }

    public void setApm_cliente(String apm_cliente) {
        this.apm_cliente = apm_cliente;
    }

    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }
    
    public String toString(){
        return this.nombre_cliente+" "+this.app_cliente+" "+this.apm_cliente;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
