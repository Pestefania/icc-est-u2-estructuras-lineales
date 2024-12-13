package Ejercicio_02_sorting;

import java.util.Stack;

public class StackSorter {
    // Método para ordenar un stack
    public void sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>(); // Pila auxiliar

        while (!stack.isEmpty()) {
            // Extraemos el elemento superior de la pila original
            int temp = stack.pop();

            // Movemos elementos mayores que temp de tempStack a stack
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                stack.push(tempStack.pop());
            }

            // Colocamos temp en la posición correcta dentro de tempStack
            tempStack.push(temp);
        }

        // Transferimos los elementos de tempStack de vuelta a stack
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    // Método para formatear la pila como una cadena con el formato "(tope) 1->2->4->5"
    public String formatStack(Stack<Integer> stack) {
        StringBuilder result = new StringBuilder("(tope) ");
        for (int i = stack.size() - 1; i >= 0; i--) {
            result.append(stack.get(i));
            if (i > 0) {
                result.append("->");
            }
        }
        return result.toString();
    }
}

