/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class CalculadoraDeFuncoes {
    double x,y;
    String opcao;
    /**
     * Faz a conta da questao a
     * @return resultado
     */
    public double a()
    {
        double resultado;
        resultado = Math.pow(x,2)+2*y-1;
        return resultado;
    }
    /**
     * Faz a conta da questao b
     * @return resultado
     */
    public double b()
    {
        double resultado;
        resultado = (Math.pow(x,3)-2)/2+5*Math.pow(x,2);
        return resultado;
    }
    
}