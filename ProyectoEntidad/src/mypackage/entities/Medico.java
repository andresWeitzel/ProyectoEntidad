
package mypackage.entities;

import java.util.ArrayList;
import java.util.List;


public class Medico {
    private String id;
    private String nombre;
    private String area;
    private List<Receta> recetas;

    public Medico(String id, String nombre, String area) {
        this.id = id;
        this.nombre = nombre;
        this.area = area;
        this.recetas=new ArrayList();
        
        
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getArea() {
        return area;
    }

    public List<Receta> getRecetas() {
        return recetas;
    }

    @Override
    public String toString() {
        return "Medico{" + "id=" + id + ", nombre=" + nombre + ", area=" + area + ", recetas=" + recetas + '}';
    }
    
    
}
