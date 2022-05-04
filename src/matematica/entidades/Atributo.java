package matematica.entidades;

import static java.lang.Math.pow;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeMath.sqrt;

public class Atributo {

    Scanner leer = new Scanner(System.in);

    public int num1;
    public int num2;

    public Atributo() {
    }

    public Atributo(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int llenarnum1() {
        num1 = (int) (Math.random() * 100);
        return num1;
    }

    public int llenarnum2() {
        num2 = (int) (Math.random() * 100);
        return num2;
    }

    public int devolverMayor() {
        int maximonum = Integer.max(num1, num2);
        return maximonum;
    }

    public int calcularPotencia() {

        return (int) pow(num2, num1);
    }

    public int calcularRaiz1() {
        double raiz1 = Math.sqrt(num1);
        return (int) raiz1;
    }

    public int calcularRaiz2() {
        double raiz2 = Math.sqrt(num2);
        return (int) raiz2;
    }
}
