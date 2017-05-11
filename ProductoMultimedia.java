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

    @Override
    public String toString() {
        String datos = "";
        datos += "Título del libro: " +getName()+ "\n";
        datos += "Año de edición: " +anioCreacio+ "\n";
        return datos;
    }
    
    
}