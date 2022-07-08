import calculator.Calculate;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calculate  calculate = new Calculate();
        System.out.println("Ingresar numero 1");
        Double numero1 = in.nextDouble();
        System.out.println("Ingresar numero 2");
        Double numero2 = in.nextDouble();
        System.out.println("Ingresar numero 3");
        Double numero3 = in.nextDouble();


        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");


        System.out.println("Ingresar numero 1");
        Double numero4 = in.nextDouble();
        System.out.println("Ingresar numero 2");
        Double numero5 = in.nextDouble();
        System.out.println("Ingresar numero 3");
        Double numero6 = in.nextDouble();

        List<Double> listaNumerosIngresados1 = Arrays.asList(numero1,numero2,numero3) ;
        calculate.setListadoNumeros1(listaNumerosIngresados1);

        List<Double> listaNumerosIngresados2 = Arrays.asList(numero4,numero5,numero6) ;
        calculate.setListadoNumeros1(listaNumerosIngresados2);


        calculate.suma(calculate.getListadoNumeros1(),calculate.getListadoNumeros2());
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
         calculate.resta(calculate.getListadoNumeros1(),calculate.getListadoNumeros2());
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
         calculate.potencia();
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        calculate.multi(calculate.getListadoNumeros1(),calculate.getListadoNumeros2());
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        calculate.div();

    }
}
