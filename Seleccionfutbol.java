package Ejercicio1;
public class Seleccionfutbol{
    public Seleccionfutbol(){}
    protected int id;
    protected String Nombre; 
    protected String Apellidos; 
    protected int Edad;
    
    public Seleccionfutbol(int id, String nombre, String apellido, int edad ){
        this.id=id;
        this.Nombre=nombre;
        this.Edad=edad;
    }

     /*Constructor sin parametros*/
     public Seleccionfutbol(){
        this.id = 0;
        this.nombre="";
        this.apellidos="";
        this.Edad=0;
              
        }
        /*Constructor con parametors*/
        public Seleccionfutbol(int id, String nombre, String apellido, int Edad){
            this.id=id;
            this.nombre=nombre;
            this.apellidos= apellido;
            this.Edad=Edad;
            
        } 
        /*Metodos Set y GEt*/
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
        
        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        
        public String getApellidos() {
            return apellidos;
        }
    
        public void setApellidos(String apellidos) {
            this.apellido = apellidos;
        }
    
        private int getEdad() {
            return Edad;
        }

        private void setEdad(int Edad) {
            this.Edad = Edad;
        }
        public void Concentrarse(){
             System.out.println(this.nombre + " " + this.apellidos + " esta en concentración");
        }
        
        public void Viajar(){
         System.out.println(this.nombre + " " + this.apellidos + " esta viajando");
         
         }
}