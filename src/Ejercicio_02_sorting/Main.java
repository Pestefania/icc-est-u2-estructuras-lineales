package Ejercicio_02_sorting;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de StackSorter
        StackSorter sorter = new StackSorter();

        // Crear una pila con elementos desordenados
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        // Mostrar pila original
        System.out.println("Pila original:");
        System.out.println(sorter.formatStack(stack));

        // Ordenar la pila
        sorter.sortStack(stack);

        // Mostrar pila ordenada
        System.out.println("Pila ordenada:");
        System.out.println(sorter.formatStack(stack));
    }
}
