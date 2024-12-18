# Proyecto de Ejercicios: Validación de Signos y Ordenación de Stacks  

## **Descripción**  
Este proyecto incluye dos ejercicios fundamentales para comprender el uso de pilas (`Stack`) y algoritmos asociados:  

1. **Ejercicio 1: Validación de Signos**  
   - Implementa un algoritmo para validar si una cadena de caracteres compuesta por los signos `()`, `{}`, `[]` está balanceada y en el orden correcto.  

2. **Ejercicio 2: Ordenación de un Stack**  
   - Desarrolla un algoritmo que ordena un `Stack` de enteros, utilizando un `Stack` auxiliar para lograr que el menor elemento quede en la parte superior.  

---

## **Estructura del Proyecto**  

1. **`SignValidator`**: Clase responsable de validar la correcta apertura y cierre de los signos.  
2. **`StackSorter`**: Clase que implementa el algoritmo para ordenar un `Stack` de enteros utilizando otro `Stack` adicional.  
3. **`NodeGeneric`**: Clase que define un nodo genérico, base para la implementación del `StackGeneric`.  
4. **`StackGeneric`**: Clase que define una pila genérica con operaciones básicas como `push`, `pop`, `peek` y `isEmpty`.  
5. **`App`**: Clase principal que contiene los métodos `runSignValidator` y `runSortStackExample` para ejecutar y demostrar ambos ejercicios.  

---

## **Ejercicio 1: Validación de Signos**  

### **Descripción**  
Este programa verifica si una cadena de signos `()`, `{}`, `[]` está correctamente balanceada, considerando las reglas de apertura y cierre en el orden adecuado.  

### **Funcionamiento**  
1. El usuario ingresa una cadena de signos.  
2. El algoritmo procesa cada carácter:  
   - Agrega los signos de apertura a la pila.  
   - Verifica que cada signo de cierre coincida con el superior de la pila.  
3. Si al final la pila está vacía, la cadena está correctamente balanceada.  

### **Resultados Esperados**  
- Si la cadena es válida, el programa mostrará: `"La cadena es válida."`  
- Si no lo es, el programa mostrará: `"La cadena no es válida."`  

## **Ejercicio 2: Ordenación de un Stack**

### **Descripción**  
El objetivo de este ejercicio es implementar un algoritmo que ordene una pila (`Stack`) de números enteros en orden ascendente, utilizando únicamente otra pila (`Stack`) auxiliar. Al final del proceso, el menor elemento estará en la parte superior de la pila original.

### **Funcionamiento del Algoritmo**  
El algoritmo sigue estos pasos principales:

1. **Extraer Elementos de la Pila Original**:  
   Se toman los elementos uno por uno desde la pila original (`stack`).

2. **Comparar e Insertar en el `Stack` Auxiliar**:  
   Cada elemento extraído se compara con el elemento en la parte superior del `Stack` auxiliar (`sortedStack`).  
   Si el elemento actual es menor que el superior del `sortedStack`, se mueven temporalmente los elementos mayores de vuelta a la pila original.  
   Se inserta el elemento en la posición correcta dentro del `sortedStack` para mantener su orden.

3. **Reensamblar la Pila Original**:  
   Una vez que todos los elementos están en el `Stack` auxiliar en orden ascendente, se transfieren de vuelta a la pila original.

### **Ejemplo de Funcionamiento**  
Dado un `Stack` inicial con los elementos:  
```text
[4, 2, 3, 1]
