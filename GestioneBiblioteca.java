import java.util.ArrayList;

public class GestioneBiblioteca {




  public static void main(String[] args) {
    




    // Inserimento e stampa di più risorse di diversi tipi e almeno due utenti.




    // Dimostrazione di tutte e tre le regole (incapsulamento, ereditarietà,
    // polimorfismo).
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
  
  void addUtente(String nomeUtente) {
    //utenti.add()
  }

  void addRisorsa(String nomeUtente) {
    // risorse.add()
  }

  void printResources() {
    for (Risorsa risorsa : risorse) {
      // risorsa.visualizzaDettagli()
    }
  }

  void searchResourceByName(String key) {
    for (Risorsa risorsa : risorse) {
      if (risorsa.getName().toLowerCase().contains(key.toLowerCase())) {
        
      }
    }
  }

}