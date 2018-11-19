
import java.util.Scanner;

/**
 * Classe Principal
 * @author Aluno
 * @version 1.0
 */
public class Principal {
    public static void main(String[] args) {
        CalculadoraDeFuncoes c = new CalculadoraDeFuncoes();//Tranforma a classe CalculadoraDeFuncoes em objeto para utilizar
        Calculadora cb = new Calculadora();  //Transforma a classe Calculadora em Objeto Para Utilizar      
         Scanner entrada = new Scanner(System.in); //Cria Scanner para Receber As coisas digitadas
        System.out.println("Deseja ir para calculadora basica(1) , Calculadora de funcoes(2) ou Calculadora de festa?(3)?");//Da opÃ§ao de escolha
        String escolha;
        escolha = entrada.next();
        /**
         * Para escolher oque ira abrir
         */
        switch (escolha) {
            case "1":
                System.out.println("Valor numero 1:");
                cb.n1 = entrada.nextDouble();//entrada do valor 1
                System.out.println("valor numero 2:");
                cb.n2 = entrada.nextDouble();//entrada do valor 2
                System.out.println("Voce quer somar +,Subtrair -,Multiplicar * ou Dividir / ?");
                cb.opcao = entrada.next(); // Entrada de qual operaÃ§Ã£ oa pessoa quer fazer
                /**
                 * Escolher a operaÃ§Ã£o
                 */
                switch (cb.opcao) {
                    case "+":
                        System.out.println("Valor da soma ÃƒÂ©:"+cb.somar());//Executa a soma
                        break;
                    case "-":
                        System.out.println("Valor da subtraÃƒÂ§ÃƒÂ£o ÃƒÂ©:"+cb.subtracao());//Executa a SubtraÃ§Ã£o
                        break;
                    case "*":
                        System.out.println("Valor da multiplicaÃƒÂ§ÃƒÂ£o ÃƒÂ©:"+cb.multiplicacao());//Executa a MultiplicaÃ§Ã£o
                        break;
                    case "/":
                        System.out.println("Valor da Divisao ÃƒÂ©:"+cb.divisao());//Executa a Divisao
                    default:
                        System.out.println("Opcao Incorreta");//Caso digitar algo diferente das ecolhas printa opÃ§ao incorreta
                }
            case "2":
                System.out.println("Insira valor de X");
                c.x = entrada.nextDouble();//Recebe X
                System.out.println("Insira valor de Y");
                c.y = entrada.nextDouble();//Recebe Y
                System.out.println("Qual calculo de funcao vc quer fazer?");
                System.out.println("a) XÃ‚Â²+2y-1");
                System.out.println("b) (xÃ‚Â³-2)/3+5XÃ‚Â²");
                c.opcao = entrada.next();//Recebe qual calculo de funcao quer fazer
                /**
                 * Para a escolha do Usuario
                 */
                switch (c.opcao) {
                    case "a":
                        System.out.println("Valor da conta da letra a ÃƒÂ©:"+c.a());//Resultado da Escolha A
                        break;
                    case "b":
                        System.out.println("Valor da conta da letra b ÃƒÂ©:"+c.b()); //Resultado da escolha
                        break;
                    default:
                        System.out.println("Opcao Incorreta");
                }
                
                break;
                /**
                 * Executa calculadora de festa
                 */
            case "3":
                int nump;
                System.out.println("Quantas pessoas irao a festa?");//pergunta quantas pessoas vao
                nump = entrada.nextInt();
                CalculadoraDeFesta cf = new CalculadoraDeFesta(nump);
                int copos;
                System.out.println("Copos de vidro(1) ou de Platico(2)?");//Pergunta qts Copo
                copos = entrada.nextInt();
                if (copos == 1) {
                    /**
                     * Mostra as coisas que vai precisa pra festa com copos de vidro
                     */
                         
                    System.out.println("Qauntidade de Copos:"+cf.qtdecoposVidro());
                    System.out.println("Bebidas :");
                    System.out.println("Quantidade de Refri :"+(long)cf.qtdrefri()+" Litros");
                    System.out.println("Quantidade de Sucos :"+(long)cf.sucos()+" Litros");
                    System.out.println("Quantidade de Ã�gua :"+(long)cf.agua()+" Litros");
                    System.out.println("Quantidade de Cerveja :"+(long)cf.cerveja()+" Litros");
                    System.out.println("Quantidade de Vinho :"+(long)cf.vinho()+" Garrafa");
                    System.out.println("Quantidade de Coquetel de Frutas :"+(long)cf.coquetel()+" Litros");
                    System.out.println("Quantidade de vodka :"+(long)cf.qtdrefri()+" Garrafa");
                    System.out.println("Quantidade de Wisky :"+(long)cf.wisky()+" Garrafa");
                    System.out.println("Carnes:");
                    System.out.println("Quantidade de Alcatra:"+(long)cf.fileAlcatra()+" Kilos");
                    System.out.println("Quantidade de LinguiÃ§a:"+(long)cf.linguica()+" Kilos");
                    System.out.println("Quantidade de Picanha:"+(long)cf.picanha()+" Kilos");
                  
                }
                if (copos == 2) {
                    /**
                     * Mostra oq vai precisar pra festa por copos de Plastico
                     */
                    System.out.println("Qauntidade de Copos:"+(long)cf.qtdecoposPlastico());
                    System.out.println("Bebidas :");
                    System.out.println("Quantidade de Refri :"+(long)cf.qtdrefri()+" Litros");
                    System.out.println("Quantidade de Sucos :"+(long)cf.sucos()+" Litros");
                    System.out.println("Quantidade de Ã�gua :"+(long)cf.agua()+" Litros");
                    System.out.println("Quantidade de Cerveja :"+(long)cf.cerveja()+" Litros");
                    System.out.println("Quantidade de Vinho :"+(long)cf.vinho()+" Garrafa");
                    System.out.println("Quantidade de Coquetel de Frutas :"+(long)cf.coquetel()+" Listros");
                    System.out.println("Quantidade de vodka :"+(long)cf.qtdrefri()+" Garrafa");
                    System.out.println("Quantidade de Wisky :"+(long)cf.wisky()+" Garrafa");
                    System.out.println("Carnes:");
                    System.out.println("Quantidade de Alcatra:"+(long)cf.fileAlcatra()+" Kilos");
                    System.out.println("Quantidade de LinguiÃ§a:"+(long)cf.linguica()+" Kilos");
                    System.out.println("Quantidade de Picanha:"+(long)cf.picanha()+" Kilos");
                }
                        break;
        }
       
    }   
    }

