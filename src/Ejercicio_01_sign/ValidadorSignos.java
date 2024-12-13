package Ejercicio_01_sign;

import java.util.Scanner;

public class ValidadorSignos{

    public static boolean esValido(String cadena) {
        Stack stack = new Stack();

        for (char caracter : cadena.toCharArray()) {
            if (caracter == '(' || caracter == '{' || caracter == '[') {
                stack.push(caracter);
            } else if (caracter == ')' || caracter == '}' || caracter == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!esParCorrespondiente(top, caracter)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean esParCorrespondiente(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') ||
               (apertura == '{' && cierre == '}') ||
               (apertura == '[' && cierre == ']');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingrese una cadena de signos para validar: ");
            String input = scanner.nextLine();

            if (esValido(input)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }

            System.out.println("¿Desea ingresar otra cadena? (si/no): ");
            String respuesta = scanner.nextLine().trim().toLowerCase();
            if (!respuesta.equals("si")) {
                continuar = false;
                System.out.println("¡Gracias por usar el validador de signos!");
            }
        }

        scanner.close();
    }
}
