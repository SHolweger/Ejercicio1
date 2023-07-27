package Ejercicio1;
public class Masajista extends Seleccionfutbol{
     // Atributos específicos de la clase Masajista
     private String titulo;
     private int aniosExperiencia;
 
     // Constructor sin parametros 
     public Masajista() {
         super();
         this.titulo = "";
         this.aniosExperiencia = 0;
     }
 
     //Constructor con parametros
     public Masajista(int id, String nombre, String apellidos, int edad, String titulo, int aniosExperiencia) {
         super(id, nombre, apellidos, edad);
         this.titulo = titulo;
         this.aniosExperiencia = aniosExperiencia;
     }
 
     // Métodos Set y Get
     public String getTitulo() {
         return titulo;
     }
 
     public void setTitulo(String titulo) {
         this.titulo = titulo;
     }
 
     public int getAniosExperiencia() {
         return aniosExperiencia;
     }
     public void setAniosExperiencia(int aniosExperiencia) {
         this.aniosExperiencia = aniosExperiencia;
     }
     //METODOS ADICIONALES
     public void masajear(){
        System.out.println("El masajista tiene "+this.aniosExperiencia+"años de experiencia");
        System.out.println("El masajista esta dando un masaje");
      }
}
