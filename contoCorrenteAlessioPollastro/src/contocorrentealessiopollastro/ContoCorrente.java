/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contocorrentealessiopollastro;

/**
 *
 * @author pollastro.alessio
 */
public class ContoCorrente 
{
    private double capitale;
    
    public ContoCorrente(double capitale)
    {
        this.capitale = capitale;
    }
    
    public double getCapitale()
    {
        return capitale;  
    }
    
    public double Versamento(double capitale)
    {
        double versamento =(int)(Math.random()*500)+1;
        capitale += versamento;
        return this.capitale= capitale;
    }
    double prelievo=0;
    public double prelievo(double capitale,double prelievo)
    {
        if (capitale >= 0)
        {
            prelievo =(int)(Math.random()*500)+1;
        capitale -= prelievo;
        return capitale;
        }
        
        return capitale ;
    }
    
     public String toString()
    {
        return "il tuo saldo attuale: " + capitale + prelievo;
    }
}
