import java.util.Scanner;
import java.util.Arrays;

import javax.print.attribute.standard.Media;

public class ExercicioDois {


    public static void call(Scanner scanner) {
        System.out.println("=== EXERCÍCIOS - LISTA 2 ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 - Calcule a Média                                   |");
        System.out.println("| 2 - Mês do Ano                                        |");
        System.out.println("| 3 - Forca                                             |");
        System.out.println("| 4 - Tabuada                                           |");
        System.out.println("| 5 - Letra a Letra                                     |");
        System.out.println("| 6 - Número ímpares multiplos de 7                     |");
        System.out.println("| 7 - Calcule a Média de Notas informadas               |");
        System.out.println("| 8 - Fatorial                                          |");
        System.out.println("| 9 - Calculo IMC                                       |");
        System.out.println("| 10 - Operadores                                       |");
        System.out.println("| 11 - DESAFIO                                          |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            // 1) Crie um programa que receba três notas calcule a média e diga se foi aprovado (`(nota1 + nota2 + nota3 / 3)`) e (`média maior que 7 para ser aprovado`).
            case 1:
                // calculaMedia(double notaUm, double notaDois, double notaTres);
                System.out.println(" O valor da média é: " + calculaMedia(8,9,7));
                break;
            // 2) Crie um programa que receba um número e indique o mês que representa.
            case 2:
                // qualMes(int mes);
                System.out.println ("Digite um número referente ao mês desejado: ");
                int mes = scanner.nextInt();

                switch (mes) {  

                    case 1:
                    System.out.println("Janeiro");
                    break;
               
                    case 2:
                    System.out.println("Fevereiro");
                    break;
               
                    case 3:
                    System.out.println("Março");   
                    break;
                    
                    case 4:
                    System.out.println("Abril");
                    break;
               
                    case 5:
                    System.out.println("Maio");
                    break;
               
                    case 6:
                    System.out.println("Junho");
                    break;
                    
                    case 7:
                    System.out.println("Julho");
                    break;
               
                    case 8:
                    System.out.println("Agosto");
                    break;
               
                    case 9:
                    System.out.println("Setembro");
                    break;
               
                    case 10:
                    System.out.println("Outubro");
                    break;
               
                    case 11:
                    System.out.println("Novembro");
                    break;
               
                    case 12:
                    System.out.println("Dezembro");
                    break;
                   }

                
                break;
            // 3) Crie um programa que simule um jogo da forca, com a entrada da palavra oculta, a quantidade de tentativas para acerto e depois solicite a entrada da palavra. A cada erro deve imprimir a quantidade de tentativas restantes e o 'membro' que foi marcado. Ao final deve imprimir se acertou ou não a palavra e se foi 'enforcado'.
            case 3:
                // forca(String palavra, int tentativa, Scanner scanner);
                System.out.println(" Digite a palavra oculta");
                String palavra = scanner.next();
                System.out.println(" Digite a quantidade de tentativas");
                int tentativas = scanner.nextInt();

                for ( int i = tentativas; i > 0; i--){
                    System.out.println("Digite a palavra da tentativa");
                    
                    String palavraTentativa = scanner.next();

                    if (palavra.equals(palavraTentativa)) {
                        System.out.println("Acertou!!");
                        break;
                    }else{
                        System.out.println("Errou!!");
                        if (i == 1){
                            System.out.println("Enforcado!");
                        }
                    }
                }
                break;
            // 4) Crie um programa que imprima a tabuada de 0 a 10.
            case 4:
                // tabuada(int numero);
                break;
            // 5) Crie um programa que receba uma String e imprima linha a linha suas letras.
            case 5:
                // letraALetra(String palavra);
                System.out.println(" digite a palavra: ");
                String palavraLetraAletra = scanner.next();
                char[] letras = letraALetra(palavraLetraAletra);

                for (char letra : letras) {
                    System.out.println(letra);
                }

                break;
            // 6) Crie um programa que de a soma de todos os números ímpares e múltiplos de 7 entre 1 e 500.
            case 6:
                // numerosImpares();
                System.out.println("A soma dos números ímpares e múltiplos de 7 entre 1 e 500 é:" + numerosImpares());
                break;
            // 7) Crie um programa que tenha como entrada as notas de um aluno. Somente se encerrará quando for inserida uma nota negativa. Ao final deverá informar a média das notas.
            case 7:
                // calculaMedia(double[] notas);
                break;
            // 8) Crie um programa que receba um valor e imprima o fatorial desse número. Ex.: 3! = 3 x 2 x 1 = 6.
            case 8:
                // fatorial(int numero);
                break;
            // 9) Crie um programa que receba a altera e o peso e calcule o IMC:
            // 
            // IMC | Classificação
            // --- | ------
            // Abaixo de 18,5 | Abaixo do Peso
            // Entre 18,6 e 24,9 | Peso Ideal
            // Entre 25,0 e 29,9 | Levemente acima do peso
           // Entre 30,0 e 34,9 | Obesidade Grau I
            // Entre 35,0 e 39,9 | Obesidade Grau II
            // Acima de 40 | Obesidade Grau III (mórbida)
            case 9:
                // imc(double altura, double peso);
                System.out.println("Digite a altura: ");
                double altura = scanner.nextDouble();
                System.out.println("Digite o peso: ");
                double peso = scanner.nextDouble();
                double imc = imc(altura, peso);
                if (imc < 18.5) {
                    System.out.println("Abaixo do peso");
                } else if (imc >= 18.5 && imc <= 24.9){
                    System.out.println("Peso Ideal");
                }else if (imc >= 25 && imc <= 29.9) {
                    System.out.println("Levemente acima do peso");
                }else if (imc >= 30 && imc <= 34.9){
                    System.out.println("Obesidade Grau I");
                }else if (imc >= 35 && imc <= 39.9){
                    System.out.println("Obesidade Grau II");
                }else if (imc >= 40) {
                    System.out.println("Obsedidade Grau III (mórbida)")
                }
                break;
            // 10) Crie um programa que receba dois valores e solicite a operação a ser realizada (+ - * /). Ao final imprima o resultado.
            case 10:
                // operador(int valorUm, int valorDois, char operacao);
                System.out.println("Digite o primeiro valor: ");
                int valorUm = scanner.nextInt();

                System.out.println("Digite o segundo valor: ");
                int valorDois = scanner.nextInt();

                System.out.println("Digite a operação (+ - * /)");
                char operacao = scanner.next().charAt(0);

                double resultado = operador(valorUm, valorDois, operacao);

                System.out.println("O valor da operação é" + resultado);
                break;
            // DESAFIO: Crie um programa que receba um valor em reais e determine qual o mínimo de notas necessárias para entregá-lo. <br> Notas: R$ 200, R$ 100, R$ 50, R$ 10, R$ 5, R$ 1 <br> Exemplo: R$ 15 -> 1 nota de R$ 10 e 1 nota de R$ 5
            case 11:
                // notasNecessarias(int valor);
                System.out.println("Digite o valor em reais: ");
                double valor = scanner.nextDouble();
                int[] notas = notasNecessarias(valor);
                System.out.println(Arrays.toString(notas));
            default:
                System.out.println("Operação inválida");
                break;
        }
    }

