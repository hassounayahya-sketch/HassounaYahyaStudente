/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studente;

/**
 * La classe Studente gestisce i dati anagrafici e il rendimento scolastico 
 * di uno studente, inclusi i voti nelle diverse materie.
 * 
 * @author Hassouna Yahya
 * @version 1.0
 */
public class Studente 
{

    /** Nome dello studente */
    private String nome;

    /** Cognome dello studente */
    private String cognome;

    /** Anno di corso / classe */
    private int anno;

    /** Indirizzo di studio */
    private String indirizzo;

    /** Sezione della classe */
    private char sezione;

    /** Numero totale delle materie */
    private int numeroMaterie;

    /** Array contenente i voti interi (da 1 a 10) */
    private int[] voti;

    /** Contatore dei voti attualmente inseriti */
    private int indiceVoti;

    /**
     * Costruttore della classe Studente.
     * 
     * @param nome Il nome dello studente
     * @param cognome Il cognome dello studente
     * @param anno L'anno di corso
     * @param indirizzo L'indirizzo di studio
     * @param sezione La sezione
     * @param numeroMaterie Il numero massimo di materie/voti gestibili
     */
    public Studente(String nome, String cognome, int anno, String indirizzo, char sezione, int numeroMaterie) 
    {
        this.nome = nome;
        this.cognome = cognome;
        this.anno = anno;
        this.indirizzo = indirizzo;
        this.sezione = sezione;
        this.numeroMaterie = numeroMaterie;
        this.voti = new int[numeroMaterie];
        this.indiceVoti = 0;
    }

    /**
     * 1. Inserisce un nuovo voto nell'array (compreso tra 1 e 10).
     * 
     * @.param voto Il voto da inserire
     * @return true se inserito con successo, false altrimenti
     */
    public boolean inserisciVoto(int voto) 
    {
        if (voto >= 1 && voto <= 10 && this.indiceVoti < this.numeroMaterie) 
        {
            this.voti[this.indiceVoti] = voto;
            this.indiceVoti++;
            return true;
        }
        return false;
    }

    /**
     * 2. Calcola e restituisce la media dei voti inseriti.
     * 
     * @return La media dei voti, oppure 0 se non ci sono voti
     */
    public double calcolaMedia() 
    {
        if (this.indiceVoti == 0) 
        {
            return 0.0;
        }
        
        int somma = 0;
        for (int i = 0; i < this.indiceVoti; i++) 
        {
            somma += this.voti[i];
        }
        return (double) somma / this.indiceVoti;
    }

    /**
     * 3. Individua il voto più alto tra quelli inseriti.
     * 
     * @return Il voto massimo, o -1 se non ci sono voti
     */
    public int getVotoPiuAlto() 
    {
        if (this.indiceVoti == 0) 
        {
            return -1;
        }
        
        int max = this.voti[0];
        for (int i = 1; i < this.indiceVoti; i++) 
        {
            if (this.voti[i] > max) 
            {
                max = this.voti[i];
            }
        }
        return max;
    }

    /**
     * 3. Individua il voto più basso tra quelli inseriti.
     * 
     * @return Il voto minimo, o -1 se non ci sono voti
     */
    public int getVotoPiuBasso() 
    {
        if (this.indiceVoti == 0) 
        {
            return -1;
        }
        
        int min = this.voti[0];
        for (int i = 1; i < this.indiceVoti; i++) 
        {
            if (this.voti[i] < min) 
            {
                min = this.voti[i];
            }
        }
        return min;
    }

    /**
     * 4. Conta il numero di voti insufficienti (voto < 6).
     * 
     * @return Il numero di insufficienze
     */
    public int contaInsufficienti() 
    {
        int conteggio = 0;
        for (int i = 0; i < this.indiceVoti; i++) 
        {
            if (this.voti[i] < 6) 
            {
                conteggio++;
            }
        }
        return conteggio;
    }

    /**
     * 5. Stabilisce se lo studente ha una media sufficiente (media >= 6).
     * 
     * @return true se la media è >= 6, false altrimenti
     */
    public boolean haMediaSufficiente() 
    {
        return calcolaMedia() >= 6.0;
    }

    /**
     * 6. Restituisce una descrizione completa dello studente con i relativi voti.
     * 
     * @return Stringa descrittiva
     */
    public String getDescrizione() 
    {
        String stringaVoti = "";
        for (int i = 0; i < this.indiceVoti; i++) 
        {
            stringaVoti += this.voti[i] + " ";
        }
        
        return "Studente: " + nome + " " + cognome +
               "\nClasse: " + anno + " " + sezione + " - Indirizzo: " + indirizzo +
               "\nVoti: [" + stringaVoti() + "]" +
               "\nMedia: " + calcolaMedia();
    }

    /**
     * Restituisce il nome dello studente.
     * @return Nome
     */
    public String getNome() 
    {
        return nome;
    }

    /**
     * Restituisce il cognome dello studente.
     * @return Cognome
     */
    public String getCognome() 
    {
        return cognome;
    }
}

