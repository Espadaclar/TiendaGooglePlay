/**
 *franciscoJavier
 */
class ProductoMultimedia extends Producto{
    private String titulo;
    private int anioCreacio;

    public ProductoMultimedia(String name, int anioCreacio) {
        super(name);
        this.titulo = titulo;
        this.anioCreacio = anioCreacio;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return anioCreacio;
    }

    @Override
    public String toString() {
        String datos = "";
        datos += "Título del libro: " +titulo+ "\n";
        datos += "Año de edición: " +anioCreacio+ "\n";
        return datos;
    }
    
    
}