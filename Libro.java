/**
 *franciscoJavier
 */
class Libro extends ProductoMultimedia{
    
    private int numPaginas;
    private boolean sonDeFiccion;

    public Libro(String name, int anioCreacio, int numPaginas, boolean sonDeFiccion) {
        super(name, anioCreacio);
        this.numPaginas = numPaginas;
        this.sonDeFiccion = sonDeFiccion;
    }

    public int getNumeroPaginas() {
        return numPaginas;
    }

    public boolean getFiccion() {
        return sonDeFiccion;
    }

    @Override
    public  double getPrecio(){
        double precio = 0;
        precio = (numPaginas / 100) * (getAno() - 2010);
        if(precio < 0){
            precio = precio * (-1);
        }
        return precio;
    }
    
    @Override
    public String toString() {
        
        String datos = super.toString();
        datos += "Número de páginas: " +numPaginas+ "\n";
        datos += "Son de ficción " +getFiccion()+ "\n";
        return datos;
    }
     
    
}
