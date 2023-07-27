package Ejercicio1;
public class Futbolista extends Seleccionfutbol{
 private int dorsal;
 private String Demarcacion;
 
 public Futbolista(){
      super();
      this.dorsal=0;
      this.Demarcacion="";
 }
 
 public Futbolista(int d,String de){
      super();
      this.dorsal=d;
      this.Demarcacion=de;
 }
//Metodos Get y Set
  
    private int getDorsal() {
      return dorsal;
  }

  private void setDorsal(int d) {
      this.dorsal = d;
  }
  private String getDemarcacion() {
      return Demarcacion;
  }
  private void setDemarcacion(String de) {
      this.Demarcacion = de;
  }
  
  // Metodos adicionales
 public void jugarPartido(){
   System.out.println("El jugador numero " + this.dorsal+" juega de: "+this.Demarcacion);
 }
 
 public void Entrenar(){
   System.out.println("El jugador numero " + this.dorsal+" entrena para ser el mejor "+this.Demarcacion);
 }

}
