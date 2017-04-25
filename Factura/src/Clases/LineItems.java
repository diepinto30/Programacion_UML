package Clases;
public class LineItems {
    private int intCantidad;
    private Producto objProducto;

    public LineItems(int aintCantidad, Producto aobjProducto) {
        this.intCantidad = aintCantidad;
        this.objProducto = aobjProducto;
    }
    
    public double getPrecioTotal(){
        return objProducto.getDblPrecio() * intCantidad;
    }

    @Override
    public String toString() {
        return "LineItems{" + "intCantidad=" + intCantidad + ", objProducto=" 
                + objProducto.getDblPrecio() + "Precio Total=" + getPrecioTotal() + '\n';
    }
}
