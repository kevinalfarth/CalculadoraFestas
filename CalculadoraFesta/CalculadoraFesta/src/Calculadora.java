
import java.util.Scanner;

public class Calculadora {
        Scanner entrada = new Scanner(System.in);
        double n1, n2;
        String opcao;
        
    /**
     * Faz a soma
     * @return resultado
     */
    public double somar(){
            double resultado;
            resultado = n1+n2;
            return resultado;
        }
    /**
     * Faz Subtração
     * @return resultado
     */
    public double subtracao()
    {
        double resultado;
        resultado = n1-n2;
        return resultado;
    }
    /**
     * Faz Multiplicação
     * @return resultado
     */
    public double multiplicacao()
    {
        double resultado;
        resultado = n1*n2;
        return resultado;
    }
    /**
     * Faz Divisao
     * @return resultado
     */
    public double divisao()
    {
        double resultado;
        resultado = n1/n2;
        return resultado;
    }
    
    }
        
  

