package javaapplication3;

/**
 *
 * @author javier
 */
public class Producto {
    
    String nombre;
    String codigo;
    String Proveedor;
    float costo;
    int cantidad;
    
    public Producto(){
    }
    
    //setters 0
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCodigo(String codigo){
     this.codigo = codigo;   
    }
    public void setProveedor(String proveedor){
        this.Proveedor = proveedor;
    }
    public void setCosto(float costo){
        this.costo = costo;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    //getters
    public String getNombre(){
        return nombre;
    }
    public String getCodigo(){
        return codigo;
    }
    public String getProveedor(){
        return Proveedor;
    }
    public float getCosto(){
        return costo;
    }
    public int getCantidad(){
        return cantidad;
    }
}