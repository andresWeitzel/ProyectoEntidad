/*
PROYECTO ENTIDAD RELACION
*/
package mypackage.test;

import java.util.List;
import mypackage.entities.Medico;
import mypackage.entities.Paciente;
import mypackage.entities.Receta;


public class Test {

    
    public static void main(String[] args) {
        System.out.println("\n////INFORMACION DE RECETAS////");
        
        System.out.println("\n--Receta nro1--");
        
        Receta receta1=new Receta("01AT", "Tomagrafia Computarizada");
        receta1.descuentoReceta('A');
        receta1.precioFinalReceta(234);
        
        System.out.println(receta1);
     
        
        
         System.out.println("\n--Receta nro2--");
        
        Receta receta2=new Receta("02AT", "Electrocardiograma s/Informe");
        receta2.descuentoReceta('B');
        receta2.precioFinalReceta(140);
        
        System.out.println(receta2);
        
        
        System.out.println("\n--Paciente nro1--");
        
        Paciente paciente1=new Paciente("Pac1", "Jaime","LaPrimavera123", "1267561","03AT");
        paciente1.getReceta().descuentoReceta('A');
        paciente1.getReceta().precioFinalReceta(1290);
        System.out.println(paciente1);
        
        
        System.out.println("\n--Medico nro1--");
        Medico medico1=new Medico("Med1","Norberto","Traumatologia");
        
        List<Receta> recetas=medico1.getRecetas();
        
        recetas.add(new Receta("04AT","Resonancia Magnetica Tobillo"));
        recetas.add(new Receta("05AT","Resonancia Magnetica Mano"));
        recetas.add(new Receta("06AT","Kinesiologia"));
        
        recetas.get(0).descuentoReceta('B');
        recetas.get(0).precioFinalReceta(230);
        
        recetas.get(1).descuentoReceta('B');
        recetas.get(1).precioFinalReceta(389);
        
        recetas.get(2).descuentoReceta('C');
        recetas.get(2).precioFinalReceta(789);
        
         System.out.println(medico1);
        
        for(int a=0; a<recetas.size(); a++){
            System.out.println(recetas.get(a));
        }
       
        
        
        
    
    }
    
}
