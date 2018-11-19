/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class CalculadoraDeFesta {
    
    private int numeroPessoas;
    
    public CalculadoraDeFesta(int numPessoas){
        this.numeroPessoas = numPessoas;   
    }
    /**
     * Ve Contidade de Refri em litros
     * @return qtDeRefri 
     */   
    public double qtdrefri(){
    double refripp = 0.6;
    double qtDeRefri;
    qtDeRefri = refripp * this.numeroPessoas;
    return qtDeRefri;
    }
    /**
     * Ve contidade de suco em litros
     * @return qtsuco
     */
    public double sucos(){
    double sucopp = 0.6;
    double qtsuco;
    qtsuco = sucopp*this.numeroPessoas;
    return qtsuco;
    }
    /**
     * Ve agua em litros
     * @return qtagua 
     */
    public double agua(){
    double aguapp = 0.2;
    double qtagua;
    qtagua = aguapp*this.numeroPessoas;
    return qtagua;
    }
    /**
     * ve cerveja 
     * @return qtcerveja
     */
    public double cerveja(){
    double cervejapp = 0.8;
    double qtcerveja;
    qtcerveja = cervejapp*this.numeroPessoas;
    return qtcerveja;
    }
    /**
     * Ve vinho em garrafa
     * @return qtDegarrafa
     */
    public int vinho()
    {
    int qtDeGarrafa;
    qtDeGarrafa = this.numeroPessoas /5;
    return qtDeGarrafa;
    }
    
    /**
     * ve os coquitel
     * @return qtDeCoquitel
     */
    
    public int coquetel()
    {
    int qtDeCoquitel;
    qtDeCoquitel = this.numeroPessoas/20*4;
    return qtDeCoquitel;
    }
    /**
     * ve Quanta Vodka vai em garrafa
     * @return qrDeVodka
     */
    public int vodka()
    {
    int qtDeVodka;
    qtDeVodka = this.numeroPessoas/3;
    return qtDeVodka;
    }
    /**
     * ve qt wisky vai em garrafa
     * @return qtDewisky
     */
    public int wisky()
    {
    int qtDewisky;
    qtDewisky = this.numeroPessoas/10;
    return qtDewisky;
    }
    /**
     * ve qtd de copos de vidro
     * @return qtDeCoposv
     */
    public int qtdecoposVidro()
    {
    int qtDeCoposv;
    qtDeCoposv = this.numeroPessoas*3;
    return qtDeCoposv;
    }
    /**
     * Ve contidade de copos de plastico
     * @return qtDeCoposp
     */
    public int qtdecoposPlastico()
    {
    int qtDeCoposp;
    qtDeCoposp = this.numeroPessoas*5;
    return qtDeCoposp;
    }
    /**
     * Ve contidade de alcatra
     * @return qtpp
     */
    
    public double fileAlcatra()
    {
    double pp=0.4;
    double qtpp= this.numeroPessoas*pp;
    return qtpp;
    }
    /**
     * ve Qt linguica vai
     * @return qtpp
     */
    public double linguica()
    {
    double pp=0.031;
    double qtpp= this.numeroPessoas*pp;
    return qtpp;
    }
    /**
     * Ve qt picanha vai
     * @return qtpp
     */
    public double picanha()
    {
    double pp=0.101;
    double qtpp= this.numeroPessoas*pp;
    return qtpp;
    }
    
}

    
    
