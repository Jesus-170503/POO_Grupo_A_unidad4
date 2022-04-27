/*
 Esta Main class se utiliza para mostrar datos propuestos en la Java Class Datos
 */
package poo_4;

/**
 *
 * @author 3PY37LA_RS6
 */
public class DatosCorrida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       //Datos traidos con el constructor
       Datos alum1 = new Datos(); 
       System.out.println("Los datos de el alumno son");
       alum1.Datos("Jesus", "1234", "Sistemas", "POO", 2);
       alum1.imprime();
       
       //Datos asignados con setter y traidos con metodos 
       Datos alum2 = new Datos(); 
       System.out.println("\nLos datos de el alumno son");
       alum2.setNombre("Angel");
       alum2.setMatricula("123");
       alum2.setCarrera("Sistemas computacionales");
       alum2.setMateria("POO");
       alum2.setSemestre(2);
       alum2.imprime();
       
       //Encapsulamiento de datos, puestos con setter y traidos con getter
       Datos alum3 = new Datos();
       alum3.setNombre("Ana \n");
       alum3.setMatricula("123 \n");
       alum3.setCarrera("Sistemas computacionales \n");
       alum3.setMateria("POO \n");
       alum3.setSemestre(2);
       
       String encapsulamiento = "El nombre es: " + alum3.getNombre()+ "La matricula es: " +alum3.getMatricula()+ 
               "La carrera es: "+alum3.getCarrera()+ "La materia es: " +alum3.getMateria()+ "El smestre es: " +alum3.getSemestre();
       
       System.out.println("\nLos datos de el alumno son \n" + encapsulamiento);
       
       
        //System.out.println("Los datos de el alumno son: \n" + alum1.toString());
        
    }
    
}
