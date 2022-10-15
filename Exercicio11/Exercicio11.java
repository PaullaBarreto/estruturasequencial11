import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) throws Exception {
        //peça 2 número inteiros e um número real
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro: ");
        int a = sc.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int b = sc.nextInt();        
        System.out.println("Digite o número real: ");
        double c = sc.nextDouble();
        sc.close();
        //calcule o dobro do primeiro número
        int d = 2 * a;
        //calcular a metade do segundo número
        double e = b/2;
        //produto dos req1 req2
        double f = d * e;
        //triplo do primeiro número
        double g = a * 3;
        //soma o req 5 mais o terceiro número
        double h = g + c;
        //terceiro número elevado ao cubo
        double i = Math.pow(c, 3);

        System.out.println("o primeiro número é: " +a);
        System.out.println("o primeiro número é: " +b);
        System.out.println("o primeiro número é: " +c);

        System.out.println("o dobro do primeiro número é: " + d);

        System.out.println("a metade do segundo número é: " + e);
        System.out.println("o produto do dobro do primeiro com metade do segundo: " + f);
        System.out.println("o triplo do primeiro com o terceiro: " + g);
        System.out.println("A soma do triplo do primeiro com o terceiro: " + h);
        System.out.println("Terceiro número elevado ao cubo: " + i);

       
    }
}