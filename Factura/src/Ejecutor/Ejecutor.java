
package Ejecutor;

import Clases.Domicilio;
import Clases.Factura;
import Clases.Producto;

public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Domicilio objDomicilio = new Domicilio("UTPL","San Cayetano Alto", "LOja", "Ecuador");
        Factura objFactura = new Factura(objDomicilio);
        objFactura.AddProducto(new Producto("Componente1", 200),1);
        objFactura.AddProducto(new Producto("Componente2", 120),1);
        objFactura.AddProducto(new Producto("Componente3", 150),1);
        System.out.println(objFactura.toString());
    }
    
}
