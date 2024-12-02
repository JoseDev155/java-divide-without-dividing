# Ejercicio -> Dividir sin dividir

Este codigo realiza una division entera sin usar el operador de division (`/`) ni el modulo (`%`).
Utiliza un bucle para calcular el cociente y una operacion aritmetica para calcular el residuo.

### **Clase `DividirSinDividir`**
La clase tiene un metodo principal (`main`) y dos metodos auxiliares (`getCociente` y `getResiduo`).

#### **1. `main`**
1. **Variables iniciales:**
   - `dividendo = 31`: Numero a ser dividido.
   - `divisor = 5`: Numero por el cual se divide.
2. **Llamada a `getCociente`:**
   - Este metodo calcula cuantas veces cabe el divisor en el dividendo.
3. **Llamada a `getResiduo`:**
   - Este metodo calcula el residuo de la operacion usando el cociente calculado.
4. **Imprime los resultados:**
   - Muestra el cociente y el residuo en la consola.

#### **2. Método `getCociente`**

```java
private static int getCociente(int divid, int divis) {
    int coci = 0;

    for(int a = 0; a * divis <= divid; a++) {
        coci = a;
    }
    return coci;
}
```

**Proposito:**
Calcular cuantas veces el `divisor` cabe en el `dividendo` sin excederlo.

**Funcionamiento:**
- Inicializa `coci = 0`.
- Utiliza un bucle `for` con un contador `a` que comienza en 0.
  - En cada iteracion, multiplica `a * divis` (es decir, `a * divisor`) y verifica si el resultado es menor o igual al `dividendo`.
  - Si la condicion se cumple, asigna `a` a `coci`.
- Cuando el bucle termina (porque `a * divis > divid`), el valor de `coci` contiene el cociente entero de la division.

#### **3. Metodo `getResiduo`**

```java
private static int getResiduo(int dividendo, int divisor, int cociente) {
    return dividendo - divisor * cociente;
}
```

**Proposito:**
Calcular el residuo de la division.

**Funcionamiento:**
- Usa la formula:
  \[
  \text{Residuo} = \text{Dividendo} - (\text{Divisor} \times \text{Cociente})
  \]
- Sustituye los valores de `dividendo`, `divisor` y `cociente` para obtener el residuo.

### **Salida del programa**
Para `dividendo = 31` y `divisor = 5`, el programa produce:
```
Cociente = 6
Residuo = 1
```
