/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contocorrentealessiopollastro;

/**
 *
 * @author pollastro.alessio
 */
public class Utente {

    private String nome;
    private String cognome;

    public Utente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String toString() {
        return "dati utente: " + nome + " - " + cognome;
    }
}
