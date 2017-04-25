
package Clases;

import java.util.ArrayList;

public class Factura {
    private Domicilio objDomicilio;
    private ArrayList<LineItems> lstItems;

    public Factura(Domicilio objDomicilio) {
        this.objDomicilio = objDomicilio;
        lstItems = new ArrayList<LineItems>();
    }
    
    public void AddProducto(Producto objProducto, int intCantidad){
        LineItems anItem = new LineItems(intCantidad, objProducto);
        lstItems.add(anItem);
    }
    
    private double getCantidadPendiente(){
        double dblMontoP =0;
        for (LineItems lineItems : lstItems) {
            dblMontoP = dblMontoP + lineItems.getPrecioTotal();
        }
        return dblMontoP;
    }

    @Override
    public String toString() {
        String strOutput = "Factura{" + "objDomicilio=" + objDomicilio.toString() + '}';
        for (LineItems lineItems : lstItems) {
            strOutput = strOutput + lineItems.toString() 
                    + "Cantidad Pendiente: " + getCantidadPendiente()+"\n";
        }
        return strOutput;
    }
}