    public static double calculaMedia(double notaUm, double notaDois, double notaTres) {

            double notas = (notaUm + notaDois + notaTres) /3;      
            if ( notas > 7.0){
                System.out.println("Você foi aprovado");
            }
            else if ( notas < 7.0) {
                System.out.println("Infelizmente você foi reprovado");
            }
        return 0;       
    }

    public static String qualMes(int mes) {
 // 2) Crie um programa que receba um número e indique o mês que representa.
        return "";
    }

    public static int[] tabuada(int numero) {
        // 3) Crie um programa que simule um jogo da forca, com a entrada da palavra oculta, a quantidade de tentativas para acerto e depois solicite a entrada da palavra. A cada erro deve imprimir a quantidade de tentativas restantes e o 'membro' que foi marcado. Ao final deve imprimir se acertou ou não a palavra e se foi 'enforcado'.
        
        return new int[10];
    }

    public static char[] letraALetra(String palavra) {
        char[] letras = new char [palavra.length()];

        for (int i = 0; i < letras.length; i++){
            letras[i] = palavra.charAt(i);
        }
        
        return letras;
    }

    public static int numerosImpares() {
        int soma = 0;
        for (int i = 1; i < 500; i++){
            if ( i % 2 != 0 && i % 7 == 0);
                soma = soma + i;
        }
        return soma;
    }

    public static double calculaMedia(double[] notas) {
        return 0;
    }

    public static int fatorial(int numero) {
        int fatorial = 1;
        System.out.println(numero + "! = ");
        for (int i = numero; i > 0; i--){
            fatorial *= i;
            System.out.println(i +(i != 1 ? "x" : ""));
        }
        System.out.print("=");
        return fatorial;
    }

    public static double imc(double altura, double peso) {
        return peso / (altura * altura);
    }

    public static double operador(int valorUm, int valorDois, char operacao) {
        double resultado = 0;
        switch (operacao){
            case '+':
                resultado = valorUm + valorDois;
                break;
            case '-':
                resultado = valorUm - valorDois;
                break;
            case '*':
                resultado = valorUm * valorDois;
                break;
            case '/':
                resultado = (double) valorUm / valorDois;
                break;
            default:
                break;        
        }
        return resultado;
    }

    public static int[] notasNecessarias(int valor) {
        double[] notas = new double[] { 400, 200, 70, 50, 30, 10, 5, 1, 0.5};
        int [] valorNotas = new int [notas.length];

        for (int i = 0; i < notas.length; i++){
            valorNotas[i] = (int) (valor / notas[i]);
            valor -= valorNotas[i] * notas[i];
        }
        
        return valorNotas ;
    }
}
