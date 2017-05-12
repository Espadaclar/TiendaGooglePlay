/**
 *franciscoJavier
 */
public class Aplicacion extends Producto{
     private double espacioQueOcupa;
     private Categoria categoria;

    public Aplicacion(String name, double espacioQueOcupa,  Categoria categoria) {
        super(name);
        this.espacioQueOcupa = espacioQueOcupa;
        this.categoria = categoria;
    }

    public double getTamanoEnMB() {
        return espacioQueOcupa;
    }

    public String getCategoria(){
         String categoria = "";
        String nombreCategoria = this.categoria.name();
        
        switch (nombreCategoria){
            case "JUEGOS":
            categoria = "Juegos";
            break;
            case "COMUNICACIONES":
            categoria = "Comunicaciones";
            break;
            case "PRODUCTIVIDAD":
            categoria = "Productividad";
            break;
            case "MULTIMEDIA":
            categoria = "Multimedia";
            break;
        }
        
        return categoria;
    }
     
    public String getNombre(){
        return getName();
    }

    
    public  double getPrecio(){
        double precio = -1;
        if(getVecesVendido() >= 2){
            if(getCategoria().equals("Juegos")){
                precio = 5;
            }
            else if(getCategoria().equals("Comunicaciones")){
                precio = 2;
            }
            else if(getCategoria().equals("Productividad")){
                precio = 10;
            }
            else if(getCategoria().equals("Multimedia")){
                precio = 2;
            }
        }
        else{
            precio = 0.99;
        }
        return precio;
    }
    @Override
    public String toString() {
        String datos ="";
        datos += espacioQueOcupa +"\n";
        return datos;
    }
    
    
     
     
}
