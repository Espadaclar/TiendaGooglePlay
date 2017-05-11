/**
 *franciscoJavier
 */
public class Aplicacion extends Producto{
     private double espacioQueOcupa;
     public Categoria categoria;

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

    @Override
    public String toString() {
        String datos ="";
        datos += espacioQueOcupa +"\n";
        return datos;
    }
    
    
     
     
}
