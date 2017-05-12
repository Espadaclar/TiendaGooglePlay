/**
 *franciscoJavier
 */
class ProductoMultimedia extends Producto{
    
    private int anioCreacio;

    public ProductoMultimedia(String name, int anioCreacio) {
        super(name);
        this.anioCreacio = anioCreacio;
    }

    public String getTitulo() {
        return getName();
    }

    public int getAno() {
        return anioCreacio;
    }
    
    /**
     * no hace falta sobreescribir este mt, (como copilar�a, ponemos la c)a calse como abstrattral
     */
     public  double getPrecio(){
         double precio = 0;
        return precio;
    }
    
    @Override
    public String toString() {
        String datos = "";
        datos += "Título del libro: " +getName()+ "\n";
        datos += "Año de edición: " +anioCreacio+ "\n";
        return datos;
    }
    
    
}