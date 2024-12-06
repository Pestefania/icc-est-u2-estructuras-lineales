package Materias.Stacks;


import Materias.Models.NodeGeneric;
import java.util.EmptyStackException;

public class StackGeneric<T> {
    private NodeGeneric<T> top; // Nodo genérico
    private int size; // Tamaño de la pila (O(1))

    // Constructor: Inicializa una pila vacía
    public StackGeneric() {
        this.top = null;
        this.size = 0;
    }

    // Método para agregar un elemento a la pila
    public void push(T data) {
        NodeGeneric<T> newNode = new NodeGeneric<>(data);
        newNode.setNext(top); // El nuevo nodo apunta al actual top
        top = newNode; // El nuevo nodo es ahora el top
        size++; // Incrementar el tamaño
    }

    // Método para retirar y devolver el elemento superior de la pila
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = top.getValue(); // Obtener el valor del nodo superior
        top = top.getNext(); // Actualizar el top al siguiente nodo
        size--; // Decrementar el tamaño
        return value;
    }

    // Método para obtener el elemento superior sin retirarlo
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    // Método que verifica si la pila está vacía
    public boolean isEmpty() {
        return top == null;
    }

    // Método para obtener el tamaño de la pila
    public int getSize() {
        return size;
    }

    // Método para imprimir los elementos de la pila
    public void printStack() {
        NodeGeneric<T> current = top; // Usamos NodeGeneric<T> aquí
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public Object popNode() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object popNode() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'popNode'");
    }

    public Object popNode() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}