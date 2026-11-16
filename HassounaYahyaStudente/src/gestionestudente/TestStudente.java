/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionestudente;

import studente.Studente;

/**
 * La classe TestStudente testa le funzionalità della classe Studente 
 * creando due oggetti, inserendo i voti e confrontandoli.
 * 
 * @author Hassouna Yahya
 * @version 1.0
 */
public class TestStudente 
{

    /**
     * Metodo main per l'esecuzione dei test.
     * 
     * @param args Argomenti da riga di comando
     */
    public static void main(String[] args) 
    {
        // 1. Creazione di due oggetti Studente
        Studente studente1 = new Studente("Mario", "Rossi", 3, "Informatica", 'A', 5);
        Studente studente2 = new Studente("Luigi", "Verdi", 3, "Informatica", 'A', 5);

        // 2. Inserimento dei voti per ciascuno studente
        studente1.inserisciVoto(7);
        studente1.inserisciVoto(8);
        studente1.inserisciVoto(6);
        studente1.inserisciVoto(9);

        studente2.inserisciVoto(5);
        studente2.inserisciVoto(6);
        studente2.inserisciVoto(4);
        studente2.inserisciVoto(7);

        // 3. Visualizzazione informazioni e risultati delle elaborazioni
        System.out.println("Studente 1");
        System.out.println(studente1.getDescrizione());
        System.out.println("Voto più alto: " + studente1.getVotoPiuAlto());
        System.out.println("Voto più basso: " + studente1.getVotoPiuBasso());
        System.out.println("Numero insufficienze: " + studente1.contaInsufficienti());
        System.out.println("Media sufficiente? " + (studente1.haMediaSufficiente() ? "Sì" : "No"));

        System.out.println("\n=== INFORMAZIONI STUDENTE 2 ===");
        System.out.println(studente2.getDescrizione());
        System.out.println("Voto più alto: " + studente2.getVotoPiuAlto());
        System.out.println("Voto più basso: " + studente2.getVotoPiuBasso());
        System.out.println("Numero insufficienze: " + studente2.contaInsufficienti());
        System.out.println("Media sufficiente? " + (studente2.haMediaSufficiente() ? "Sì" : "No"));

        // 4. Confronto tra i due studenti e gestione della parità
        System.out.println("\n=== CONFRONTO MEDIE ===");
        double media1 = studente1.calcolaMedia();
        double media2 = studente2.calcolaMedia();

        if (media1 > media2) 
        {
            System.out.println("Lo studente con la media più alta è: " + studente1.getNome() + " " + studente1.getCognome() + " (" + media1 + ")");
        } 
        else if (media2 > media1) 
        {
            System.out.println("Lo studente con la media più alta è: " + studente2.getNome() + " " + studente2.getCognome() + " (" + media2 + ")");
        } 
        else 
        {
            System.out.println("I due studenti hanno la stessa media: " + media1);
        }
    }
}


