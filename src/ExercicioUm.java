import java.util.Scanner;

public class ExercicioUm {

    public static void call(Scanner scanner) {
        System.out.println("=== EXERCÍCIOS - LISTA 1 ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 - Calcule a Média                                   |");
        System.out.println("| 2 - Calcule a Área                                    |");
        System.out.println("| 3 - Calcule o Volume                                  |");
        System.out.println("| 4 - Valor é maior que o dobro de outro valor          |");
        System.out.println("| 5 - Cálculo de Bhaskara                               |");
        System.out.println("| 6 - Velocidade Média                                  |");
        System.out.println("| 7 - Percentual de Imposto                             |");
        System.out.println("| 8 - Valor é par ou ímpar                              |");
        System.out.println("| 9 - Comparar dois valores de String                   |");
        System.out.println("| 10 - Valor double em string e convertido para inteiro |");
        System.out.println("| 11 - Imposto de renda de um salário                   |");
        System.out.println("| 12 - DESAFIO                                          |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }
        switch (menu) {
            // 1) Crie um programa que calcule a média (`(nota1 + nota2 + nota3 / 3)`)
            case 1:
                System.out.println("A média de notas é: " + media(8,6,8));
                break;
            // 2) Crie um programa que calcule a área (`lado1 * lado2`)
            case 2:
                 System.out.println(" A área é: " + area(3,5));
                break;
            // 3) Crie um programa que calcule o volume (`largura * altura * profundidade`)
            case 3:
                System.out.println(" O Volume é: " + volume(15,10,5));
                break;
            // 4) Crie um programa que avalie se um valor é maior do que o dobro de outro valor
            case 4:
                System.out.println("valor maior que o dobro é: " + valorMaiorQueDobro(12, 9));
                break;
            // 5) Crie um programa que calcule _bhaskara_
            case 5:
                bhaskara(1, 4, 1);
                break;
            // 6) Crie um programa que calcule a velocidade média de uma viagem (`distancia (km) / tempo (h)`)
            case 6:
                System.out.println("a velocidade média de uma viagem é: " + mediaViagem(200, 5));
                break;
            // 7) Crie um programa que calcule o percentual de imposto pago (`faturamento \ qtd imposto`)
            case 7:
                System.out.println("O percentual de Imposto pago é: " + percentualImposto(5,50));
                break;
            // 8) Crie um programa que teste se um valor é par ou ímpar
            case 8:
                // parOuImpar(int valor)
                int valor=3;    

                if (valor % 2==0)
                {
                    System.out.println ("É par");
                }
                else 
                {
                    System.out.println ("É ímpar");
                }
                break;
            // 9) Crie um programa que compare dois valores Strings
            case 9:
                // compareString(String stringUm, String stringDois)
                break;
            // 10) Crie um programa que tenha uma variável com ponto em String e converta seu valor para inteiro
            case 10:
                // convertString(String valor);
                break;
            // 11) Crie um programa que receba o salário e diga o valor de imposto de renda conforme abaixo:
            // Base                     | Alíquota
            // ---------                | ------
            // Até 1.903,98             | Isento
            // De 1.903,99 até 2.826,65 | 7,5%
            // De 2.826,66 até 3.751,05 | 15%
            // De 3.751,06 até 4.664,68 | 22,5%
            // Acima de 4.664,68        | 27,5%
            case 11:
                System.out.println("O percentual de Imposto é: " + percentualImposto(1200, 2));
                break;
            
            case 12:
                System.out.println("Teste se o número é primo: " + testePrimo(3));
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }

    public static double media(double notaUm, double notaDois, double notaTres) {
        return (notaUm + notaDois + notaTres) /3;
    }

    public static double area(double ladoUm, double ladoDois) {
        return (ladoUm * ladoDois);
    }

    public static double volume(double largura, double altura, double profundidade) {
        return (largura * altura * profundidade);
    }

    public static boolean valorMaiorQueDobro(double base, double verificar) {
        if (base > verificar * 2){
            return true;
        } else {
            return false;
        }
    }

    public static double[] bhaskara(int a, int b, int c) {
        double delta = (b * b) - (4 * a * c);
        double x1 = 0;
        double x2 = 0;
        if (delta < 0) {
            System.out.println("Delta é negativo");
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            x2 = x1;
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
        }
        System.out.println(x1);
        System.out.println(x2);
        return new double[] { x1, x2 };
    }

    public static double mediaViagem(double distancia, double tempo) {
        return (distancia / tempo);
    }

    public static double percentualImposto(double faturamento, double qtdImposto) {
        return (qtdImposto * 100/ faturamento);
    }

    public static boolean parOuImpar(int valor) {
        return false; 
    }

    public static boolean compareString(String stringUm, String stringDois) {
        return false;
    }

    public static int convertString(String valor) {
        return 0;
    }

    public static double percentualImpostoSalario(double salario) {
        double percentual = -1;
        if (salario <= 1903.98) {//Até 1.903,98             | Isento
            percentual = 0;
        } else if (salario <= 1903.99 && salario >= 2826.65) { //De 1.903,99 até 2.826,65 | 7,5%
            percentual = 7.5;
        } else if (salario <= 2826.66 && salario >= 3751.05) { // De 2.826,66 até 3.751,05 | 15% 
            percentual = 15;
        } else if (salario <= 3751.06 && salario >= 5664.68) { // De 3.751,06 até 4.664,68 | 22,5%
            percentual = 22.5;
        } else if (salario > 4664.68) { // Acima de 4.664,68        | 27,5%
            percentual = 27.5;
        }
        return percentual;  
    }

    public static boolean testePrimo(int valor) {
        for(int i = 2; i < valor; i++) {
            if(valor % i == 0) {
                return false;
            }
        }
        return true ;
    }

}