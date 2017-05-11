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
