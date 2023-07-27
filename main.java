package Ejercicio1;
public class main {
    public static void main(String[] args) {
        
        Futbolista jugador1 = new Futbolista ();
        jugador1.nombre="Leonel Andres";
        jugador1.apellidos="Messi Cuccitin";
        jugador1.Edad=36;
        jugador1.posicion="Atacante";
        jugador1.Concentrarse();
        
        System.out.println(" La edad del jugador es de: "  +jugador1.Edad);
        
        
        Futbolista jugador2 =new Futbolista(7, "Centro Delantero");    
          jugador2.jugarPartido();
        System.out.println(" La edad del jugador es de: "  +jugador2.Edad);
        System.out.println("La posicion del jugador es: "+jugador2.posicion);
    }
    
}