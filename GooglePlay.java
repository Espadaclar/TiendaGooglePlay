import java.util.ArrayList;

/**
 *
 * @author alumno
 */
class GooglePlay {
    private ArrayList<Usuario> usuario;
    private ArrayList<Producto> producto;

    public GooglePlay(){
        usuario = new ArrayList<>();;
        producto = new ArrayList<>();
    }

    public int getNumeroUsuarios(){
        return usuario.size();
    } 

    public int getNumeroProductos(){
        return producto.size();
    } 

    public void addProducto(Producto produc){
        producto.add(produc);
    }

    public void addUsuario(Usuario usu){
        usuario.add(usu);
    }

    public double comprar(String usuar, String nameProducto){
        double precio = -1;
        for(Usuario usu: usuario){
            if(usu.getNombreCuenta().equals(usuar) ){
                for(Producto produc: producto){
                    if(produc.getName().equals(nameProducto)){
                        precio = produc.getPrecio();
                        produc.aumentarVecesVendido();
                    }
                }
            }
        }
        return precio;
    }
}

