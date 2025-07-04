import java.util.ArrayList;
import java.util.Scanner;

public class GestioneBiblioteca {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca("Digitale");

        int scelta;
        do {
            System.out.println("\nMENU BIBLIOTECA DIGITALE");
            System.out.println("Benvenuto! Cosa vuoi fare oggi?");
            System.out.println("1. Aggiungi libro");
            System.out.println("2. Aggiungi rivista");
            System.out.println("3. Aggiungi ebook");
            System.out.println("4. Aggiungi utente");
            System.out.println("5. Prestito risorsa a utente");
            System.out.println("6. Restituzione risorsa da utente");
            System.out.println("7. Stampa inventario biblioteca");
            System.out.println("8. Stampa risorse utente");
            System.out.println("9. Cerca risorsa per titolo");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            scelta = Integer.parseInt(scanner.nextLine());

            switch (scelta) {
                case 1 -> {
                    System.out.print("Titolo: ");
                    String titolo = scanner.nextLine();
                    System.out.print("Anno pubblicazione: ");
                    int anno = Integer.parseInt(scanner.nextLine());
                    System.out.print("Codice: ");
                    String codice = scanner.nextLine();
                    System.out.print("Autore: ");
                    String autore = scanner.nextLine();
                    biblioteca.aggiungiRisorsa(new Libro(titolo, anno, codice, autore));
                }
                case 2 -> {
                    System.out.print("Titolo: ");
                    String titolo = scanner.nextLine();
                    System.out.print("Anno pubblicazione: ");
                    int anno = Integer.parseInt(scanner.nextLine());
                    System.out.print("Codice: ");
                    String codice = scanner.nextLine();
                    System.out.print("Numero rivista: ");
                    int numero = Integer.parseInt(scanner.nextLine());
                    biblioteca.aggiungiRisorsa(new Rivista(titolo, anno, codice, numero));
                }
                case 3 -> {
                    System.out.print("Titolo: ");
                    String titolo = scanner.nextLine();
                    System.out.print("Anno pubblicazione: ");
                    int anno = Integer.parseInt(scanner.nextLine());
                    System.out.print("Codice: ");
                    String codice = scanner.nextLine();
                    System.out.print("Formato (PDF, EPUB): ");
                    String formato = scanner.nextLine();
                    biblioteca.aggiungiRisorsa(new Ebook(titolo, anno, codice, formato));
                }
                case 4 -> {
                    System.out.print("Nome utente: ");
                    String nome = scanner.nextLine();
                    System.out.print("ID utente: ");
                    String id = scanner.nextLine();
                    biblioteca.aggiungiUtente(new Utente(nome, id));
                }
                case 5 -> {
                    System.out.print("ID utente: ");
                    String id = scanner.nextLine();
                    System.out.print("Codice risorsa: ");
                    String codice = scanner.nextLine();
                    biblioteca.prestaRisorsa(id, codice);
                }
                case 6 -> {
                    System.out.print("ID utente: ");
                    String id = scanner.nextLine();
                    System.out.print("Codice risorsa da restituire: ");
                    String codice = scanner.nextLine();
                    biblioteca.restituisciRisorsa(id, codice);
                }
                case 7 -> biblioteca.stampaInventario();
                case 8 -> {
                    System.out.print("ID utente: ");
                    String id = scanner.nextLine();
                    biblioteca.stampaRisorseUtente(id);
                }
                case 9 -> {
                    System.out.print("Titolo da cercare: ");
                    String titolo = scanner.nextLine();
                    biblioteca.cercaPerTitolo(titolo);
                }
                case 0 -> System.out.println("Uscita...");
                default -> System.out.println("Scelta non valida.");
            }

        } while (scelta != 0);

        scanner.close();
    }
}


class Biblioteca {


  String nome; 
  ArrayList<Risorsa> risorse;
  ArrayList<Utente> utenti;

  /*
  Metodi per
  aggiungere risorse/utenti,
  stampare l’inventario completo (usando il polimorfismo su visualizzaDettagli), cercare risorse per titolo.
  */

  Biblioteca(String nome) {
    this.nome = nome;
  }
  
  public void prestaRisorsa(String id, String codice) {
    
    for (Utente u : utenti) {
      if (u.getIdUtente().equals(id)) {

      }
    }
    
  }

  void restituisciRisorsa(String id, String codice) {
    // controlla id
    boolean cont = false;
    for (Utente u : utenti) {
      if (u.getIdUtente().equals(id)) {
        cont = true;
        break;
      }
    }
    if (!cont) {
      return;
    }
    // controlla codice
    Utente u = getUserFromId(id);

    for (Risorsa risorsa : risorse) {
      if () {
        getRe
      }
    }

    // restituisci


    restituisci(r);



  }

  Utente getUserFromId(String id) {
    for (Utente utente : utenti) {
      if (utente.getIdUtente().equals(id)) {
        return utente;
      }
      
    }
    return utenti.get(0);
  }

  void stampaRisorseUtente(String id) {
    Utente u = getUserFromId(id);

    for (Utente utente : utenti) {
      if (utente.equals(u)) {
        u.stampaPrestiti();
      }
    }
  }

  void aggiungiUtente(Utente utente) {
    utenti.add(utente);
    //utenti.add()
  }

  void aggiungiRisorsa(Risorsa r) {
    risorse.add(r);
  }

  void stampaInventario() {
    for (Risorsa risorsa : risorse) {
      risorsa.visualizzaDettagli();
    }
  }

  void cercaPerTitolo(String key) {

    System.out.println("Risultato ricerca: ");
    for (Risorsa risorsa : risorse) {
      if () {
        // risorsa.visualizzaDettagli()
      }
    }
  }
/*
  void searchResourceByAuthor(String key) {

    System.out.println("Risultato ricerca: ");
    for (Risorsa risorsa : risorse) {
      if (risorsa.getAuthor().toLowerCase().contains(key.toLowerCase())) {
        // risorsa.visualizzaDettagli()
      }
    }
  }
*/
}