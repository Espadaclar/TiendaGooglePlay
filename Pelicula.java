/**
 *franciscoJavier
 */
class Pelicula extends ProductoMultimedia{
    
    private int duracion;
    private int calidadFull;
    
    public Pelicula(String name, int anioCreacio,  int duracion, int calidadFull) {
        super( name,  anioCreacio);
        this.duracion = duracion;
        this.calidadFull = calidadFull;
        
        
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public  double getPrecio(){
         double precio = 0;
        if(getCalidad().equals("FullHD")){
            precio = 10;
        }
        else if(getCalidad().equals("HD")){
            precio = 5;
        }
        
        if(getAno() < 2000){
            precio = precio /2;
        }
        return precio;
    }
    
    public String getCalidad() {
        String calidad = "FullHD";
        if(calidadFull != 1080){
            calidad = "HD";
        }
        return calidad;
    }

    @Override
    public String toString() {
        String datos = super.toString();
        datos += "Duración de la pélicula: " +duracion+ "\n";
        datos += "calidad Full " +getCalidad()+ "\n";
        
        
        return datos;
    }
    
    
}
