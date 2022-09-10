

public class EjercicioTema9 {


    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setEdad(22);
        cliente.setNombre("Nombre Cliente");
        cliente.setTelefono("123987456");
        cliente.setCredito(true);
        System.out.println("Cliente -------------------------------------");
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Credito: " + cliente.hasCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(35);
        trabajador.setNombre("Nombre Trabajador");
        trabajador.setTelefono("987654123");
        trabajador.setSalario(3500);
        System.out.println("Trabajador -------------------------------------");
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Telefono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());
    }

}

class Cliente extends Persona{

    private boolean credito = false;

    public void setCredito(boolean val) {
        this.credito = val;
    }

    public boolean hasCredito(){

        return this.credito;
    }
}

class Trabajador extends Persona{

    private int salario = 0;

    public void setSalario(int val) {
        this.salario = val;
    }

    public Integer getSalario(){

        return this.salario;
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

