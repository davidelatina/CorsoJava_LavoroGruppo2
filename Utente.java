import java.util.ArrayList;

public class Utente {
  // Attributi privati
  private String nome; // Nome dell’utente
  private String idUtente; // Identificativo univoco dell’utente
  private ArrayList<Risorsa> prestiti; // Lista delle risorse attualmente in prestito

  public Risorsa getResource(String id) {
    for (Risorsa risorsa : prestiti) {
      if (risorsa.getCodice().equals(id)) {
        return risorsa;
      }
    }
  }

  // Costruttore: inizializza nome, id e crea una lista vuota di prestiti
  public Utente(String nome, String idUtente) {
    this.nome = nome;
    this.idUtente = idUtente;
    this.prestiti = new ArrayList<>();
  }

  // Getter per il nome dell’utente
  public String getNome() {
    return nome;
  }

  // Getter per l’ID dell’utente
  public String getIdUtente() {
    return idUtente;
  }

  // Metodo per prendere in prestito una risorsa
  public void prendiInPrestito(Risorsa r) {
    prestiti.add(r); // metodo add per aggiungere una risorsa
    System.out.println(nome + " ha preso in prestito: " + r.getTitolo());
  }

  // Metodo per restituire una risorsa
  public Risorsa restituisci(Risorsa r) {
    Risorsa temp = r;
    prestiti.remove(r); // metodo remove per rimuovere una risorsa
    System.out.println(nome + " ha restituito: " + r.getTitolo());

    return r;
  }

  // Metodo per stampare tutte le risorse attualmente in prestito
  public void stampaPrestiti() {
    System.out.println("Prestiti di " + nome + ":");
    for (Risorsa r : prestiti) {// ciclo su risorse
      r.visualizzaDettagli(); // chiama il metodo corretto in base al tipo di risorsa
    }
  }
}
