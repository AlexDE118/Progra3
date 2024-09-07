package pos.logic;

public class Cajero {
    //=============== Attributos ===============//
    private  String id;
    private String nombre;
    //=============== Constructor ===============//

    public Cajero() {
        this.id = "";
        this.nombre = "";
    }

    public Cajero(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    //=============== Set ===============//

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //=============== Get ===============//
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    //=============== Metodos ===============//

}
