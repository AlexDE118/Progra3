package pos.logic;


import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlIDREF;

public class Producto {
    //=============== Attributos ===============//
    @XmlID
    private String ID;
    private String Nombre;
    @XmlIDREF
    //private Categoria categoria;
    private String unidadMedida;
    private int existencias;
    //=============== Constructor ===============//

    public Producto(){
        this.ID = "";
        this.Nombre = "";
        this.unidadMedida = "";
        this.existencias = 0;
        //this.categoria = NULL;
    }

    public Producto(String ID, String Nombre, String unidadMedida, int existencias) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.unidadMedida = unidadMedida;
        this.existencias = existencias;
    }


    //=============== Set ===============//

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

//    public void setCategoria(Categoria categoria) {
//        this.categoria = categoria;
//    }

    //=============== Get ===============//

    public String getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public int getExistencias() {
        return existencias;
    }

//    public Categoria getCategoria() {
//        return categoria;
//           }

    //=============== Metodos ===============//


}
