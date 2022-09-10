public class EjercicioTema8 {


    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setEdad(12);
        persona.setNombre("Nombre Persona");
        persona.setTelefono("123987456");

        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Telefono: " + persona.getTelefono());
    }

}

    class Persona {

        private Integer edad;
        private String nombre;
        private String telefono;


        public void setEdad(Integer val){

            this.edad = val;
        }

        public Integer getEdad(){

            return this.edad;
        }

        public void setNombre(String val){

            this.nombre = val;
        }

        public String getNombre() {
            return this.nombre;
        }

        public void setTelefono(String val){

            this.telefono = val;
        }

        public String getTelefono(){

            return this.telefono;
        }

    }
