import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        float numero;
        String operador;

        Scanner scan = new Scanner(System.in);


        System.out.println("entre com o numero");
        numero = scan.nextFloat();
        System.out.println("entre com o operador");
        operador = scan.next();
        for (int contador = 1; contador <= 10; contador++) {
            switch (operador) {
                case "-":
                    System.out.println(numero + operador + contador + "=" + (numero - contador));
                    break;

                case "+":
                    System.out.println(numero + operador + contador + "=" + (numero + contador));
                    break;

                case "/":
                    System.out.println(numero + operador + contador + "=" + (numero / contador));
                    break;
                case "*":
                    System.out.println(numero + operador + contador + "=" + (numero * contador));
                    break;

                default:
                    break;
            }
        }
    }

}

