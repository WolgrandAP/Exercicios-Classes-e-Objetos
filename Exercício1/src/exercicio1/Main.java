package exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float raio = 0;
        Scanner tec = new Scanner(System.in);

        while (true) {
            System.out.print("Digite a medida do raio ou um número igual/menor a 0 para sair: ");
            raio = tec.nextFloat();

            if (raio>0) {
                Circulo c = new Circulo(raio);

                System.out.println(c.getArea());
                System.out.println(c.getCircunferencia());
            } else {
                break;
            }


        }


    }
}
