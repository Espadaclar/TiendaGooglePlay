
import java.util.ArrayList;
/**
 *franciscoJavier
 */
class Usuario {
    private String correoElectronico;
    private ArrayList<ProductoMultimedia> producto;

    public Usuario(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNombreCuenta() {
        return correoElectronico;
    }

    public void comprarProducto(ProductoMultimedia productoMultimedia){
        producto.add(productoMultimedia);
    }
    
    @Override
    public String toString() {
         String datos = "";
        datos += "Correo electronico. " +correoElectronico+ "\n";
        
        return datos;
    }
    
    
    
}