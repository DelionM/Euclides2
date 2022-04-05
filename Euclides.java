package euclides;

import java.util.Scanner;

public class Euclides {
    public static void main(String[] args) {
        int dividiendo;
        int divisor;
        int cociente;
        int resto;

        Scanner myObj = new Scanner(System.in);

        System.out.println("introduzca el primer número: ");
        int a = myObj.nextInt();
        System.out.println("introduzca el segundo número: ");
        int b = myObj.nextInt();
        System.out.println("\n ");

        if (a>b){
            dividiendo = a;
            divisor = b;
        }
        else
        {
            dividiendo = b;
            divisor = a;
        }
        do {
            cociente = dividiendo / divisor;
            resto = dividiendo - (divisor * cociente);

            System.out.println("\n ");
            System.out.println("El cociente es: " + cociente);
            System.out.println("El resto es: " + resto);
            dividiendo = divisor;
            divisor = resto;
        }while (resto != 0);
        System.out.println("\n ");
        System.out.println("El máximo común divisor es: "+dividiendo);

    }
    
}
