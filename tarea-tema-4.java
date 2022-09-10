public class EjercicioTema4 {


    public static void main(String[] args){

        Integer numeroIf = 0;

        if(numeroIf < 0){

            System.out.println("El numero "+ numeroIf +", es negativo");
        } else if (numeroIf > 0) {

            System.out.println("El numero "+ numeroIf +", es positivo");
        }else{

            System.out.println("El numero "+ numeroIf +", es cero");
        }


        Integer numeroWhile = 0;

        while (numeroWhile < 3){

            System.out.println("El numeroWhile = "+ numeroWhile);
            numeroWhile++;
        }

        do {
            System.out.println("El numeroWhile desde el do-while = "+ numeroWhile);
        }while (numeroWhile < 3);


        for (Integer numeroFor = 0; numeroFor <= 3; numeroFor++){

            System.out.println("El numeroFor = "+ numeroFor);
        }

        String estacion = "invierno";

        switch (estacion){

            case "primavera":

                System.out.println("Estacion del año "+ estacion);
                break;

            case "verano":

                System.out.println("Estacion del año "+ estacion);
                break;

            case "otoño":

                System.out.println("Estacion del año "+ estacion);
                break;

            case "invierno":

                System.out.println("Estacion del año "+ estacion);
                break;

                default:
                    System.out.println("Estacion del año no reconocida");

        }

    }
}
