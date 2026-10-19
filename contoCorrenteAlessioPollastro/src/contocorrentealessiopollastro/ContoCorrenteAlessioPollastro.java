/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contocorrentealessiopollastro;

/**
 *
 * @author pollastro.alessio
 */
public class ContoCorrenteAlessioPollastro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ContoCorrente conto = new ContoCorrente(2000);
        Utente utente1 = new Utente("alessio","pollastro");
        
        
        System.out.println(""+utente1 +"\n" + conto);
    }
    
}
