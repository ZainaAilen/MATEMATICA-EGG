package matematica;

import matematica.entidades.Atributo;

public class MATEMATICA {

    public static void main(String[] args) {

        Atributo MAT = new Atributo();
        MAT.llenarnum1();
        MAT.llenarnum2();
        System.out.println("El número 1 es: " + MAT.llenarnum1() + ". El número 2 es: " + MAT.llenarnum2());
        System.out.println("El número de mayor valor es: " + MAT.devolverMayor());
        System.out.println("La potencia del mayor es : " + MAT.calcularPotencia());
        System.out.println("La raíz del primer número es: " + MAT.calcularRaiz1());
        System.out.println("La raiz del segundo es: " + MAT.calcularRaiz2());

    }

}

//Realizar una clase llamada Matemática que tenga como atributos dos 
//números reales con los cuales se realizarán diferentes operaciones 
//matemáticas. La clase deber tener un constructor vacío, parametrizado
//y get y set. En el main se creará el objeto y se usará el Math.random
//para generar los dos números y se guardaran en el objeto con su 
//respectivos set. Deberá además implementar los siguientes métodos:
//• Método devolverMayor() para retornar cuál de los dos atributos 
//tiene el mayor valor.
//• Método calcularPotencia() para calcular la potencia del mayor 
//valor de la clase elevado al menor número. Previamente se deben 
//redondear ambos valores.
//• Método calculaRaiz(), para calcular la raíz cuadrada del menor de 
//los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto
// del número.
