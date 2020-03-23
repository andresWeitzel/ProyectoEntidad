
package mypackage.entities;


public class Paciente {
    
    private String id;
    private String nombre;
    private String direccion;
    private String telefono;
    private Receta receta;

    public Paciente(String id, String nombre, String direccion, String telefono,String nroCodigo) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        receta=new Receta(nroCodigo,"Electrocardiograma c/informe");
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public Receta getReceta() {
        return receta;
    }

    @Override
    public String toString() {
        return "Paciente{" + "id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + receta + '}';
    }


}
