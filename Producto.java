
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Producto
{
    private String name;
    private int vecesVendido;

    public Producto(String name){
        this.name = name;   
        vecesVendido = 0;
    }
    
    
    public String getName(){
        return name;
    }
 
   public abstract double getPrecio();
    
    public int getVecesVendido(){
        return vecesVendido;
    }
    
    public void aumentarVecesVendido(){
         vecesVendido ++;
    }
}
