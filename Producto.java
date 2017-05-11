
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Producto
{
    private String name;
    private double precio;
    private int vecesVendido;

    public Producto(String name){
        this.name = name;   
        this.precio = precio;
        vecesVendido = 0;
    }
    
    
    public String getName(){
        return name;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public int getVecesVendido(){
        return vecesVendido;
    }
}
