
package Clases;

public class Domicilio {
    private String strNombre;
    private String strCalle;
    private String strCiudad;
    private String strEstado;

    public Domicilio(String astrNombre, String astrCalle, String astrCiudad, String astrEstado) {
        this.strNombre = astrNombre;
        this.strCalle = astrCalle;
        this.strCiudad = astrCiudad;
        this.strEstado = astrEstado;
    }

    @Override
    public String toString() {
        return "Domicilio{" + "strNombre=" + strNombre + ", strCalle=" + strCalle + ", strCiudad=" + strCiudad + ", strEstado=" + strEstado + '}';
    }
}
