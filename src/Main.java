import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        MenuUI menuUI = new MenuUI();

        int opcion;
        double importe, importeConvertido;


        while(true) {
            String monedaBase = "", monedaAConvertir = "";

            System.out.println(menuUI.menu);

            opcion = teclado.nextInt();

            if (opcion == 9){
                System.out.println("Gracias por utilizar nuestros servicios");
                break;
            }

            switch (opcion){

                case 1:
                    monedaBase = "USD";
                    monedaAConvertir = "ARS";
                    break;
                case 2:
                    monedaBase = "ARS";
                    monedaAConvertir = "USD";
                    break;
                case 3:
                    monedaBase = "USD";
                    monedaAConvertir = "BRL";
                    break;
                case 4:
                    monedaBase = "BRL";
                    monedaAConvertir = "USD";
                    break;
                case 5:
                    monedaBase = "USD";
                    monedaAConvertir = "EUR";
                    break;
                case 6:
                    monedaBase = "EUR";
                    monedaAConvertir = "USD";
                    break;
                default:
                    System.out.println("Ingresó una opción no válida");
                    System.exit(1);
            }

            System.out.println("Ingrese el importe en " + monedaBase + " que desea convertir: ");
            importe= teclado.nextDouble();

            importeConvertido = ConvertidorMoneda.convertir(importe, monedaBase, monedaAConvertir);

            System.out.println("El equivalente en " + monedaAConvertir + ": " + importeConvertido );
            System.out.println();
            
        }
    }
}