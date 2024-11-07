import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static float division (float num1, float num2) throws ArithmeticException{
        if(num2 == 0){
            throw new ArithmeticException("No se puede dividir entre 0");
        }
        return num1/num2;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int opcion;
        float num1;
        float num2;
        float resultado = 0;

        System.out.println(" \t***CALCULADORA***");

    try {
        do {

            System.out.println("\tTeclee una opcion: ");
            System.out.print("\t1:SUMA");
            System.out.print("\t2:RESTA");
            System.out.print("\t3:MULTIPLICACION");
            System.out.print("\t4:DIVISION");
            opcion = scanner.nextInt();

        } while (opcion > 4 || opcion < 1);

        System.out.println("Elijiste la opcion: " + opcion);


        System.out.println("Ingrese primer numero");
        num1 = scanner.nextFloat();

        System.out.println("Ingrese segundo numero");
        num2 = scanner.nextFloat();

        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + resultado);
                break;

            case 2:
                resultado = num1 - num2;
                System.out.println(num1 + " - " + num2 + "=" + resultado);
                break;

            case 3:
                resultado = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + resultado);
                break;

            case 4:
                resultado = division(num1,num2);
                break;

            default:
                System.out.println("Operacion invalida");
                break;
        }
    }catch (ArithmeticException e){
        System.out.println("la excepcion es: " + e);
    }catch (InputMismatchException e){
        System.out.println("No es un valor valido: " + e);
    }

        System.out.println("El resultado es: " + resultado);
    scanner.close();

    }
}