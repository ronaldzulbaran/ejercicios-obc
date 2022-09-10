public class Main {

    public static void main(String[] args){

       var resultado = suma(10, 10, 10);

        System.out.println("Resultado de la Suma: "+ resultado);

        Coche miCoche = new Coche();
        miCoche.incrementarPuerta();
        System.out.println("Numero de Puertas: "+ miCoche.puertas);
    }


    public static int suma(int a, int b, int c){

        return a + b + c;
    }


}

class Coche{

    public int puertas = 4;

    public void incrementarPuerta(){

        this.puertas++;
    }
}
