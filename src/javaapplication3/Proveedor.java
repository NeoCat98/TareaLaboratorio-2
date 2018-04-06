package javaapplication3;

/**
 *
 * @author javier
 */
public class Proveedor {
    String nombre;
    String empresa;
    String administrador;
    String telefono;
    
    public Proveedor(){
        
    }
    public Proveedor(String nombre,String empresa, String administrador, String telefono){
        this.nombre = nombre;
        this.empresa = empresa;
        this.administrador = administrador;
        this.telefono = telefono;
    }
    
    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEmpresa(String empresa){
        this.empresa = empresa;
    }
    public void setAdministrador(String administrador){
        this.administrador = administrador;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    //Getters
    public String getNombre(){
        return nombre;
    }
    public String getEmpresa(){
        return empresa;
    }
    public String getAdministrador(){
        return administrador;
    }
    public String getTelefono(){
        return telefono;
    }
}
