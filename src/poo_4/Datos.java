/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_4;

/**
 *
 * @author 3PY37LA_RS6
 */
public class Datos {
    String nombre;
    String matricula;
    String carrera;
    String materia;
    int semestre;

    public void Datos(String nombre, String matricula, String carrera, String materia, int semestre) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
        this.materia = materia;
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
    public void imprime(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("La matricula es: " + matricula);
        System.out.println("La carrera es: " + carrera);
        System.out.println("La materia es: " + materia);
        System.out.println("El semestre es: " + semestre);
    }
 /*  public String toString(){
    return "Nombre: " + nombre + 
           "Matricula: " + matricula + 
           "Carrera: " + carrera + 
           "Materia: " + materia + 
           "Semestre: " + semestre;
}*/
    
    
    
    
    
}
